class MathOper{
	
	static void sum(int i, int j)
	{
			int k= i+j;
			System.out.println("Sum="+k);
			//return is optional
			return;
	}
	static void sum(double i, double j)
	{
			double k= i+j;
			System.out.println("Sum1="+k);
	}
	static void sum(int i, int j, int m)
	{
			int k= i+j+m;
			System.out.println("Sum="+k);
	}
	
	static double sumx(double i, double j)
	{
			double k= i+j;
			return k;
	}
	
	

}
class MathOperDemo3
{
	public static void main(String args[])
	{
		MathOper.sum(11,22,33);
		MathOper.sum(11,22);
		MathOper.sum(11.1,22.2);
		
		double x1 = MathOpr.sumx(11.1.23.4);//k
		//x1=k;
		System.out.println("Sum1="+x1);
		
		
		
	}
}