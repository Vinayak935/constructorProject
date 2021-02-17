package test;
import java.util.*;
class Book_Details
{
	String bCode,bName,bAuthor;
	Book_Details(String a,String b,String c)
	{
		bCode = a;
		bName=b;
		bAuthor=c;
		return;
		
	}
	void getBook_Details()
	{
		System.out.println("Book Code-------------"+bCode);
		System.out.println("Book Name-------------"+bName);
		System.out.println("Book Authour------------"+bAuthor);
		System.out.println("----------------------");
	}
}
public class Con5 
{
    public static void main(String[] args) 
    {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Bcode");
		String bCode = s.nextLine();
		System.out.println("Enter the Bname");
		String bName = s.nextLine();
		System.out.println("Enter the Bauthour");
		String bAutour = s.nextLine();	
		Book_Details bd1 = new Book_Details(bCode, bName, bAutour);
		bd1.getBook_Details();
		
		System.out.println("Enter the Bcode");
		String bCode1 = s.nextLine();
		System.out.println("Enter the Bname");
		String bName1 = s.nextLine();
		System.out.println("Enter the Bauthour");
		String bAutour1 = s.nextLine();
		Book_Details bd2 = new Book_Details(bCode1, bName1, bAutour1);
		bd2.getBook_Details();
	}
}
