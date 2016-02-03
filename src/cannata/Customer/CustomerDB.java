package cannata.Customer;

public class CustomerDB {

    public static Customer getCustomer(int customerId) {

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