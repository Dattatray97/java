package p1;
public class Protection 
{
	int n=1;
	private int n_pri=2;
	protected int n_pro=3;
	public int n_pub=4;
	
	public Protection()
	{
	System.out.println("This is base class");
	System.out.println("Value of n"+n);
	System.out.println("value of n_pri"+n_pri);
	System.out.println("Value of n_pro"+n_pro);
	System.out.println("Value of n_pub"+n_pub);
	}
}