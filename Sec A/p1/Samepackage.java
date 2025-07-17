package p1;
class Samepackage 
{
    Protection p=new Protection();
	
Samepackage()
{
	System.out.println("Inside SamePackage Constructor");
	System.out.println("Value of n"+ p.n);
	// System.out.println("value of n_pri"+p.n_pri);
	System.out.println("Value of n_pro"+ p.n_pro);
	System.out.println("Value of n_pub"+ p.n_pub);
	}
} 