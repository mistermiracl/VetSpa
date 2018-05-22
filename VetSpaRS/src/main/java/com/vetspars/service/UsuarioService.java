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
public class UsuarioService {//implements EntityService<UsuarioModel>
	
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
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public int insert(UsuarioModel toInsert) {
		return 0;
	}

	@DELETE
	@Path("update")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public boolean update(UsuarioModel toUpdate) {
		return true;
	}

	@DELETE
	@Path("delete/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public boolean delete(@PathParam(value = "id") int id) {
		return true;
	}

	@GET
	@Path("find/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public UsuarioModel find(@PathParam(value = "id") int id) {
		return null;
	}
	
	@GET
	@Path("findAll")
	@Produces(MediaType.APPLICATION_XML)
	public List<UsuarioModel> findAll() {
		return Arrays.asList(new UsuarioModel(), new UsuarioModel(), new UsuarioModel());
	}
}
