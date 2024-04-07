package practicemodule;
public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa=new SavingAccount("SBI2001", 0.05);
//		sa.details();
		sa.deposit(5000);
		sa.details();
		System.out.println("--------------------------------");
//		sa.addInterest();
//		sa.details();
		HousingLoan ha=new HousingLoan("HL2027", 60000, 10);
		ha.deposit(15000);
		ha.payEmi(5000);
		ha.details();
		


	}

}

