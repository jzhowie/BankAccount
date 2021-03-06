public class BankAccountTester {
public static void main(String[] args) {

	BankAccount acc1 = new BankAccount(10000, "five");
	BankAccount acc2 = new BankAccount(10001, "one");
	BankAccount acc3 = new BankAccount(10002, "deposittestbot");

	System.out.println("Balance of accounts (should be zero!)");
	System.out.println(acc1.getBalance());
	System.out.println(acc2.getBalance());

	System.out.println("\n" + "Account IDs, refer to acc1 and acc2");
	System.out.println(acc1.getAccountID());
	System.out.println(acc2.getAccountID());

	System.out.println("\n" + "Passwords, should be equal to input");
	acc1.setPassword("weliveinasociety");
	acc2.setPassword("weliveinasociety");
	acc2.setPassword("testingaccount");

	if (acc2.authenticate("weliveinasociety")) {
		System.out.println("Logged in");
	}
	else {
		System.out.println("Passwords do not match");
	}

	System.out.println("\n" + "Deposit");
	System.out.println(acc1.getBalance());
	for (int amount = -2; amount < 3; amount += 1) {
		System.out.println("Depositing " + amount + " dollars...");
		if (acc1.deposit(amount)) System.out.println("Deposit successful! New balance is " + acc1.getBalance());
		else System.out.println("Deposit failed!");
	}

	System.out.println("\n" + "Withdraw");
	acc2.deposit(7);
	System.out.println(acc2.getBalance());
	for (int amount = -1; amount < 5; amount += 1) {
		System.out.println("Withdrawing " + amount + " dollars...");
		if (acc2.withdraw(amount)) System.out.println("Withdrawal successful! New balance is " + acc2.getBalance());
		else System.out.println("Withdrawal failed!");
	}

	System.out.println("\n" + "Deposit and Withdraw Testing");
	for (int rounds = 0; rounds < 25; rounds++) {
		int randint = (int)((Math.random() - 0.5) * 10000);
		System.out.println("\n" + "Depositing " + randint + " dollars...");
		if (acc3.deposit(randint)) System.out.println("Deposit successful! New balance is " + acc3.getBalance());
		else System.out.println("Deposit failed!");

		randint = (int)((Math.random() - 0.5) * 10000);
		System.out.println("\n" + "Withdrawing " + randint + " dollars...");
		if (acc3.withdraw(randint)) System.out.println("Withdrawal successful! New balance is " + acc3.getBalance());
		else System.out.println("Withdrawal failed!");
	}

	System.out.println("\n" + "ID\tBALANCE");
	System.out.println(acc1.toString());
	System.out.println(acc2.toString());
	System.out.println(acc3.toString());

	System.out.println("\n" + "transferTo");
	if (acc3.transferTo(acc2, 1000, "deposittestbot")) {
		System.out.println("Transfer successful! Your balance is " + acc3.getBalance());
	}
	else {
		System.out.println("Transfer failed!");
	}
}
}
