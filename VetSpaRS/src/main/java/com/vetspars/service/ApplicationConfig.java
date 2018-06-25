package com.vetspars.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.vetspars.filter.CORSFilter;
//GLASSFISH ONLY
//import org.glassfish.jersey.jackson.JacksonFeature;
//import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class ApplicationConfig extends Application {//ResourceConfig {

	private Set<Class<?>> resources;
	private Set<Object> singletons;
	
	public ApplicationConfig() {
		resources = new HashSet<>();
		resources.add(ClienteService.class);
		resources.add(DistritoService.class);
		resources.add(UsuarioService.class);
		
		singletons = new HashSet<>();
		singletons.add(new CORSFilter());
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return resources;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
	
	/*public ApplicationConfig() {
		register(JacksonFeature.class);
		packages(this.getClass().getPackage().getName());
	}*/
}
