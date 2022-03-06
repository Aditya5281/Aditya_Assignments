
import java.util.ArrayList;
class manager extends Assignment2Q2
{
	public int getsalary(int salary)
	{
		int incentive=5000;
		return incentive+salary;
	}
}

class labour extends Assignment2Q2
{
	public int getsalary(int salary)
	{
		int overtime=500;
		return overtime+salary;
	}
}
public class Assignment2Q2 {

	public static int salary=10000;
	public int totalsalary(ArrayList<Integer> Totalsalary)
	{
		int a=0;
		for(int i=0;i<Totalsalary.size();i++)
		{
			a=a+Totalsalary.get(i);
		}
		return a;
	}
	public static void main(String[] args) {
		Assignment2Q2 l=new Assignment2Q2();
		
		ArrayList<Integer> k=new ArrayList<Integer>();
		
		manager a=new manager();
		labour b=new labour();
		
		int m=a.getsalary(salary);
		k.add(m);
		
		int n=b.getsalary(salary);
		k.add(n);
		
		int x=l.totalsalary(k);
		System.out.println(x);

	}
}