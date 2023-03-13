
class Switch{

	public static void main(String args[])
	{
		int day =-1;
		
		String str;
		
		switch(day)
		{
			case 1: str = "Monday";break;
			
			case 2: str = "Tuesday";
			
			case 3: str = "Wednesday";	
			
			case 4: str = "Thursday";
			
			case 5: str = "Friday";break;
			
			case 6: str = "Saturday";break;
			
			case 7: str = "Sunday";break;
			
			default: str = "Invalid day !";break;
		}
		System.out.println(str);
	}
	
}