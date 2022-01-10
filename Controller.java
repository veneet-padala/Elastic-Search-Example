package com.veneet.java101.controller;

import java.util.ArrayList;

import com.veneet.java101.model.Beach;
import com.veneet.java101.model.Island;

public class Controller {
	public static void main(String args[]) {
		
		Beach beach = new Beach();
		Beach beach2 = new Beach();
		Beach beach3 = new Beach();
		Beach beach4 = new Beach();
		
		beach.setBeachName("RainbowBeach");
		beach2.setBeachName("Venky Beach");
		beach3.setBeachName("Jags Beach");
		beach4.setBeachName("Ramas Beach");
		
		System.out.println("Name: " + beach.getBeachName());
		
		beach.setSnorkle(true);
		
		System.out.println(beach.isSnorkle());
		
		if ( beach.isSnorkle() == true) {
			System.out.println("Snorkling is allowed");
			}
			else {
			System.out.println("Snorkling is not allowed");
			}
		
		System.out.println(beach);
		
		
		Island island = new Island();
		
		island.setIslandName("St.Croix");
		
		System.out.println("Island name is "+island.getIslandName());
		
		island.setCode("DFW");
		
		System.out.println("The airport code is "+island.getCode());
		
		island.setSizeInMiles(2000);
		
		System.out.println("The size in miles of the island is "+island.getSizeInMiles());
		
		System.out.println(island);
		
		System.out.println(beach);
		
		
			Beach myBeach = new Beach("St. Croix","DFW",2000,"TurtleBeach",(true));
			System.out.println(myBeach); 
			//System.out.println(myIsland.code);
			//System.out.println(myIsland.sizeInMiles);
			
			
			
		   // Beach myObj = new Beach();
		   // System.out.println(myObj.sizeInMilesOfBeach);
			
		
			
			 //Beach myComment = new Beach();
			//	myComment.addComments("Good beach");
				
				
				
		//Array List
				ArrayList<Beach> beachsAL = new ArrayList<Beach>();
			
				beachsAL.add(beach);
				beachsAL.add(beach2);
				beachsAL.add(beach3);
				beachsAL.add(beach4);
				
				System.out.println(myBeach);
				
				//System.out.println(beachsAL);
				
				//beachsAL.add(beach.setBeachName("beachName"));
				
				System.out.println("List of Beachs:-");
		        for (int i=0; i<beachsAL.size(); i++) {
		            System.out.println(beachsAL.get(i));
		        }
		        
		        beach.display(beachsAL);
				
				
				
				
				
				
				
				//for (Beach beach1: beachsAL) {
				//	System.out.println(beach1);
				//}
				
				
				
				
				
				
				
		
		
	}

}
