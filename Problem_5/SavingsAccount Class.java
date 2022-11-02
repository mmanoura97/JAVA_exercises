//subclass
public class SavingsAccount extends BankAccount {
	
	private double interestRate; //rate 
	
	//construtor: constructors can't be inherited
	public SavingsAccount(double initialAmount, double rate) {
		super(initialAmount); //calling superclass's constructor (the correct constructor is selected 
							  //depending on whether the type and number of parameters match the parameters of the current constructor  
		interestRate = rate; 
	}
	
	//methodos that sets the rate
	public void setInterestRate(double rate) {
		interestRate = rate;
	}
	
	//method that adds the annual interest to the balance 
	public void addInterest() {
		double interest = balance * interestRate; //interest = balance * rate
												 // i can use balance attribute because it's protected not private									     //dld tha egrafa: double interest = getBalance() * interestRate; 
		balance = balance + interest;
	}
	
	 //method that prints account's data
    public void printData() { //overriding with printData from BankAccount
        System.out.println("Savings Account");
        System.out.println("Balance: " + balance + " rate: " + interestRate);
    }

}
