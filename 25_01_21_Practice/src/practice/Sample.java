package practice;

public class Sample extends Demo {
	   public static void demoMethod() {
	      System.out.println("method of sub class");
	   }
	   public static void main(String args[] ) {
	      Demo d=new Sample();
	      d.demoMethod();
	 
	   }
}
