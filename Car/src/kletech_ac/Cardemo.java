package kletech_ac;

public class Cardemo {
	
	public static void main()
	{
		Ferrari f=new Ferrari("red","nano",2,200);
		BMW b=new BMW("blue","king",2,250);
		
		for(int i=0;i<150;i++)
		{
			f.accelerate();
			b.accelerate();
			System.out.println(i+"th seconds speed");
			System.out.println("Ferrai="+f.speed+"BMW="+b.speed);
		}
		System.out.println("applying break");
		for(int i=0;i<=7;i++)
		{
			f.powerbreak();
			b.powerbreak();
			System.out.println(i+"th second speed after break apply");
			System.out.println("Ferrai="+f.speed+"BMW="+b.speed);
					
			
		}
		
	}
	
	
	

}
