class SSort1
{
	int min;
	void ssort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			min = i;
			for(int j = i+1;j<n;j++)
				if(arr[j] < arr[min])
					min = j;
		
		int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
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
		SSort1 b1 =new SSort1();
		int arr[]={55, 33,22,77,99,44};
		b1.display(arr);
		
		b1.ssort(arr);
		System.out.println("");
		System.out.println("Sorted array:");
		b1.display(arr);
		
	}
		
}