package com.vetspars.service;

import com.vetspaejb.entity.Usuario;
import com.vetspaejb.facade.UsuarioFacadeLocal;
import com.vetspars.constant.ResponseCode;
import com.vetspars.constant.ResponseMessage;
import com.vetspars.model.UsuarioModel;
import com.vetspars.model.VetSpaResponse;

import javax.ws.rs.Produces;

import java.util.Arrays;
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
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@ManagedBean
@RequestScoped
@Path("UsuarioService")
public class UsuarioService implements EntityService<UsuarioModel> {
	
	@EJB
	private UsuarioFacadeLocal usuarioFacade;
	
	public UsuarioService() {
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
	public VetSpaResponse<Object> insert(UsuarioModel toInsert) {
		Usuario user = new Usuario(null, toInsert.getUsername(), toInsert.getPass());
		usuarioFacade.create(user);
		if(user.getId() != null && user.getId() > 0) {
			return new VetSpaResponse<Object>(ResponseCode.SUCCESS, ResponseMessage.OPERATION_SUCCESSFUL, user.getId());
		} else {
			return new VetSpaResponse<Object>(ResponseCode.ERROR, ResponseMessage.OPERATION_ERROR, user.getId());
		}
	}

	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public VetSpaResponse<Object> update(UsuarioModel toUpdate) {
		Usuario user = new Usuario(toUpdate.getId(), toUpdate.getUsername(), toUpdate.getPass());
		boolean result = usuarioFacade.edit(user);
		if(result) {
			return new VetSpaResponse<Object>(ResponseCode.SUCCESS, ResponseMessage.OPERATION_SUCCESSFUL, result);
		} else {
			return new VetSpaResponse<Object>(ResponseCode.ERROR, ResponseMessage.OPERATION_ERROR, result);
		}
	}

	@DELETE
	@Path("delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public VetSpaResponse<Object> delete(@PathParam(value = "id") int id) {
		boolean result = usuarioFacade.remove(id);
		if(result) {
			return new VetSpaResponse<Object>(ResponseCode.SUCCESS, ResponseMessage.OPERATION_SUCCESSFUL, result);
		} else {
			return new VetSpaResponse<Object>(ResponseCode.ERROR, ResponseMessage.OPERATION_ERROR, result);
		}
	}

	@GET
	@Path("find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public VetSpaResponse<UsuarioModel> find(@PathParam(value = "id") int id) {
		Usuario user = usuarioFacade.find(id);
		if(user != null) {
			return new VetSpaResponse<>(ResponseCode.SUCCESS, ResponseMessage.OPERATION_SUCCESSFUL,
					new UsuarioModel(user.getId(), user.getUsername(), user.getPass()));
		} else {
			return new VetSpaResponse<>(ResponseCode.ERROR, ResponseMessage.OPERATION_ERROR, null);
		}
	}
	
	@GET
	@Path("findAll")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public VetSpaResponse<List<UsuarioModel>> findAll() {
		List<Usuario> lUser = usuarioFacade.findAll();
		if(lUser != null) {
			return new VetSpaResponse<>(ResponseCode.SUCCESS, ResponseMessage.OPERATION_SUCCESSFUL,
					lUser.stream().map(u -> {
						return new UsuarioModel(u.getId(), u.getUsername(), u.getPass());
					}).collect(Collectors.toList()));
		} else {
			return new VetSpaResponse<>(ResponseCode.ERROR, ResponseMessage.OPERATION_ERROR, null);
		}
	}

}
