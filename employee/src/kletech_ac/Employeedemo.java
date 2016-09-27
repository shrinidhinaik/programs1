package kletech_ac;

public class Employeedemo {
       
	public static void main(String[]args){
	 Manager m=new Manager(11,"aaa",9000,0,11 );
	 m.paybonus(0);
	 System.out.println("bonus=Rs"+m.bonus);
	 /*System.out.println(m.empId);
	 System.out.println(m.name);
	 System.out.println(m.empsalary);
	 System.out.println(m.bonus);
	 System.out.println(m.numberOfShares);*/
	 
	 Salesman s=new Salesman(22,"bbb",5000,0,20);
	 s.paybonus(0);
	 System.out.println("bonus=Rs"+s.bonus);
	/* System.out.println(s.empId);
	 System.out.println(s.name);
	 System.out.println(s.empsalary);
	 System.out.println(s.bonus);
	 System.out.println(s.numberOfSales);*/
	 
	 
   
	 
	 }
}
