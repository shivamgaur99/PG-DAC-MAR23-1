class Casting3{

	public static void main(String args[])
	{
		
		byte x=12;
		byte y=11;
		//byte z=x+y;//complie time error
		
		byte z=(byte)(x+y);
		//byte z=(byte)x+(byte)y;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
	}
	
}