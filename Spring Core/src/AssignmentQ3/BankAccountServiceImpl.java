package AssignmentQ3;
//AssignmentQ3 and Q4


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService{
	
	
	// FOR WORKING IN REPOSITORY LAYER
	@Autowired
	private BankAccountepositoryImpl bankAccountRepoImpl;
	
	
	// for withdraw
	@Override
	public double withdraw(long accountId, double balance) {
		
		double newbalance = bankAccountRepoImpl.getBalance(accountId) - balance;
		bankAccountRepoImpl.updateBalance(accountId, newbalance);
		System.out.println("Remaining Balance : "+ bankAccountRepoImpl.getBalance(accountId));
		return accountId;
	}

	
	// for deposit
	@Override
	public double deposit(long accountId, double balance) {
		
		double newbalance = bankAccountRepoImpl.getBalance(accountId) + balance;
		bankAccountRepoImpl.updateBalance(accountId, newbalance);
		System.out.println("Remaining Balance : "+ bankAccountRepoImpl.getBalance(accountId));
		return accountId;
	}

	
	// for fetching balance
	@Override
	public double getBalance(long accountId) {
		
		System.out.println("Balance : "+ bankAccountRepoImpl.getBalance(accountId));
		return accountId;
	}

	
	// for fund transfer
	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {

		return false;
	}

}