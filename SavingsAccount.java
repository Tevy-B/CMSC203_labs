package cmsc_203Lab9;

public class SavingsAccount extends BankAccount
{
	private double rate = 0.025; //represent annual interest rate
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double initialBalance)
	{
		super(name, initialBalance);
		accountNumber = super.getAccountNumber()+ "-" +savingsNumber;
	}
	
	//a copy constructor that creates another savings account for the same person
	public SavingsAccount(SavingsAccount origAccount, double amount)
	{
		//take the original savings account and an initial balance as parameters
		super(origAccount,amount);
		//assign the savingsNumber to be one more than the savingsNumber of the original savings account
		this.savingsNumber = origAccount.savingsNumber+1;
		
		//assign the accountNumber to be the accountNumber of the superclass concatenated with the hypen and the savingsNumber of the new account.
		accountNumber = super.getAccountNumber()+ "-" + this.savingsNumber;
	}
	
	
	//This method will calculate one month's worth of interest on 
	//the balance and deposit it into the account.
	public void postInterest()
	{
		super.setBalance(super.getBalance() + ((super.getBalance()*rate)/12));
	}
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
}
