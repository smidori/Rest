package br.com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("server")
public class HelloWorldServer {	
	
	@Path("{nome}")
	@GET
	//@Produces(MediaType.APPLICATION_XML)
	@Produces("text/html")
	public String obtemSaudacao(@PathParam("nome")  String nome){
		String saudacao = "Ola ";		
		return saudacao + nome; 
	}

}
