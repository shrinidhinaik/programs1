package kle;

public class Traveller {
	
	    private int iTravellerId;
	    private float fbaggageAmount;
	    private int iExpiryYear;
	    private boolean bNOCStatus;
	    
	    Traveller(int iTravellerID,float fbaggageAmount,int iExpiryYear,boolean bNOCStatus){
	    	this.iTravellerId=iTravellerID;
	    	this.fbaggageAmount=fbaggageAmount;
	    	this.iExpiryYear=iExpiryYear;
	    	this.bNOCStatus=bNOCStatus;
	    }

		public int getiTravellerId() {
			return iTravellerId;
		}

		public float getfbaggageAmount() {
			return fbaggageAmount;
		}

		public int getiExpiryYear() {
			return iExpiryYear;
		}

		public boolean getbNOCStatus() {
			return bNOCStatus;
		
		}

	
}

