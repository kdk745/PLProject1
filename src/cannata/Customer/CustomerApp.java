package cannata.Customer;

import java.util.Scanner;

/**
 * Created by kaynekhoury on 2/3/16.
 */
public class CustomerApp {
    public static void main(String[] args) {
        //
        System.out.println("Welcome to the Customer Viewer");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            //get input from user
            System.out.print("Enter a customer number:");
            int customerId = sc.nextInt();



            Customer cx = new Customer();
            cx = CustomerDB.getCustomer(customerId);

            if (cx!=null) {
                System.out.print(cx.getNameAndAddress());
            }else{
                System.out.println("There is no customer number "+customerId+" in our records.");
            }
            // see if the user wants to continue
            System.out.println();
            System.out.print("Display another customer? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Bye!");
    }
}
