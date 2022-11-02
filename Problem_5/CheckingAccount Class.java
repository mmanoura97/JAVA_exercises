//subclass
public class CheckingAccount extends BankAccount
{
	private int transactionsCounter; //transactions counter
   
    //constructor
    public CheckingAccount (double initialAmount) {
		super (initialAmount);
		transactionsCounter = 0;
	} 

	//deposit method: overriding deposit method (BankAccount Class) by adding a new fuctionality
    public void deposit (double amount) {
    transactionsCounter++;	//the new functionality i added
    super.deposit (amount);	//i am adding "super." because i need to call deposit method from souperclass (BankAccount) 
							//not present deposit method (this way we would heading on eternal loop)
    if (transactionsCounter > 3)	//
		deductFees ();		//if transactions > 3 with deductFees method i deduct a certain amount from balance
    }
	
	//method that deducts 0.5 euro from balance
	public void deductFees () {
		balance -= 0.5;
	} 
	
	//method that prints account's data
    public void printData() { //overriding with printData from BankAccount
        System.out.println("Checking Account");
        System.out.println("Balance: " + balance + " free limit: 3 transactions"); 
    }
 
}