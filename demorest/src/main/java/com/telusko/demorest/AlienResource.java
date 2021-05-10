package com.telusko.demorest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	
	AlienRepository repo=new AlienRepository();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alien> getAliens() throws SQLException
	{
		System.out.println("Hello");
		return repo.getAliens();
	}
	
	
	
	@GET
	@Path("alien/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Alien getAlien(@PathParam("id") int id) throws SQLException
	{
		
		return repo.getAlien(id);
	}
@POST
@Path("alien")
@Consumes(MediaType.APPLICATION_JSON)
public Alien createAlien(Alien a1) throws SQLException

{
	repo.create(a1);
	return a1;
}

}
