import java.util.Scanner;
class Star5{

	public static void main(String args[])
	{	//Upper Triangle
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter integer value for n:" );
	int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	
	}
	
}