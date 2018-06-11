package com.vetspars.service;

import com.vetspaejb.entity.Cliente;
import com.vetspaejb.entity.Distrito;
import com.vetspaejb.facade.ClienteFacadeLocal;
import com.vetspars.constant.ResponseCode;
import com.vetspars.constant.ResponseMessage;
import com.vetspars.model.ClienteModel;
import com.vetspars.model.DistritoModel;
import com.vetspars.model.VetSpaResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.Produces;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@ManagedBean
@RequestScoped
@Path("ClienteService")
public class ClienteService implements EntityService<ClienteModel> { 

	@EJB
	private ClienteFacadeLocal clienteFacade;
	
	public ClienteService() {
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld() {
		return "Hello World";
	}
	
	@GET
	@Path("{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld(@PathParam("name") String name) {
		return "Hello " + (name != null ? name : "World");
	}
	
	@POST
	@Path("new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public VetSpaResponse<Object> insert(ClienteModel toInsert) {
		Cliente cli = new Cliente(
				null, 
				toInsert.getDni(), 
				toInsert.getNombre(), 
				toInsert.getNombreSeg(), 
				toInsert.getApellidoPat(), 
				toInsert.getApellidoMat(), 
				toInsert.getFechaNac(), 
				toInsert.getSexo(), 
				toInsert.getCelular(), 
				toInsert.getDireccion(), 
				new Distrito(toInsert.getDistrito().getCodigo(), toInsert.getDistrito().getNombre()));
		clienteFacade.create(cli);
		
		if(cli.getId()!= null && cli.getId() > 0) {
			return new VetSpaResponse<>(ResponseCode.SUCCESS, ResponseMessage.OPERATION_SUCCESSFUL, cli.getId());
		} else {
			return new VetSpaResponse<>(ResponseCode.ERROR, ResponseMessage.OPERATION_ERROR, cli.getId());
		}
	}

	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public VetSpaResponse<Object> update(ClienteModel toUpdate) {
		Cliente cli = new Cliente(
				toUpdate.getId(), 
				toUpdate.getDni(), 
				toUpdate.getNombre(), 
				toUpdate.getNombreSeg(), 
				toUpdate.getApellidoPat(), 
				toUpdate.getApellidoMat(), 
				toUpdate.getFechaNac(), 
				toUpdate.getSexo(), 
				toUpdate.getCelular(), 
				toUpdate.getDireccion(), 
				new Distrito(toUpdate.getDistrito().getCodigo(), toUpdate.getDistrito().getNombre()));
		boolean result = clienteFacade.edit(cli);
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
	public VetSpaResponse<Object> delete(@PathParam(value = "id") int id) {
		boolean result = clienteFacade.remove(id);
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
	public VetSpaResponse<ClienteModel> find(@PathParam(value = "id") int id) {
		Cliente cli = clienteFacade.find(id);
		if(cli != null) {
			return new VetSpaResponse<>(ResponseCode.SUCCESS, ResponseMessage.OPERATION_SUCCESSFUL,
					new ClienteModel(
							cli.getId(), 
							cli.getDni(), 
							cli.getNombre(), 
							cli.getNombreSeg(), 
							cli.getApellidoPat(), 
							cli.getApellidoMat(), 
							cli.getFechaNac(), 
							cli.getSexo(), 
							cli.getCelular(), 
							cli.getDireccion(), 
							new DistritoModel(cli.getDistrito().getCodigo(), cli.getDistrito().getNombre())));
		} else {
			return new VetSpaResponse<>(ResponseCode.ERROR, ResponseMessage.OPERATION_ERROR, null);
		}
	}
	
	@GET
	@Path("findAll")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public VetSpaResponse<List<ClienteModel>> findAll() {
		List<Cliente> lCliente = clienteFacade.findAll();
		if(lCliente != null) {
			return new VetSpaResponse<List<ClienteModel>>(ResponseCode.SUCCESS, ResponseMessage.OPERATION_SUCCESSFUL,
					lCliente.stream().map(c -> {
						return new ClienteModel(
								c.getId(), 
								c.getDni(), 
								c.getNombre(), 
								c.getNombreSeg(), 
								c.getApellidoPat(), 
								c.getApellidoMat(), 
								c.getFechaNac(), 
								c.getSexo(), 
								c.getCelular(), 
								c.getDireccion(), 
								new DistritoModel(c.getDistrito().getCodigo(), c.getDistrito().getNombre()));
					}).collect(Collectors.toList()));
		} else {			
			return new VetSpaResponse<List<ClienteModel>>(ResponseCode.ERROR, ResponseMessage.OPERATION_ERROR, null);
		}
	}

}
