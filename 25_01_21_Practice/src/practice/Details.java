package practice;

public class Details {
public Students setDetails()
{
	Students s=new Students();
	s.setRollno(1);
	s.setName("abc");
	return s;
}
public void getDetails(Students s1)
{
	System.out.println(s1.getName());
	System.out.println(s1.getRollno());
}
}
