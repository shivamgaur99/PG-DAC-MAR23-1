class BSort1
{
	 void bsort(int arr[])
	 {
		 int n = arr.length;
		 boolean flag;
		 for(int i=0;i<n-1;i++)
		 {
			 flag=false;
			 for(int j=0;j<n-i-1;j++)
				 if(arr[j] > arr[j+1])
				 {
					 int temp = arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 flag =true;
				 }
		 }
		 		 
	 }
	 
	 void display(int arr[])
	 {
		 int n=arr.length;
		 for(int i=0;i<n;i++)
				System.out.print(arr[i]+ " ");
	 }
	
	public static void main(String args[])
	{
		BSort1 b1 =new BSort1();
		int arr[]={55, 33,22,77,99,44};
		b1.display(arr);
		
		b1.bsort(arr);
		
		System.out.println("Sorted array:");
		b1.display(arr);
		
	}
		
}