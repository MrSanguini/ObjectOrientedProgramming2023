/**
 * 
 */
package gh.edu.ashesi.OOPExample1package;
import java.util.Scanner;
/**
 * @author dadjepon
 *
 */
public class Example2_Essentials {
    /**
	 * @param args
	 */
	public static void main(String[] args) {
        double discount = 0;

        //Initializing Scanner
		Scanner keyboard = new Scanner(System.in);
        
        //Asking for customer Status, saved to customerStatus variable.
        System.out.println("Please enter your status. (Student/Staff/Faculty/Visitor)");
        String customerStatus = keyboard.nextLine();

        //Checking if customer is a student, and applying discount if so.
        if(customerStatus.equalsIgnoreCase("Student")){
            discount = 0.25;
            System.out.println("As a student, you get a 25% discount on prices!\n");}
		
        System.out.println("Please enter the name of the product");
        String productName = keyboard.nextLine();

        System.out.println("Please enter the price of the product");
		double productPrice = keyboard.nextDouble();

        System.out.println("Please enter the quantity you wish to buy");
		int productQuantity = keyboard.nextInt();

		double cost = (productPrice - (productPrice * discount)) * productQuantity;
		System.out.println("The cost of these " + productName + "'s is GHS" + cost);
        keyboard.close();
	}

}
