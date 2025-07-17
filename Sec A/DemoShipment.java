class Box
{
	double width, height, depth;
	Box(Box ob)
	{
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	Box(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	Box()
	{
		height=0;
		width=0;
		depth=0;
	}
	Box(double len)
	{
		width=height=depth=len;
		
	}
	double volume()
	{
	return width* height*depth;
	
	}
	
}
class BoxWeight extends Box
{
	double weight;
	BoxWeight(BoxWeight ob)
	{
		super(ob);
		weight=ob.weight;
	}
	BoxWeight(double w, double h , double d, double m)
	{
		super(w,h,d);
		weight=m;
	}
	BoxWeight()
	{
		super();
		weight=0;
	}
	BoxWeight(double len, double m)
	{
		super(len);
		weight=m;
	}
}
class Shipment extends  BoxWeight                                                               
{
	double cost;
	Shipment(Shipment ob)
	{
	 super(ob);
	 cost=ob.cost;
	}
	Shipment(double w, double h, double d, double m, double c)
	{
		super(w,h,d,m);
		cost=c;
	
	}
	Shipment()
	{
		super();
		cost=0;
	}
	Shipment(double len, double m , double c)
	{
		super(len, m);
		cost=c;
	}
}
class DemoShipment
{
	public static void main (String args[])
	{
		Shipment shipment1=new Shipment(10,20,15,10,3.14);
		double vol=shipment1.volume();
		System.out.println("Volume is"+vol);
		System.out.println("Weight of the Shipment"+shipment1.weight);
		System.out.println("Cost of the Shipment"+shipment1.cost);
	}
}