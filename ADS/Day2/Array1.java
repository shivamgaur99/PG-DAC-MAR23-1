class Array1{
	private int []a1;
	private int n;
	
	public Array1(int size)
	{
		a1= new int[size];
		n=0;
	}
	
	public void insert(int index, int value)
	{
		a1[n]=value;
		n++;
	}
	
	public void display()
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(a1[j] + " ");
		}
	}
	
	public boolean find(int key)
	{
		int j;
		for(j=0;j<n;j++)
		{
			if(a1[j] == key)
				break;
		}
		if(j==n)
			return false;
		else
				return true;
	}
	
	public void delete(int value)
	{
		int j;
		for(j=0;j<n;j++)
		{
			if(a1[j] == value)
				break;
		}
		
		for(int k=j;k<n;k++)
		{	a1[k]=a1[k+1];
		}
		
		n--;
			
		
		
		
	}

	
public static void main(String args[])
	{
		Array1 arr;
		arr = new Array1(100);
		
		arr.insert(0,44);
		arr.insert(1,55);
		arr.insert(2,66);
		arr.insert(3,99);
		arr.insert(4,34);
		arr.insert(5,74);
		arr.insert(6,24);
		arr.insert(7,4);
		arr.insert(8,89);
		arr.insert(9,0);
		
		arr.display();
		int key =34;
		if(arr.find(key))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		arr.delete(74);
		arr.display();
		System.out.println("" );
		arr.delete(0);
		
		arr.display();
	
		
	
		
	}
}