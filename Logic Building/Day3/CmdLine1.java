class CmdLine1{

	public static void main(String args[])
	{
		String s1 = args[0];//10
		String s2 = args[1];//20
	
		//Type casting
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		
		System.out.println("Hello "+s1);
		System.out.println("Hello "+s2);
		System.out.println("Hello "+(s1+s2));//30-->1020
		System.out.println("Hello "+(i+j));//30-->1020
	
		
	
	}
	
}