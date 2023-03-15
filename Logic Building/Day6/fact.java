class fact{

	public static void main(String args[])
	{		
		int n,fact=1;
		n=5;
		
		if(n<0)
			System.out.println("Negative number.");
		else
		{
			for(int c=1;c<=n;c++)
			{
				 fact= fact*c;//
			}
			System.out.println("Factorial="+fact);
			
		}
	
	}
	
}