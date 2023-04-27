class BSort
{
	 void bsort(int arr[])
	 {
		 int n = arr.length;
		 for(int i=0;i<n-1;i++)
		 
			 for(int j=0;j<n-i-1;j++)
				 if(arr[j] > arr[j+1])
				 {
					 int temp = arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
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
		BSort b1 =new BSort();
		int arr[]={55, 33,22,77,99,44};
		b1.display(arr);
		
		b1.bsort(arr);
		
		System.out.println("Sorted array:");
		b1.display(arr);
		
	}
		
}