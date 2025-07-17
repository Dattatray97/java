class Box
{
	double height, width, depth;
	Box(double h, double w, double d)
	{
			height=h;
			width=w;
			depth=d;
			
		
	}
	
	public  String toString()
	{
		return "The dimension are "+width+" by "+height+" by "+depth+".";
		
	}
	
}

class toStringDemo 
{
		public static void main(String args[])
		{
			Box b=new Box(10,12,14);
			String s="THe box b is "+b;
			System.out.println(b); // Convert to String 
			System.out.println(s);
			String s2= "Face the failure until the  failure fails to face you";
			int start=4;
			int end =27;
			
			char buf[]=new char[end-start];
			s2.getChars(start ,  end, buf,0);
			
			System.out.println(buf);
			System.out.println("The number of arguments "+args.length);
			for(int i=0;i<args.length;i++)
			{
				System.out.println("The  arguments  "+args[i]);
			}
			
		}
}
