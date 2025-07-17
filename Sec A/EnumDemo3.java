enum Apples{
Apple(100), Jonathan(200), GoldenDel(300), RedDel(400), winesap(500), CartLand(600);

private int price;
Apples(int p){
price = p;
}
int getprice(){
return price;
}
}
class EnumDemo3
{
	public static void main(String []args)
	{
		System.out.println("The price of GoldenDel , Apple is"+ Apples.GoldenDel.getprice());
		System.out.println("The price of all Apples are ");
		for (Apples a: Apples.values())
		System.out.println(a+" price is : " +a.getprice());
		}
	}