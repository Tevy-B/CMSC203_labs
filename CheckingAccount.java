package cmsc_203Lab9;

public class CheckingAccount extends BankAccount
{
	private static final double FEE = 0.15; //cost of clearing one check 
	
	public CheckingAccount(String name, double initialAmount)
	{
		super(name, initialAmount); 
		//It should initialize accountNumber to be the current value in accountNumber concatenated with –10 
		super.setAccountNumber(getAccountNumber()+ "-10");
	}
	
	//overrides the withdraw method in the superclass
	public boolean withdraw(double amount)
	{
		//take the amount to withdraw, add to it the fee for check clearing, 
		//and call the withdraw method from the superclass
		double totalAmount = amount + FEE;
		//The method that overrides it must also return the same true or false 
		//that was returned from the call to the withdraw method from the superclass.
		return super.withdraw(totalAmount);
	}
}
