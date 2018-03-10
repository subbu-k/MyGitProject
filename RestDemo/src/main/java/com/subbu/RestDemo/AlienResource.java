package com.subbu.RestDemo;

import java.util.List;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource
{
	AlienRepository repo= new AlienRepository(); 
	Alien_Db_Repository  repodb= new Alien_Db_Repository();
	
@GET
@Produces(MediaType.APPLICATION_XML)
//@Produces(MediaType.APPLICATION_JSON)
public List<Alien> getAliens() {
//return repo.getAliens();
	
	return repodb.getAliens();
}
@GET
@Path("alien/{id}")
@Produces(MediaType.APPLICATION_XML)
public Alien getAlien(@PathParam("id") int id) {
	//return repo.getAlien(id);
	return repodb.getAlien(id);
}


@POST
@Path("alien")
public Alien createAlien(Alien a) {
	System.out.println("Alien getting created...");
     //repo.create(a);
	repodb.createAlien(a);
	
	System.out.println(a);
	return a;
	}


}
