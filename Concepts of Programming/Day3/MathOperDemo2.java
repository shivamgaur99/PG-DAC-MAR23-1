class MathOper{
	
	static void sum(int i, int j)
	{
			int k= i+j;
			System.out.println("Sum="+k);
	}
	static void sum1(double i, double j)
	{
			double k= i+j;
			System.out.println("Sum1="+k);
	}
	
	
	

}
class MathOperDemo2
{
	public static void main(String args[])
	{
		MathOper.sum(11,22);
		MathOper.sum1(11.1,22.2);
		
	}
}