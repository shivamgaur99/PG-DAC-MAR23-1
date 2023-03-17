class Book{
	//instance variable
	String title = "Let us C";
	String author="Y Kanetkar";
	int nofpages= 300;
	
	public static void main(String args[])
	{	
		//Local variable
		//String title = "Let us C";
		System.out.println("Object creation !!!");
			
		Book b1 = new Book();
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.nofpages);
		
		Book b2 = new Book();
		
	
	}
	
}