
import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    public int getCash() 
    {
    	return creditLimit+totalDeposits;
    }
}

class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    public int getCash() 
    {
    	return fixedDepositAmount+totalDeposits;
    }
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash)
    {
		int a=0;
		for(int i=0;i<cash.size();i++)
		{
			a=a+cash.get(i);
		}
		return a;
    }

    public static void main(String[] args) 
    {
    	Assignment2Q3 l=new Assignment2Q3();
    	
    	ArrayList<Integer> k=new ArrayList<Integer>();
    	
    	CurrentAccount a=new CurrentAccount();
    	SavingsAccount b=new SavingsAccount();
    	
    	int m=a.getCash();
    	k.add(m);
    	
    	int n=b.getCash();
    	k.add(n);
    	
    	int t=l.totalCashInBank(k);
    	System.out.println(t);
    }
}