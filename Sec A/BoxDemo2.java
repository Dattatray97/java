class Box
{
  double height;
  double width;
  double depth;
  Box()
  {
	height=10;
	width=20;
	depth=30;
  }
  
  double vol()
  {
	return height*width*depth;
   }
}
class BoxDemo2
{
	public static void main(String args[])
	{
		Box mybox2=new Box();
		System.out.println("volume is " +mybox2.vol());
	}
}