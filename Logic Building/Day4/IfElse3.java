import java.util.Scanner;
class IfElse3{

	public static void main(String args[])
	{
		//int num=0;//Compiletime
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter 0/1:");
		
		int num =sc.nextInt();//Runtime
		
		if(num==1 || num ==0)
		{
			System.out.println("Hi Girls !!");
		}
		else
		{
			System.out.println("Hey Boys !!");
		}
		
		
	}
	
}