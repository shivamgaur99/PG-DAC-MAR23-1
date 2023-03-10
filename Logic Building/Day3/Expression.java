class Expression{

	public static void main(String args[])
	{
		int x=12;
		int y=2*x;
		System.out.println(y);
		
		int z=(y-x) % 5;
		System.out.println(z);
		
		final float pi =3.1415F;
		float f=pi/0.62F;
		
		System.out.println("Ans= "+(pi/0.62F));
		
		x+=5;
		System.out.println(x);
		
		x*=5;
		System.out.println(x);//85
		
		System.out.println(x++);//85
		//x++ 85+1=86
		//++x 86+1=87
		System.out.println(++x);//87
		
		
		System.out.println(--y);//23
		System.out.println(y--);//23
	
	}
	
}