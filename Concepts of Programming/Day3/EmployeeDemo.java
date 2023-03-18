//file name= > class containing main().

class Emp{
	
	static String name="Sanjay";
	static int id =111;
	
	static void display()
	{
		System.out.println(name+" "+id);
	}

}
//Driver class
class EmployeeDemo{

	
	public static void main(String args[])
	{
		//EmployeeDemo em1 = new Employeedemo();
		
		//instance method then create object of that class
		//Emp e1 =new Emp();
		//e1.display
		
		
		//static method then 'classname.functionname()'
		Emp.display();
		
		
	}
}