class Swap{

	public static void main(String args[])
	{		
		int x, y, temp;
		x=102;
		y=45;
		System.out.println("Before X="+x + " Y="+y);
		//Method 1: using 3rd variable
		temp =x;
		x=y;
		y=temp;
		
		System.out.println("After X="+x + " Y="+y);//x=45, y=102
		
		
		//Methos 2: without using 3rd variable
		
		y=(x+y)-(x=y);//y= 45+102 = 147-102=45
		System.out.println("After Method 2 X="+x + " Y="+y);
	
	}
	
}