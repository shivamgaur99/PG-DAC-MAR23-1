import java.util.Scanner;

class Arrays3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		//Array input
		//int size =sc.nextInt();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter element :");			
			arr[i] =sc.nextInt();
		}
		
		//Method 2: Array output : for-each
		for(int a : arr)
		{
			System.out.println(a);
		}
		
		
		///Method 1 : Array Output
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println("Array element :"+ arr[i]);			
			
		}*/
	}
}