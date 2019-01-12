package account.dao;




import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;

import account.exception.AccountNotFoundException;
import account.savings.SavingsAccount;


public interface SavingsAccountDao {
	
	SavingsAccount createNewAccount(SavingsAccount account) throws ClassNotFoundException, SQLException;
	SavingsAccount getAccountById(int accountNumber) throws ClassNotFoundException, SQLException, AccountNotFoundException;
	SavingsAccount getAccountByName(String accountHolderName) throws ClassNotFoundException, SQLException, AccountNotFoundException;
	boolean closeAccount(int accountNumber) throws SQLException, ClassNotFoundException;
	List<SavingsAccount> getAllSavingsAccount() throws ClassNotFoundException, SQLException;
	SavingsAccount updateAccount(SavingsAccount account) throws DataAccessException, ClassNotFoundException, SQLException, AccountNotFoundException;
	void updateBalance(int accountNumber,double currentBalance)throws ClassNotFoundException, SQLException;
	List<SavingsAccount> getSortedAccounts(int choice) throws SQLException,ClassNotFoundException;
	
	
}
