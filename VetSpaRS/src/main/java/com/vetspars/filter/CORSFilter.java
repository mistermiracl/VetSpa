package com.vetspars.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class CORSFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext req, ContainerResponseContext res) throws IOException {
		res.getHeaders().add("Access-Control-Allow-Origin", "*");
	    res.getHeaders().add("Access-Control-Allow-Headers", "Content-Type, Accept");
	    res.getHeaders().add("Access-Control-Allow-Methods", "OPTIONS, GET, POST, PUT, DELETE");
	}

}
