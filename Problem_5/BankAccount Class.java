//superclass
public class BankAccount{
	
	//class attribute
	protected double balance; //protected attribute: attribute is visible from subclasses	
	
	//constructor 
	public BankAccount (){
	}
	
	//constructor #2
	public BankAccount (double amount){
		balance = amount;
	}
	
	//method that allows to get balance 
	public double getBalance(){ //if attribute balance was private i would use this method into subclasses
		return balance;
	}
	
	//deposit method: when i deposit an amount it gets added to the balance 
	public void deposit (double amount){
		balance += amount;
	}
	
	//twra thelw na epikalipsw ti methodo toString pou klironomw apo tin Object
	//overriding toString method to print: "Balance: ....... " and not "class@address_on_computers_memmory"
	public String toString() {
	    return ("Balance: " + balance + " printed via toString method");
	}
    
	//method that prints account's data
    public void printData() { //overriding with printData from BankAccount
        System.out.println("Normal Bank Account");
        System.out.println("Balance: " + balance);
    }

    

}