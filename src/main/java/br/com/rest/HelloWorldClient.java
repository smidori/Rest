package br.com.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class HelloWorldClient {	
	//private HttpServer server;
	private Client client;
	private WebTarget target;
	private String urlFixa = "http://localhost:8080/Rest";
	
	public static void main(String[] args) {
		HelloWorldClient h = new HelloWorldClient();
		h.testa();
	}
	
	public void testa(){
		
		client = ClientBuilder.newClient();
		target = client.target(urlFixa);
		String resultado = target.path("/ws/server/silvia1").toString();
		System.out.println("resultado: " + resultado);
		//WebTarget messages = client.target(urlFixa).path("ws").path("server").path("{nome}");
		//WebTarget msg123 = messages.resolveTemplate("nome", "Silvia");
		
		   //Response res = 
				   //.request("text/plain").get();
	}
	

}
