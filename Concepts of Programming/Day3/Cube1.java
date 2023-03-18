class Cube1{
	
	static int x =5;//side
	//Note: Static method can access only static variable
	static void cubecalculate(){//static method
		int c=x*x*x;
		System.out.println(c);
		return;
	}
	
	void display()//non-static method
	{
		System.out.println(x);
	}
		
		public static void main(String[] args)
		{
			//static method call
			cubecalculate();
			
			
			//non-static method call
			Cube1 cc = new Cube1();
			cc.display();
		}
		
	
}