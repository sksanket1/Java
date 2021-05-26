package throws1;
import java.io.IOException;
public class Test {
public void m1(int age) throws AgeValidException
{
	System.out.println("m1--start");
	if(age<0)
	{
		throw new AgeValidException("Age below 0");
	}
	System.out.println("m1--end");
}
public static void main(String[] args) {
	Test t=new Test();
	try {
		t.m1(-5);
	}
	catch (AgeValidException e) {
		System.out.println(e.getMessage());
	}
}
}
