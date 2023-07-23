package co.yedam.bank;

public class BankApp2 {
	Account2[] accounts;
	int accountNum = 0;
	Account2 acc2 = new Account2();

	BankApp2() {
		accounts = new Account2[10];
	}

	boolean registerAccount(Account2 account2) {
		if (accountNum >= 3) {
			return false;
		}
		accounts[accountNum++] = account2;
		return true;
	}

	boolean deposit(String num, int money) {
		int balance = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].accountNo == num) {
//				balance = accounts[i].balance += money;
				balance = acc2.getBalance() + money;
				acc2.setBalance(balance);
				return true;
			}
		}
		return false;
	}

	boolean whithdraw(String num, int money) {
		int balance = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].accountNo == num) {
//				balance = accounts[i].balance -= money;
				balance = acc2.getBalance() - money;
				acc2.setBalance(balance);
				return true;
			}
		}
		return false;
	}

	int checkBalance() {
		return acc2.getBalance();
	}

//	Account2[] accountList() {
//			return acc2;
//	}
}

