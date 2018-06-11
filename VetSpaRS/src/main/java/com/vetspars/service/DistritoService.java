package com.vetspars.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vetspaejb.entity.Distrito;
import com.vetspaejb.facade.DistritoFacadeLocal;
import com.vetspars.constant.ResponseCode;
import com.vetspars.constant.ResponseMessage;
import com.vetspars.model.DistritoModel;
import com.vetspars.model.VetSpaResponse;

@ManagedBean
@RequestScoped
@Path("DistritoService")
public class DistritoService implements EntityService<DistritoModel>{

	@EJB
	private DistritoFacadeLocal distritoFacade;
	
	public DistritoService() {
	}

	@POST
	@Path("new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public VetSpaResponse<Object> insert(DistritoModel toInsert) {
		distritoFacade.create(new Distrito(toInsert.getCodigo(), toInsert.getNombre()));
		return new VetSpaResponse<Object>(
				ResponseCode.SUCCESS, 
				ResponseMessage.OPERATION_SUCCESSFUL, 
				true);
	}

	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public VetSpaResponse<Object> update(DistritoModel toUpdate) {
		boolean result = distritoFacade.edit(new Distrito(toUpdate.getCodigo(), toUpdate.getNombre()));
		if(result) {
			return new VetSpaResponse<>(ResponseCode.SUCCESS, ResponseMessage.OPERATION_SUCCESSFUL, result);
		} else {
			return new VetSpaResponse<>(ResponseCode.ERROR, ResponseMessage.OPERATION_ERROR, result);
		}
	}

	@DELETE
	@Path("delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public VetSpaResponse<Object> delete(int id) {
		boolean result = distritoFacade.remove(id);
		if(result) {
			return new VetSpaResponse<>(ResponseCode.SUCCESS, ResponseMessage.OPERATION_SUCCESSFUL, result);
		} else {
			return new VetSpaResponse<>(ResponseCode.ERROR, ResponseMessage.OPERATION_ERROR, result);
		}
	}

	@GET
	@Path("find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public VetSpaResponse<DistritoModel> find(int id) {
		Distrito dis = distritoFacade.find(id);
		if(dis != null) {
			return new VetSpaResponse<DistritoModel>(ResponseCode.SUCCESS, ResponseMessage.OPERATION_SUCCESSFUL, 
					new DistritoModel(dis.getCodigo(), dis.getNombre()));
		} else {
			return new VetSpaResponse<DistritoModel>(ResponseCode.ERROR, ResponseMessage.OPERATION_ERROR, null);
		}
	}

	@GET
	@Path("findAll")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public VetSpaResponse<List<DistritoModel>> findAll() {
		List<Distrito> distritos = distritoFacade.findAll();
		
		if(distritos != null) {
			return new VetSpaResponse<List<DistritoModel>>(ResponseCode.SUCCESS, ResponseMessage.OPERATION_SUCCESSFUL, 
					distritos.stream().map(d -> {
						return new DistritoModel(d.getCodigo(), d.getNombre());
					}).collect(Collectors.toList()));
		} else {
			return new VetSpaResponse<>(ResponseCode.ERROR, ResponseMessage.OPERATION_ERROR, null);
		}
	}
	
	
	
}
