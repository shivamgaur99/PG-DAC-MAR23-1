class Recursion1{
	static int i=0;
		
	static void show()
	{
		++i;
		if(i<=5)// base condition
		{
			System.out.println("Hello Girls !!!");
			show();// recursive call
		}
	}
	public static void main(String args[])
	{
		//System.out.println("Hello.....");
		show();
	}
}