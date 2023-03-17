class Book2{
	//instance variable
	String title = "Let us C";
	String author="Y Kanetkar";
	int nofpages= 300;
	
	public static void main(String args[])
	{	
		//Local variable
		String title = "Let us C1";
		System.out.println("Object creation !!!");
			
		Book2 b1 = new Book2();
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.nofpages);
		
		
		Book2 b2 = new Book2();
		b2.title="Java Complete Reference";
		System.out.println(b2.title);
		System.out.println(b2.author);
		System.out.println(b2.nofpages);
	
	}
	
}