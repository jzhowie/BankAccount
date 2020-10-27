public class BankAccountTester {
public static void main(String[] args) {
	BankAccount acc1 = new BankAccount(1418350, "five");
	BankAccount acc2 = new BankAccount(-619468, "one");

	System.out.println("Balance of accounts (should be zero!)");
	System.out.println(acc1.getBalance());
	System.out.println(acc2.getBalance());

	System.out.println("Account IDs, refer to acc1 and acc2");
	System.out.println(acc1.getAccountID());
	System.out.println(acc2.getAccountID());

	System.out.println("Passwords, should be equal to input");
	acc1.setPassword("weliveinasociety");
	acc2.setPassword("weliveinasociety");
}
}
