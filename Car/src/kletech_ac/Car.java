package kletech_ac;

public class Car {
	     String colour;
	     String name;
	     int noOfSeats;
	     int maxspeed;
	     double speed;
	     
	   Car(String colour,String name,int noOfSeats,int maxspeed)
	   {
		   this.colour=colour;
		   this.name=name;
		   this.noOfSeats=noOfSeats;
		   this.maxspeed=maxspeed;
	   }
	   
	   
	   void accelerate()
	   {
		   
	   }
	     
	   void powerbreak()
	   {
		   
	   }

}
class Ferrari extends Car
{
	Ferrari(String colour,String name, int noOfseats,int maxspeed)
	{
		super(colour,name,noOfseats,maxspeed);
	}	
		
     void accelerate()
     {
    	 speed=speed+3;
    	 if(speed>=maxspeed)
    	 speed=maxspeed;
    	 
     }	 
      void powerbreak()
      {
    	  speed=speed-50;
    	  if(speed<0)
    		speed=0;
      }
}

class BMW extends Car
{
	  BMW(String colour,String name, int noOfseats,int maxspeed)
	  {
		  super (colour,name,noOfseats,maxspeed);
	  }
	  
	  void accelerate()
	     {
	    	 speed=speed+2;
	    	 if(speed>=maxspeed)
	    	 speed=maxspeed;
	    	 
	     }	 
	      void powerbreak()
	      {
	    	  speed=speed-45;
	    	  if(speed<0)
	    		speed=0;
	      }
	  
	  
	  
		
}
	
	
	
