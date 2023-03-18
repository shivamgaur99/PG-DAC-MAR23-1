import java.util.Scanner;

class Arrays5
{
	public static void main(String args[])
	{
		int a[] = {1,2,3};//row 1
		int b[] = {11,21,13};//row 2
		int c[] = {14,22,23};//row 3
		
		int arr[][] = new int[3][];
		
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(" "+ arr[i][j]);
			}
			System.out.println();
		}
		
	}
}