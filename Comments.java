package com.veneet.java101.model;


interface Comments {
	
	
	 public default void addComments(String comment) {
		 
			System.out.println(comment);
			 
		 }

}