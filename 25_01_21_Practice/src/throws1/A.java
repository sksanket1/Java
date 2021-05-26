package throws1;

public class A
{
	public void m1() throws ClassNotFoundException
	{
		Class.forName("A");
	}
	public void m2() throws ClassNotFoundException
	{
		m1();
	}
	public void m3()
	{
		try {
			m2();
			
		}
		catch (ClassNotFoundException e) {
			System.out.println("Checked exception");
		}
	}
	public static void main(String[] args) {
		A a=new A();
		a.m3();
	}
}
