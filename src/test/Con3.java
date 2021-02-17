package test;
class ParaCon
{
	public ParaCon(int x,int y)
	{
		System.out.println("----Dis from ParamCon");
		System.out.println("x-----"+x);
		System.out.println("y--------"+y);
	}
}
public class Con3 {
public static void main(String[] args) {
	ParaCon con = new ParaCon(10, 14);
}
}
