class Star3{

	public static void main(String args[])
	{	//Upper Triangle
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Lower triangle
			for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
	
}