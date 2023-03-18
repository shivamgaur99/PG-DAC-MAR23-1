//file name= > class containing main().

class Emp{
	
	String name;
	int id;
	
	//defaul values set karna hai we will use consructor.
	//default constructor
	Emp()//constructor--> compile time
	{
		name="Sanjay";
		id=1244;
	}
	
	void display()
	{
		System.out.println(name+" "+id);
	}

}
//Driver class
class EmployeeDemo1{

	
	public static void main(String args[])
	{
		Emp em1 = new Emp();//constructor is invoked in your program
		em1.display();//constructor will provide the values for display function
	}
}