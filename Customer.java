public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;

    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String firstName,String lastName,String socSecurityNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }

    public static void main(String[] args) {
        Customer[] customers = new Customer[3];

        Customer c1 = new Customer("Gam","Hpang","12345");
        c1.setBillingAddress(new Address("1st street","Chicago","Chicago","11111"));
        c1.setShippingAddress(new Address("2st street","Chicago","Chicago","11111"));

        Customer c2 = new Customer("Sam","Winchester","123456789");
        c2.setBillingAddress(new Address("1000 North 4th street","Fairfield","IOWA","52557"));
        c2.setShippingAddress(new Address("1000 North 4th street","Fairfield","IOWA","52557"));

        Customer c3 = new Customer("Dean","Winchester","567688772");
        c3.setBillingAddress(new Address("19th street","Fairfield","IOWA","52557"));
        c3.setShippingAddress(new Address("19th street","Fairfield","IOWA","52557"));

        customers[0] = c1;
        customers[1] = c2;
        customers[2] = c3;

        for(Customer c:customers){
            if(c.billingAddress.getCity().equals    ("Chicago")){
                System.out.println(c);
            }
        }
    }
}

class Address{
    private String street;
    private String city;
    private String state;
    private String zip;

    Address(String street,String city,String state,String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }
}
