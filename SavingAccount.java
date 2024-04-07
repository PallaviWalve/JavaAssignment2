package practicemodule;
public class SavingAccount extends Account {
	double intRate;
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(String accountNum,double intRate) {
		super(accountNum);
		this.intRate = intRate;
	}
	public double addInterest()
	{
		double interest=balance*intRate;
		balance=balance+interest;
		return interest;
	}
	

}
 class LoanAccount extends Account{
	double LoanAmount;

	public LoanAccount(String accountNum, double loanAmount) {
		super(accountNum);
		LoanAmount = loanAmount;
		}
	
	public void  payEmi(double emi)
	{
		
		LoanAmount=LoanAmount-emi;
		System.out.println("successful");
	}
	
	}
 
 class HousingLoan extends LoanAccount{
	 int tenure;

	public HousingLoan(String accountNum, double loanAmount, int tenure) {
		super(accountNum, loanAmount);
		this.tenure = tenure;
	}

	public void extendTenure(int yr)
	{
	tenure=tenure+yr;
	System.out.println("Tenure extended by"+yr+"years");
		
	}
	 
 }
 

