class Box
{
	double height;
	double width;
	double depth;
}
class Volume
{
	public static void main(String args[])
	{
		Box mybox1=new Box();
		mybox1.height=100;
		mybox1.width=200;
		mybox1.depth=300;
		
		double vol;
		vol=mybox1.height*mybox1.width*mybox1.depth;
		System.out.println("volome is  "+vol);
		
		Box mybox2=new Box();
		mybox2.height=20;
		mybox2.width=30;
		mybox2.depth=40;
		vol=mybox2.height*mybox2.width*mybox2.depth;
		System.out.println("volume is " +vol);
	}
}