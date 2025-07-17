class Wrapp
{
	static int m(Integer a)
	{
		return a;
	}
	public static void main(String []args)
	{
		//Integer iob = new Integer(100); //Boxing 
		// int i = iob.intValue();		// Unboxing
		//System.out.println(i+" "+iob);
		
	Integer iob = 100; // Auto boxing
	int i = iob;
	//System.out.println(i+" "+iob);
	System.out.println(i+" " +iob);
	
	Integer Iob = m(200);  // Auto BOx
	System.out.println(Iob);
	}



}