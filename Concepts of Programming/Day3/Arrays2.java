import java.util.Scanner;

class Arrays2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		//Array input
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter element :");			
			arr[i] =sc.nextInt();
		}
		///Array Output
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Array element :"+ arr[i]);			
			
		}
	}
}