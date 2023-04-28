class ISort
{
	int min;
	void isort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int key =arr[i];
			int  j =i-1;
			
			while(j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1]=key;
			
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
		ISort b1 =new ISort();
		int arr[]={55, 33,22,77,99,44};
		b1.display(arr);
		
		b1.isort(arr);
		System.out.println("");
		System.out.println("Sorted array:");
		b1.display(arr);
		
	}
		
}