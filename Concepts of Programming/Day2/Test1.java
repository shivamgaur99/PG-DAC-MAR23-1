class Test1{
	int i=10;
	
	void display()
	{
		
		System.out.println("Function prints the value of i="+i);
	}
	
	public static void main(String args[])
	{	
	
		Test1 t1 = new Test1();
		System.out.println(t1.i);//10
		t1.display();//Method call
		System.out.println(t1.i);//10
		t1.display();//Method call
		t1.display();//Method call
		
		Test1 t2 = new Test1();
		t2.i=20;
		t2.display();//Method call
		
	}
}
		