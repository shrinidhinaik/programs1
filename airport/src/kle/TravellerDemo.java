package kle;

public class TravellerDemo {
	
	         public static void main(String[] args){
	        	 Traveller t1=new Traveller(1,35f,2015,true);
	        	 
	       System.out.println("Traveller ID:"+t1.getiTravellerId());
	       System.out.println("baggaAmount:"+t1.getfbaggageAmount());
	       System.out.println("expiryYear:"+t1.getiExpiryYear()); 	 
	       System.out.println("NOCStatus:"+t1.getbNOCStatus()); 
	       
	       Checks c=new Checks();
	       
	       c.P(t1);
	        	 
	         }

}
