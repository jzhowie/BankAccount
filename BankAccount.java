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

public void setPassword(String newPass) {
	password = newPass;
	//System.out.println(password);
	return;
}

public boolean deposit(double amount) {
	if (amount < 0) {
		return false;
	}
	balance += amount;
	return true;
}

public boolean withdraw(double amount) {
	if (balance < amount || amount < 0) {
		return false;
	}
	balance -= amount;
	return true;
}

public String toString() {
	String idbal = accountID + "\t" + balance;
	return idbal;
}

}
