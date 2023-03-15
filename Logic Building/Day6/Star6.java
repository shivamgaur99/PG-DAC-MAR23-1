class Star6{

	public static void main(String args[])
	{	//Upper Triangle

		//Method 1:
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=1;j--)
			{
				if(j>i)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		
		//Method 2:
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
				
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}	
			
			System.out.println();
		}
		
		
		
		
	
	}
	
}