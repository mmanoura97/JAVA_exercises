import java.util.*;
public class Bank {
    
    private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>(); //array that includes user's accounts 
                                                                            //array type is BankAccount so i can use subclasses's accounts too 
																			
    public void addAccount(BankAccount account) { //parameter type is BankAccount so i can use subclasses's objects too 
        accounts.add(account); //so now i don't need to create new method for eache account
	}
    
    public void printAllData() { //i need to print all accounts' data 
        for (int i=0; i<accounts.size(); i++) {
            BankAccount account = accounts.get(i); //method get keeps element from item i (accounts array) and puts it into account 
            account.printData(); //then prints it
        }
		
    }
}