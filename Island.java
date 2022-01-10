package com.veneet.java101.model;


public class Island {
	
	
		String islandName = "St.croix";
		String code = "DFW";
		int sizeInMiles = 2000;
		
		
		public String getIslandName() {
			return islandName;
		}
		public void setIslandName(String islandName) {
			this.islandName = islandName;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public int getSizeInMiles() {
			return sizeInMiles;
		}
		public void setSizeInMiles(int sizeInMiles) {
			this.sizeInMiles = sizeInMiles;
		}
		
		public String toString(){//overriding the toString() method  
			  return "The name of the island is "+islandName+" "+" The airport code for the island is "+code+" and the size in miles of the island is "+sizeInMiles;  
			 }  
		
		
}


