package com.vetspars.service;

import com.vetspars.model.ClienteModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("ClienteService")
public class ClienteService {//implements EntityService<ClienteModel> 

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
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public int insert(ClienteModel toInsert) {
		// TODO Auto-generated method stub
		return 0;
	}

	@DELETE
	@Path("update")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public boolean update(ClienteModel toUpdate) {
		// TODO Auto-generated method stub
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
	public ClienteModel find(@PathParam(value = "id") int id) {
		return null;
	}
	
	@GET
	@Path("findAll")
	@Produces(MediaType.APPLICATION_XML)
	public List<ClienteModel> findAll() {
		return new ArrayList<ClienteModel>();
	}

}
