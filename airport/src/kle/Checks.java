package kle;

public class Checks {
	
	public boolean checkbaggage(Traveller t1){
		if(t1.getfbaggageAmount()>=0 && t1.getfbaggageAmount()<=40)
			    return true;
		else
			    return false;
	}
	
	public boolean checksecurity(Traveller t1)
	{
		if(t1.getbNOCStatus()==true)
			     return true;
		else
			
			      return false;
	}
	
	public boolean checkimmigration(Traveller t1)
	{
		if(t1.getiExpiryYear()>=2001&&t1.getiExpiryYear()<=2025)
			  return true;
		else
			   return false;
	}
	
public void P(Traveller t1)
{
if(this.checksecurity(t1)==true && this.checkbaggage(t1)==true&&this.checkimmigration(t1)==true)
         System.out.println("Allow Traveller to fly");
  else

	     System.out.println("Detain Traveller for rechecking");  
	  }
}















		
	


