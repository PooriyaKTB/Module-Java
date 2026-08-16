package RentalSummaryGenerator;

import java.time.LocalDate;

public class Contract {

    private final String customerName;
    private final int customerAge;
    private final LocalDate startDate;
    private final double carPrice;
    private final int contractLengthYears;

    public Contract(Customer customer, LocalDate startDate, double carPrice, int contractLengthYears) {
        this.customerName = customer.getCustomerName();
        this.customerAge = customer.getCustomerAge();
        this.carPrice = carPrice;
        this.contractLengthYears = contractLengthYears;
        this.startDate = startDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public int getContractLengthYears() {
        return contractLengthYears;
    }
}
