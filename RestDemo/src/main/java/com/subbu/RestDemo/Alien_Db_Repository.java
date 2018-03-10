package com.subbu.RestDemo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.subbu.RestDemo.db.ConnectionFactory;
public class Alien_Db_Repository 
{

	

	List<Alien> alienList;
	public List<Alien> getAliens(){
		 
		alienList= new ArrayList<>();
		String query="select * from alien";
			try {
				ResultSet rs= ConnectionFactory.getStatement().executeQuery(query);
				while(rs.next()) {
				alienList.add(new Alien(rs.getInt(1),rs.getString(2),rs.getInt(3)));
				}
				return alienList;
			}
				catch( SQLException e){
						e.printStackTrace();
					}
			return null;
	}
	
  public Alien createAlien(Alien a) {
	  	try {
			ConnectionFactory.getStatement().executeUpdate("insert into Alien values('"+a.getId()+"','"+a.getName()+"','"+a.getPoints()+"')");
			return a;
	  		}
	  	catch( SQLException e)
	  		{
			e.printStackTrace();
	  		}
	return null;
  	}

public Alien getAlien( int id) {
	List<Alien> alien= new Alien_Db_Repository().getAliens();
	
	for(Alien a: alien) {
		    if(a.getId()==id) {
			System.out.println(a);
			return a;
		}
	}
		return new Alien();
	}
	
}