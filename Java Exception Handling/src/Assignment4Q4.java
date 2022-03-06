import java.util.Scanner;
class InsufficientBalanceException extends Exception{
	InsufficientBalanceException()
	{
		super();
	}
}

class IllegalBankTransactionException  extends Exception{
	IllegalBankTransactionException ()
	{
		super();
	} 
}

public class Assignment4Q4 {
	public static void main(String[] args) throws IllegalBankTransactionException,InsufficientBalanceException {
		
		Scanner sc = new Scanner(System.in);
		double amount=sc.nextDouble();
		double Deposit= 2000;
		double balance= Deposit+amount;
		System.out.println(balance);
		double withdraw=sc.nextDouble();
		
        try { 
        	
          if(withdraw>balance) {
        	 throw new InsufficientBalanceException();
          }
          
          else if(balance==0){
        		throw new IllegalBankTransactionException();
          }
          
          else {
        	balance=balance-withdraw;
  			System.out.println(balance);
          }
          
        }
        
        catch (InsufficientBalanceException e){
			System.out.println("InsufficientBalance in the Account");
            throw new InsufficientBalanceException();
		}
        
        catch(IllegalBankTransactionException e) {
			System.out.println("YOUR TRANSACTION IS ILLEGAL OR NOT VALID");
			throw new IllegalBankTransactionException();
		}
        
	}
}
