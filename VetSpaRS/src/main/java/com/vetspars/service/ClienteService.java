package com.vetspars.service;

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
public class ClienteService implements EntityService {

	public ClienteService() {
	}

	@POST
	@Path("new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response insert(Object toInsert) {
		// TODO Auto-generated method stub
		return null;
	}

	@DELETE
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(Object toUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@DELETE
	@Path("delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam(value = "id") Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@GET
	@Path("find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response find(@PathParam(value = "id") Object id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@GET
	@Path("findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		return Response
				.status(Status.OK)
				.entity(Arrays.asList("1", "2", "3"))
				.build();
	}

}
