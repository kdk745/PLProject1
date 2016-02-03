package cannata.Customer;
import java.util.Scanner;
/**
 * Created by kaynekhoury on 2/3/16.
 */
public class CustomerDB {
    public static void main(String[] args) {
        //
        Customer c1 = new Customer (1001);
        c1.setName("Barbara White");
        c1.setAddress("3400 Richmond Parkway #3423");
        c1.setCity("Bristol");
        c1.setState("CT");
        c1.setPostalCode(06010);

        Customer c2  = new Customer (1002);
        c2.setName("Karl Vang");
        c2.setAddress("327 Franklin Street");
        c2.setCity("Edina");
        c2.setState("MN");
        c2.setPostalCode(55435);

        Customer c3 = new Customer (1003);
        c3.setName("Ronda Chavan");
        c3.setAddress("518 Commanche Dr");
        c3.setCity("Greensboro");
        c3.setState("NC");
        c3.setPostalCode(27410);


        System.out.println("Welcome to the Customer Viewer");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            //get input from user
            System.out.print("Enter a customer number:");
            int customerId = sc.nextInt();

            if (customerId == 1001) {
                System.out.println(c1.getName());
                System.out.println(c1.getAddress());
                System.out.println(c1.getCity() + ", " + c1.getState() + " " + c1.getPostalCode());
            }else if(customerId == 1002){
                System.out.println(c2.getName());
                System.out.println(c2.getAddress());
                System.out.println(c2.getCity() + ", " + c2.getState() + " " + c2.getPostalCode());
            }else if(customerId == 1003){
                System.out.println(c3.getName());
                System.out.println(c3.getAddress());
                System.out.println(c3.getCity() + ", " + c3.getState() + " " + c3.getPostalCode());
            }else{
                System.out.println("There is no customer number "+ customerId + " in our records.");
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
