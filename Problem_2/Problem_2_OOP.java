//Object Oriented problem on JAVA
 
//Make a program that reads as an input the price, the name and the score of a product. Then it shows as an output the best ratio of the products (score/price) thus the best product also.
//The same problem with Problem_1_Not_OOP but from Object Oriented point of view
 
import java.util.Scanner; 
 
//creating the Product class that includes all the product's attributes
 class Product {
	 
	 //class attributes
	 private String name; 
	 private double price;
	 private int score;
	 
	 
	 //creating a constructor method that initializes the objects
	 public Product () {
		 name = "";
		 price = 1; //because i can't devide with zero
		 score = 0;	 
	 }
	 
	 
	 //creating a method that prints data (so ti needs to be public)
	 public void.printData() {
		 System.out.println("Name: " + name);
		 System.out.println("Price: " + price);
		 System.out.println("Score: " + scre);
	 }
	 
	 
	 //creating a method that saves data (so ti needs to be public)	 
	 public void.read() {
		 //creating an object (in) to call class scanner and make possible the user-console communication
		 Scanner in = new Scanner (System.in);
		 
		 System.out.println("Product name: ");
		 String name = in.NextLine();
		 System.out.println("Price: ");
		 double price = in.NextDouble();
		 System.out.println("Score: ");
		 int score = in.NextInt();
	 }
	
	
	//creating a method that compares current product with another product (so ti needs to be public)
	//that method returns a boolean (true/false) 
	public boolean is_better_than (Product other) {
		if(score/price > other.score/other.price)
			return true;
		else
			return false;
	}
 }
 
 
//creating the Main class that creates all the objects we need
 public class Main {
	 
	//creating the main method
	public static void main(String[] args) {
		//creating an object (in) to call class scanner and make possible the user-console communication
		Scanner in = new Scanner (System.in);
		
		//creating a new object (best) - constructor is called an new object is created and that object is saved in best 
		Product best = new Product();
		
		boolean more = true;
		while(more) {
			//creating a new object (current) - constructor is called an new object is created and that object is saved in current 
			Product current = new Product();
		
			//calling read method on current object
			current.read();
			
			//compare with is_better_than method objects current and best
			if(current.is_better_than(best)) {
				best = current;
			}
		 
			 //printing an message to the user asking him if there are more products
			 System.out.println("More Products? 1:YES, 2:NO");
			 
			 //calling NextInt method to save the answer typed by the user in answer variable 
			 int answer = in.nextInt(); //kalutera na to dilona eksw apo to while
			 
			 if(answer != 1)
					more = false;
					
			in.nextLine();  //cleaning input buffer
			
		 }
		 
		 //calling method printData and printing the best product's data
		 best.printData();
	
	 }
	 
 }
 
