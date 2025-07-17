class ThrowsDemo
{
	static void throwOne()  throws  IllegalAccessException
		{
			System.out.println("Inside throwOne");
			throw new IllegalAccessException("RCB ");	
		}
	public static void main(String []args)
	{
		try
		{
			throwOne();
		}
		catch( IllegalAccessException e)
		{
			System.out.println(" IllegalAccessException"+e);
		
		}
		finally
		{
			System.out.println("Finally E Sala Cup Namde ");
		}
		
	}
}