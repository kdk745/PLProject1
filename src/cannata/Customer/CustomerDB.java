package cannata.Customer;
import java.util.Scanner;
/**
 * Created by kaynekhoury on 2/3/16.
 */
public class CustomerDB {

    public static Customer getCustomer(int customerId) {

        /*Customer c1 = new Customer(1001);
        c1.setName("Barbara White");
        c1.setAddress("3400 Richmond Parkway #3423");
        c1.setCity("Bristol");
        c1.setState("CT");
        c1.setPostalCode(06010);

        Customer c2 = new Customer(1002);
        c2.setName("Karl Vang");
        c2.setAddress("327 Franklin Street");
        c2.setCity("Edina");
        c2.setState("MN");
        c2.setPostalCode(55435);

        Customer c3 = new Customer(1003);
        c3.setName("Ronda Chavan");
        c3.setAddress("518 Commanche Dr");
        c3.setCity("Greensboro");
        c3.setState("NC");
        c3.setPostalCode(27410);*/

        Customer cust = new Customer();

        cust.setId(customerId);

        if (customerId == 1001) {
            cust.setName("Barbara White");
            cust.setAddress("3400 Richmond Parkway #3423");
            cust.setCity("Bristol");
            cust.setState("CT");
            cust.setPostalCode(06010);
        } else if (customerId == 1002){
            cust.setName("Karl Vang");
            cust.setAddress("327 Franklin Street");
            cust.setCity("Edina");
            cust.setState("MN");
            cust.setPostalCode(55435);
        } else if (customerId == 1003){
            cust.setName("Ronda Chavan");
            cust.setAddress("518 Commanche Dr");
            cust.setCity("Greensboro");
            cust.setState("NC");
            cust.setPostalCode(27410);
        } else {
            return null;
        }

        return cust;
    }

}
