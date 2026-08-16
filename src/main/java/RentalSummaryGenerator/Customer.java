package RentalSummaryGenerator;

public class Customer {

    private final String customerName;
    private final int customerAge;

    public Customer(String firstName, String lastName, int customerAge) {
        this.customerName = firstName + " " + lastName;
        this.customerAge = customerAge;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    @Override
    public String toString() {
        return customerName + " " + customerAge;
    }
}
