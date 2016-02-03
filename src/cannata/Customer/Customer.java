package cannata.Customer;

public class Customer{
    private int Id;
    public void setId(int i) {Id = i;}
    public int getId() {return Id;}
    //public Customer(int Id) {this.Id = Id;}


    private String Name;
    public void setName(String n) {Name = n;}
    public String getName() {return Name;}

    private String Address;
    public void setAddress(String a) {Address = a;}
    public String getAddress() {return Address;}

    private String City;
    public void setCity(String c) {City = c;}
    public String getCity() {return City;}

    private String State;
    public void setState(String s) {State = s;}
    public String getState() {return State;}

    private int postalCode;
    public void setPostalCode(int p) {postalCode = p;}
    public int getPostalCode() {return postalCode;}


    public String getNameAndAddress() {return Name+"\n"+Address+"\n"+City+", "+State+" "+postalCode+"\n";}

}
