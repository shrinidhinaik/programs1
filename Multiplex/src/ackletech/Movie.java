package ackletech;

public class Movie {
        
	      String title;
	      String production;
	      String certificate;
	      String language;
	   
	  Movie (String title,String production,String certificate,String language)
	  {
		  this.title=title;
		  this.production=production;
		  this.certificate=certificate;
		  this.language=language;
	  }

}

 class Screen
 {
	
	int screenNum;
	 int capacity;
	 Movie[] m=new Movie[2];
	 Screen (int screenNum,int capacity)
	 {
		 this.screenNum=screenNum;
		 this.capacity=capacity;
	 }
 }	
 
 class Multiplex
 {
	 String name;
	 String city;
	 Screen[] s=new  Screen[2];
	 Multiplex (String name,String city){
		 this.name=name;
		 this.city=city;
		 
	 }
	 
 }	 
	    
	 
	 
	 
	 
	 
	 
	 
	 
 
