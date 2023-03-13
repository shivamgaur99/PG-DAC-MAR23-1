import java.util.Scanner;
class Switch1{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0); //---- Runtime
		//char ch = 'a';---> Compile time
		switch(ch)
		{
			case 'a': 
				
			case 'e': 
			
			case 'i': 
			
			case 'o': 
			
			case 'u': 
			
			System.out.println(ch + " is a LOWER vowel.");break;
			
			case 'A': 
				
			case 'E': 
			
			case 'I': 
			
			case 'O': 
			
			case 'U': 
			
			System.out.println(ch + " is a UPPER vowel.");
			
			default: System.out.println(" galat input diya hai!");
			
		}
		
	}
	
}