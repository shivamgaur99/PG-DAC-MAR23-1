class Employee{
	int a=10;//instance variable 
	static int j=20;// static variable
	
	
	void display(){
		System.out.println("Instance variable = "+a);
		j=30;
		System.out.println("Static variable = "+j);
	}
	
	static void show(){
		
		System.out.println("Static variable = "+j);
		
	}
	
	public static void main(String args[])
	{
		static int j=23;// static variable
		//Object create
		Employee e1 = new Employee();
		//One way
		System.out.println("Instance variable = "+e1.a);//instance variable
		System.out.println("Static variable = "+j);//static variable
		
		//alternate way
		e1.display();//instance method
		show();//static method
		
		
	}
}