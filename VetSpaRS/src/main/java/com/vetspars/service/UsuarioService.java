package com.vetspars.service;

import com.vetspars.model.UsuarioModel;
import javax.ws.rs.Produces;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("UsuarioService")
public class UsuarioService implements EntityService<UsuarioModel> {
	
	public UsuarioService() {
	}
	
	@POST
	@Path("new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int insert(UsuarioModel toInsert) {
		return 0;
	}

	@DELETE
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean update(UsuarioModel toUpdate) {
		return true;
	}

	@DELETE
	@Path("delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean delete(@PathParam(value = "id") Object id) {
		return true;
	}

	@GET
	@Path("find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public UsuarioModel find(@PathParam(value = "id") Object id) {
		return null;
	}
	
	@GET
	@Path("findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UsuarioModel> findAll() {
		return Arrays.asList(new UsuarioModel(), new UsuarioModel(), new UsuarioModel());
	}
}
