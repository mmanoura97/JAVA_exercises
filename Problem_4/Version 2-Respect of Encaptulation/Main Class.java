public class Main {
	
	//creating object TimeStamp
	public static void main(String[] args){
		TimeStamp T1 = new TimeStamp(23, 15, 40);
		T1.printTime(); //the time is printed without errors
	
	//calling method increaseHour 
	//without interfering with the invariant conditions
	T1.increaseHour();
	T1.increaseHour(); //we increased the time by two hours without interfering with the invariant conditions
	
	//printing time
	T1.printTime();
	
	System.out.println("Now it appears that the time printed is valid. We ensured with the private attributes"
						+ "that encapsulation will not be violated which means that it is not possible to interfere" 
						+ "with the invariant conditions. We gave the user the ability via a method to increase the " 
						+ "time, ensuring that it is not possible to give an invalid time (with an if-statement).");
	}
}