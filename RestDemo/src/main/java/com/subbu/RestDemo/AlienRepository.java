package com.subbu.RestDemo;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

	List <Alien> aliens = new ArrayList<>();
	
	
	public AlienRepository() {

aliens.add(new Alien(101,"Subramanyam",50));
aliens.add(new Alien(102,"Vishnu",70));
aliens.add(new Alien(103,"Anket",60));
aliens.add(new Alien(104,"Dinesh",80));
	
	}
	
	

public void create(Alien a) {
	
	
	
	System.out.println("it reached to repository");
	
	aliens.add(a);
	
	

}

public List<Alien> getAliens(){
	return aliens;
}

public Alien getAlien(int id)
{
	
	for(Alien a:aliens) 
	{
	 	if(a.getId()==id) 		
	 	{
		 return a; 
	 	}
	}
	return new Alien();
}




}



