package com.vetspaws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class Anything {

	@WebMethod
	public String greet(String name) {
		return String.format("Hello %s", name == null || name == "" ? "World" : name);
	}
	
}
