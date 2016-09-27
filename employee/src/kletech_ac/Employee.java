package kletech_ac;

public class Employee {
          int empId;
          String name;
          double empsalary;
          double bonus;
          Employee (){}
          Employee(int empId,String name,double empsalary,double bonus)
          {
        	  this.empId=empId;
        	  this.name=name;
        	  this.empsalary=empsalary;
        	  this.bonus=bonus;
          }
          
        void paybonus(double bonusAmt)
        {
        	bonus+=bonusAmt;
        }
        
        
}
class Manager extends Employee
{
	   int numberOfShares;
	   Manager(){}
	   Manager(int empId,String name,double empsalary,double bonus,int numberOfShares)
	   {
		     super(empId,name,empsalary,bonus);
		     this.numberOfShares=numberOfShares;
	   }
	    
	    
	   void paybonus(double bonusAmt)
	   {
		   bonus+=bonusAmt;
		   numberOfShares+=10;
	   }
	   
}
class Salesman extends Employee
{
	  int numberOfSales;
	  Salesman(){}
	   Salesman(int empId,String name,double empsalary, double bonus,int numberOfSales)
	  {
	   super (empId,name,empsalary,bonus);
	   this.numberOfSales=numberOfSales;
	  }
	   
	   void paybonus(double bonusAmt)
	   {
		   bonus+=bonusAmt+ empsalary *0.1;
	   }
	   
}	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		   
		   
	   
	   
	   
	   
	   
	   
	   
	   


