package practicemodule;
public class Account {
	protected String AccountNum;
	protected double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String accountNum) {
		super();
		AccountNum = accountNum;
		balance = 0;
	}

	public void deposit(double amt) {
		balance=balance+amt;
	}
	public void withdraw(double amt) {
		if(balance>amt)
		balance=balance-amt;
		else
			System.out.println("balance is less");
	}
	void details()
	{
		System.out.println("Account number:"+AccountNum);
		System.out.println("Balance is:"+balance);
		
	}
	

}
