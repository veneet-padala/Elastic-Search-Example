package com.veneet.java101.model;


import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName = "veneet", createIndex = true)
public class Beach extends Island implements Comments {
	
	
	
		 public void addComments(String comment) {
			 
			 
			 
			System.out.println(comment);
			 
		 }
		
		 public void display(ArrayList<Beach> beachsAL) {
				
				
				for(Beach myBeach : beachsAL) {
					System.out.println(myBeach);
				}
				
				
			}
	
	
		
		public Beach(){
			
		
			//System.out.println("Beach test");
		
			
			
		}
		
		
	
	
	
	int sizeInMilesOfBeach;
	
	
	
	public Beach(String islandName, String code,  int sizeInMilesofBeach, String beachName, Boolean snorkle){
		
		this.sizeInMilesOfBeach = 2000;	
		this.islandName = islandName;
		this.code = code;
		this.beachName = beachName;
		this.snorkle = snorkle;
		
		
	}
	@Id
	private String beachName;
	private boolean snorkle;
	public String getBeachName() {
		return beachName;
	}
	public void setBeachName(String beachName) {
		this.beachName = beachName;
	}
	public boolean isSnorkle() {
		return snorkle;
	}
	public void setSnorkle(boolean snorkle) {
		this.snorkle = snorkle;
	}
	
	public String toString(){//overriding the toString() method  
		  return "Beach Name is "+beachName+" "+" can you snorkle here? "+snorkle+" "+"Island name is"+" "+islandName+" "+"The airport code is"+" "+code+" "+"The size of the island in miles is"+" "+sizeInMiles;  
		 }




	
	
	//public static void main(String[] args) {
		//Beach myIsland = new("St. Croix");
		//System.out.println(myIsland.islandName);
	   // Beach myObj = new Beach();
	   // System.out.println(myObj.sizeInMilesOfBeach);
	 // }
	
}

