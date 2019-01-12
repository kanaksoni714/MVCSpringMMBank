package account.factory;

import account.savings.SavingsAccount;

public final class AccountFactory {
	
	private static AccountFactory factory = new AccountFactory();

	private AccountFactory() {	
	}
	
	public static AccountFactory getInstance() {
		return factory;
	}

	public SavingsAccount createNewSavingsAccount(String accountHolderName, double accountBalance, boolean salary) {
		return new SavingsAccount(accountHolderName, accountBalance, salary);
	}
//	public CurrentAccount createNewCurrentAccount (String accountHolderName, double accountBalance,double odLimit ){
//		return new CurrentAccount(accountHolderName, accountBalance, odLimit);
//	}
}