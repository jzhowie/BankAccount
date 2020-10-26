public class BankAccount {
private double balance;
private int accountID;
private String password;

public BankAccount(int ID, String pass) {
	balance = 0;
	accountID = ID;
	password = pass;
}

public double getBalance() {
	return balance;
}

public int getAccountID() {
	return accountID;
}
}
