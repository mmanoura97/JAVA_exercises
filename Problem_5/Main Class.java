import java.util.Scanner; 
public class Main{

	public static void main(String[] args) {
		SavingsAccount SA1 = new SavingsAccount(0, 0.02); //creating object SA1 and setting the rate=0.02 and balance=0
		SA1.deposit(1500); //in that account i just created i deposit 1500 euro
		System.out.println("SA1 balance " + SA1.getBalance()); //printing balance (i can call getBalance because subclass
															   //(SavingsAccount) has inherited the methods of superclass (BankAccount)
		SA1.setInterestRate(0.02); //setting 2% rate
		SA1.addInterest(); //adding at balance the annual interest 
		System.out.println("SA1 balance: " + SA1.getBalance()); //printing final balance
		
		CheckingAccount CA1 = new CheckingAccount(1000); //creating new SavingsAccount with 1000 euro balance
		CA1.deposit(500); //depositing 4 times, 500 euro each time
		CA1.deposit(500); 
		CA1.deposit(500); 
		CA1.deposit(500); 
		System.out.println("CA1 balance: " + CA1.getBalance()); //printing final balance
		
		System.out.println(SA1.toString()); //method toString is from class Object and it prints the object's class and its' address in memory
											//but here because of overriding we print "Balance: ....." 
											//we overrided toString method at BankAccount class (lines:

		//substitution principle: if i have a system, a class, a method that uses objects from a general category
		//(like superclass: BankAccount) then this system, this class, this method can use any objects from subcategories
		//(like subclasses CheckingAccount, SavingsAccount)
		BankAccount BA;
	
		Scanner in = new Scanner(System.in); //creating in for user-computer communication
		int answer;
		System.out.println("What kind of account do you want to create? (1:Normal, 2:Savings)");
		answer = in.nextInt();
		if(answer == 1)
			BA = new BankAccount(1000);  //here reference shows at superclass's (BankAccount) object
		else
			BA = new SavingsAccount(1000, 0.02); //here reference shows at subclass's (SavingsAccount) object
		
		//polymorphic call
		BA.printData(); //so here is called printData either from superclass(BankAccount) either prinData from subclass(SavingsAccount)
						//depending on user's choice

		//we don't know from the beginning which printData will be called (from BankAccount either from SavingsAccount)
		//thus the compiler will delay the linking between the call (BA.printData) to the corresponding method (printData) until the program execution
		//in other words until user chooses what account he needs 
		//this technique is called dynamic binding/late binding between method and class (BankAccount or SavingsAccount)
		
		//so practically no matter what account the user chooses we send the same message (printData) 
		//and this message can have a different result each time since every time the user can respond differently (meaning to choose a different account)
		//in other words, the responses of the user have multiple forms although the message is the same (printData)
		//this is called polymorphism
		
		BankAccount BA2 = new BankAccount(1000);
		SavingsAccount SA2 = new SavingsAccount(1000, 0.02);
		CheckingAccount CA2 = new CheckingAccount(500);
	 
		Bank bank = new Bank(); //in the bank: adding the accounts with the addAccount method
	   
		bank.addAccount(BA2);
		bank.addAccount(SA2);
		bank.addAccount(CA2);
	 
		bank.printAllData(); //printing all acounts' data
							 //polymorphic call
	}                     
}