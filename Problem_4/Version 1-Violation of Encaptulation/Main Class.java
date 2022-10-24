public class Main {
	
	//creating object TimeStamp
	public static void main(String[] args){
		TimeStamp T1 = new TimeStamp(23, 15, 40);
		T1.printTime(); //the time is printed without errors
	
	System.out.println("Initially the time is printed correctly because T1 has not yet interacted with other classes."
						+ "However, since the attributes hour, minute, second are public the client's programmer understands that he can interfere with them." 
						+ "Therefore, he adds to the attribute as many hours as needed depending on his time zone.");
	
	//adding 1 hour and then adding another hour
	T1.hour++; //auksanei kata 1 wra
	T1.hour++; //auksanetai gia alli 1 wra
	
	//printing time
	T1.printTime(); //the time now is 25:15:40 -- therefore we have invalid time
	
	System.out.println("Now it appears that an invalid time is displayed. This happens precisely because we violated encapsulation so the attributes were public"
						+ "and interacted with another class. Every program has certain conditions that are invariant. These invariant conditions are only required" 
						+ "to be known by the program designer. Therefore, the user or any other programmer using the program should not have the right to interfere" 
						+ "with these invariant conditions. This is achieved by making the attributes private. The only way that anything else beyond the class of the" 
						+ "object itself will have access to the attributes is through a method. This means that the original designer of the program allows this access"
						+ "by making sure that there are no invalid values given within the method.");
	}
}