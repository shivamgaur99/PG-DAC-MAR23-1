class Cube{
	
	int x =5;//side
	
	void cubecalculate(){
		int c=x*x*x;
		System.out.println(c);
		return;
	}
		
		public static void main(String[] args)
		{
			Cube c1 = new Cube();
			c1.cubecalculate();
		}
		
	
}