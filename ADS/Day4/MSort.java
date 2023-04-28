class MSort
{
	static void mergesort(int arr[], int l, int h)
	{
		if(l<h)
		{
			int m=l+(h-l)/2;
			mergesort(arr, l,m);//Left sub array
			mergesort(arr, m+1,h);//Right sub array
			merge(arr, l, m, h);
			
		
		}
	}
	
	static void merge(int arr[], int l, int m, int h)
	{
		int n1=m-l+1;
		int n2=h-m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		//Left sub array
		for(int i=0;i<n1;i++)
			L[i]=arr[l+i];
		
		//Right sub array
		for(int j=0;j<n2;j++)
			R[j]=arr[m+1+j];
		
		
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]= L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]= R[j];
			j++;
			k++;
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
		MSort b1 =new MSort();
		int arr[]={55, 33,22,77,99,44};
		int n=arr.length;
		b1.display(arr);
		
		//b1.isort(arr);
		mergesort(arr, 0,n-1);
		System.out.println("");
		System.out.println("Sorted array:");
		b1.display(arr);
		
	}
		
}