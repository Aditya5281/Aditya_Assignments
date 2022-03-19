import java.util.Comparator;

public class employee {

	int id;
	String name;
	String dept;
	int salary;
	
	public employee(int id,String name,String dept,int salary) 
	{
		
		this.id=id;
		this.dept=dept;
		this.name=name;
		this.salary=salary;
		
	}
	
}

	class nameComparator implements Comparator<employee>
	{		
	    public int compare(employee s1,employee s2)
	    {
	        return s1.name.compareTo(s2.name);
	    }	    
	}
	
	class idComparator implements Comparator<employee>
	{
	    public int compare(employee s1,employee s2)
	    {
	        return s1.id-(s2.id);
	    }
	}
	
	class salaryComparator implements Comparator<employee>
	{
	    public int compare(employee s1,employee s2)
	    {
	        return s1.salary-(s2.salary);
	    }
	}
	
	class deptComparator implements Comparator<employee>
	{
	    public int compare(employee s1,employee s2)
	    {
	        return s1.dept.compareTo(s2.dept);
	    }
}
