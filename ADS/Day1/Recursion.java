class Recursion{
	
	static void show()
	{
		System.out.println("Hello Girls !!!");
		show();// recursive call
	}
	public static void main(String args[])
	{
		//System.out.println("Hello.....");
		show();
	}
}