class MathOper{
	static int i;
	static int j;
	//constructor
	MathOper()
	{
		 i=10;
		 j=20;
	}
		
	static int sum(int i, int j)
	{
			return i+j;
	}
	
	static void display(int res)
	{
		System.out.println(res)
	}
	
	static void show()
	{
				
		System.out.println(i+j);
	}


}
class MathOperDemo1
{
	public static void main(String args[])
	{
		//Metgod 1: user defined values
		Scanner sc =new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		
		int s = MathOper.sum(i,j);
		
		//Method 2: complie time values
		int s = MathOper.sum(12,13);
		
		//Method 3: paa be value using resultant value
		MathOper.display(s)
		
		
		
	}
}