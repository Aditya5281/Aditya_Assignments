import java.util.*;

abstract class DesertItem {
	
    abstract public int getCost(int k);
}

class Candy extends DesertItem {
	
    public void addCandies(int candies)
    {
    	System.out.println(candies+" candies added to store");
    }

	public int getCost(int k) {
		return k*60;
	}
	
}

class Cookie extends DesertItem {
	
    public void addCookies(int candies)
    {
       	System.out.println(candies+" cookies added to store");
    }

	public int getCost(int k) {
		return k*70;
	}
}

class IceCream extends DesertItem {
	
    public void addIceCreams(int candies)
    {
       	System.out.println(candies+" icecreams added to store");
    }

	public int getCost(int k) {
		return k*20;
	}
	
}

public class Assignment2Q7 {

	public static void main(String[] args) {
	
		IceCream i=new IceCream();
		Cookie c=new Cookie();
		Candy q=new Candy();
		
		String a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter role:");
		
		a=sc.nextLine();
		
		if(a.equals("owner"))
		{
			System.out.println("which one to add");
			String b=sc.nextLine();
			
			if(b.equals("icecream"))
			{
				System.out.println("Enter number of icecreams:");
				int k=sc.nextInt();
				i.addIceCreams(k);
			}
			
			if(b.equals("cookies"))
			{
				System.out.println("Enter number of cookies:");
				int k=sc.nextInt();
				c.addCookies(k);
			}
			
			if(b.equals("candy"))
			{
				System.out.println("Enter number of candy:");
				int k=sc.nextInt();
				q.addCandies(k);
			}
			
		}
		else
		{
			System.out.println("enter which item to select:");
			String l=sc.nextLine();
			
			if(l.equals("icecream"))
			{
				System.out.println("Enter number of icecreams:");
				int k=sc.nextInt();
				int v=i.getCost(k);
				System.out.println("Cost is:"+v);
			}
			
			if(l.equals("cookies"))
			{
				System.out.println("Enter number of cookies:");
				int k=sc.nextInt();
				int v=c.getCost(k);
				System.out.println("Cost is:"+v);
			}
			
			if(l.equals("candy"))
			{
				System.out.println("Enter number of candy:");
				int k=sc.nextInt();
				int v=q.getCost(k);
				System.out.println("Cost is:"+v);
			}
			
			sc.close();
		}
		
	}

}