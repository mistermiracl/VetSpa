package com.vetspars.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
//GLASSFISH ONLY
//import org.glassfish.jersey.jackson.JacksonFeature;
//import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class ApplicationConfig extends Application {//ResourceConfig {

	private Set<Class<?>> classes;
	
	public ApplicationConfig() {
		classes = new HashSet<>();
		classes.add(ClienteService.class);
		classes.add(DistritoService.class);
		classes.add(UsuarioService.class);
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}
	
	/*public ApplicationConfig() {
		register(JacksonFeature.class);
		packages(this.getClass().getPackage().getName());
	}*/
}
