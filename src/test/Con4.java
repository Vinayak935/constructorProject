package test;
class Test2
{
	Test2()
	{
		System.out.println("----0-Parameter Constructor-------------");
	}
	Test2(int x,int y)
	{
		System.out.println("-------Dis Parameter Constructor------------");
		System.out.println("x"+x);
		System.out.println("y"+y);
	}
}
public class Con4 {
   public static void main(String[] args) {
	       Test2 t2 = new Test2();//0-parameter Constructor
	       Test2 t3 = new Test2(10,56);//Parameter-Constructor
     }
}
