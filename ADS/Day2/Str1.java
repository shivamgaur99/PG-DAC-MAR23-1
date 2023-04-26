class Str1{
	
	static void display(String str, String res)//str = null
	{
		if(str.length() == 0)
		{
			System.out.println(res+ " ");//ABC ACB
			return;
		}
		
		for(int i=0;i<str.length(); i++)
		{
			char ch = str.charAt(i);//B
			String ros = str.substring(0,i) + str.substring(i+1);//null
			display(ros,res+ch);//ros=null
		}
	}
		
public static void main(String args[])
	{
		String s="ABC";
		display(s,"");
		
		
	}
}