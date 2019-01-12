package account.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;

import account.exception.AccountNotFoundException;
import account.savings.SavingsAccount;

public interface SavingsAccountService {

	SavingsAccount createNewAccount(String accountHolderName, double accountBalance, boolean salary)
			throws ClassNotFoundException, SQLException;

	SavingsAccount getAccountById(int accountNumber)
			throws ClassNotFoundException, SQLException, AccountNotFoundException;

	List<SavingsAccount> getAllSavingsAccount() throws ClassNotFoundException, SQLException;

	void fundTransfer(SavingsAccount sender, SavingsAccount receiver, double amount)
			throws ClassNotFoundException, SQLException;

	void deposit(SavingsAccount account, double amount) throws ClassNotFoundException, SQLException;

	void withdraw(SavingsAccount account, double amount) throws ClassNotFoundException, SQLException;

	SavingsAccount getAccountByName(String accountHolderName)
			throws ClassNotFoundException, SQLException, AccountNotFoundException;

	List<SavingsAccount> getSortedAccounts(int sortBy) throws ClassNotFoundException, SQLException;

	SavingsAccount updateAccount(SavingsAccount account) throws DataAccessException, ClassNotFoundException, SQLException, AccountNotFoundException;

	boolean closeAccount(int accountNumber) throws ClassNotFoundException, SQLException;

}