class Gen<T>
{
	T ob; 		//PlaceHolder
	Gen(T o)
	{
		ob = o;
	}
	
	T getOb()
	{
		return ob;
	}
	void showType()
	{
		System.out.println("The type of T is  "+ob.getClass().getName());
		
	}
}




class GenDemo
{
	public static void main(String []args)
	{
		Gen<Integer> iob;
		iob = new Gen<Integer>(88);
		int a = iob.getOb();
		System.out.println("The value is " +a);
		
		Gen<String> sob = new Gen<String>("Dhoni is the Best");
		String str = sob.getOb();
		System.out.println("Value of str is " +str);
		
		Gen<Double>  dou = new Gen<Double>(784465468.45656);
		Double d = dou.getOb();
		System.out.println("Value of Double is " +d);
		dou.showType();
		
		
		Gen<Float>  Fl = new Gen<Float>(8.45f);
		Float fl = Fl.getOb();
		System.out.println("Value of Double is " +fl);
		Fl.showType();
		
		
		
		
		iob.showType();
		sob.showType();
	}
}
