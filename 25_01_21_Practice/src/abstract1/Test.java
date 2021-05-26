package abstract1;

public class Test {
public static void main(String[] args) {
	System.out.println("main start");
	
	try
	{
		A b=new C();
		b.m1();
		int a=10/0;
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("catch block");
	}
	catch (Exception e) {
		System.out.println("catch 2");
	}
	finally 
	{
	System.out.println("Finally");	
	}
	
}
}
