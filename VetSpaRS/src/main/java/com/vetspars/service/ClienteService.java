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
public class ClienteService implements EntityService<ClienteModel> {

	public ClienteService() {
	}

	@POST
	@Path("new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int insert(ClienteModel toInsert) {
		// TODO Auto-generated method stub
		return 0;
	}

	@DELETE
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean update(ClienteModel toUpdate) {
		// TODO Auto-generated method stub
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
	public ClienteModel find(@PathParam(value = "id") Object id) {
		return null;
	}
	
	@GET
	@Path("findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ClienteModel> findAll() {
		return new ArrayList<ClienteModel>();
	}

}
