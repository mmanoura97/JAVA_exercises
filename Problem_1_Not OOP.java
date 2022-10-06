//Not Object Oriented problem on JAVA-Algorithmic code
 
//Make a program that reads as an input the price, the name and the score of a product. Then it shows as an output the best ratio of the products (score/price) thus the best product also.

 import java.util.Scanner; (kanw import ti vivliothiki gia na mporo na xrisimopoiso tin klasi scanner)
 
 public class Main {
	 
	 //creating the main method
	 public static void main(String[] args) {
		 
		 //creating in object of class scanner
		 Scanner in = new Scanner (System.in);
		 
		 //creating the variables i will need
		 String bestName = "";
		 double bestPrice = 1;
		 int bestScore = 0;
		 
		 //creating a boolean variable tou use it on the while loop
		 boolean more = true;
		 
		 //creating the while loop
		 while(more) {
			 
			 //printing a message for the user to understand tha he is needed to type the product name
			 System.out.println("Product name: ");
			 //calling NextLine method to save the name typed by the user in name variable 
			 String name = in.NextLine();
			 
			 //printing a message for the user to understand tha he is needed to type the product price
			 System.out.println("Price: ");
			 //calling NextDouble method to save the price typed by the user in price variable 
			 double price = in.NextDouble();
			 
			 //printing a message for the user to understand tha he is needed to type the product price
			 System.out.println("Score: ");
			 //calling NextInt method to save the score typed by the user in score variable 
			 int score = in.NextInt(); //we consider that the value of score variable is an integer 0-100
			 
		     //finding the best score
			 if (score/price ? bestScore/bestPrice){
				 
				 bestName = name;
				 bestScore = score;
				 bestPrice = price; 
				 
			 }		 
			 
			 //printing an message to the user asking him if there are more products
			 System.out.println("More Products? 1:YES, 2:NO");
			 //calling NextInt method to save the answer typed by the user in answer variable 
			 int answer = in.nextInt(); //kalutera na to dilona eksw apo to while

			 if(answer != 1)
					more = false;

			in.nextLine(); //cleaning input buffer
			
		 }
		 
		 //printing best product
		 System.out.println("Best Name: " + bestName); 
		 System.out.println("Best Price:" + bestPrice);
		 System.out.println("Best Score:" + bestScore);
	 }
	 
 }
 