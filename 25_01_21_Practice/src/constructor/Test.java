package constructor;

public class Test {
public static void main(String[] args) {
//	B b=new C();
//	b.m1();//m1--A
//	b.m2();//m2--C
//	b.m3();//m3--B
////b.m4();
//	System.out.println(b.a);//30
//	System.out.println(b.b);//20
//	System.out.println(b.c);//40
//	System.out.println(b.d);error

//	C c=new C();
//	c.m1();//m1--B
//	c.m2();//m2--c
//	c.m3();//m3--c
//	c.m4();//m4--c
//	System.out.println(c.a);//50
//	System.out.println(c.b);//20
//	System.out.println(c.c);//40
//	System.out.println(c.d);//60
//	A a=new C();
//	a.m1();//m1--A
//	a.m2();//m2--C
//	a.m3();
//	a.m4();
//	System.out.println(a.a);//10
//	System.out.println(a.b);//20
//	System.out.println(a.d);
	
	A a1=new B();
	a1.m1();//m1--A
	a1.m2();//m2--A
//	a1.m3();
//	a1.m4();
	System.out.println(a1.a);
	System.out.println(a1.b);
//	System.out.println(a1.c);
	
//	A a=new A();
//	a.m1();
//	a.m2();
	
	
//	B b=new B();
//	b.m1();//m1--A
//	b.m2();//m2--A
//	b.m3();//m3--B
}
}
