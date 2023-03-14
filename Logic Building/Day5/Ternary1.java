class Ternary1{

	public static void main(String args[])
	{
			
		int n1=100; 
		int n2=20;
		
		int max=(n1>n2) ? n1 : n2;
		System.out.println("Max = "+max);
		
		
		int res=(n1>n2) ? (n1+n2) : (n2-n1);
		System.out.println("Result = "+res);
		
	
	}
	
}