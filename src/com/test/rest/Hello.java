package com.test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

	@GET
	@Path("/User")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayPlainTextAj() {

		return "First Rest Program";

	}
}
