class Star7{

	public static void main(String args[])
	{			
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)//spaces
			{
				System.out.print("  ");
			}
				
			for(int k=4;k>=i;k--)
			{
				System.out.print("* ");
			}

			for(int k1=3;k1>=i;k1--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		
		
	
	}
	
}