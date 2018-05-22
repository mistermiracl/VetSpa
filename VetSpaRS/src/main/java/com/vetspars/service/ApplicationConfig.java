package com.vetspars.service;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig() {
		register(JacksonFeature.class);
		packages(this.getClass().getPackage().getName());
	}

}
