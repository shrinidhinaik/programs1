package ackletech;

public class MultiplexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Multiplex m=new Multiplex("Rooopam","hubli");
	m.s[0]=new Screen(2,250);
	m.s[1]=new Screen(3,250);
	
	m.s[0].m[0]=new Movie("Kotigobba-2","Sudeeep","u","kannada");
	m.s[0].m[0]=new Movie("Bahubali","prabhas","u","telgu");
	m.s[1].m[0]=new Movie("Sultan","salmankhan","u","hindi");
	m.s[1].m[0]=new Movie("Rangitaranga","anoop","u","kannada");
	
	
	System.out.println("multiplex"+m.name);
	
	System.out.println("on screen"+m.s[0].screenNum);
	System.out.println("at 12pm and 3pm"+m.s[0].m[0].title);
	System.out.println("at 12am and 3pm"+m.s[0].m[0].title);
	
	System.out.println("on screen"+m.s[1].screenNum);
	System.out.println("at 12am and 3pm"+m.s[1].m[0].title);
	System.out.println("at 12am and 3pm"+m.s[1].m[0].title);
	
	
	}	
		
		

	}


