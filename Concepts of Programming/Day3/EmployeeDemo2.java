//file name= > class containing main().

class Emp{
	String name;
	int id;
	
		
	Emp()//default constructor
	{
		name="Aniket";
		id=111;
		
	}
	Emp(String s1)//parameterised constructor
	{
		name=s1;
	
		
	}
	
	Emp(String s1, int n1)//parameterised constructor
	{
		name=s1;
		id= n1;
		
	}
	
	void display()
	{
		System.out.println(name + " " + id);
	}

}
//Driver class
class EmployeeDemo2{

	
	public static void main(String args[])
	{
		
		Emp em1 = new Emp();
		//Emp em1 = new Emp("Sagar",222);
		//Emp em3 = new Emp("Shubham");
		
		em1.display();
		//em3.display();
		em1.display();
	}
}