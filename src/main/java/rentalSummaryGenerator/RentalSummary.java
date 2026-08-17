package rentalSummaryGenerator;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class RentalSummary {

    private final String customerName;
    private final int customerAge;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private List<Rental> rentals;
    private LocalDate nextDue;
    private double totalAmount;
    private double outstandingAmount;
    private long outstandingCount;
    private boolean isSettled;

    public RentalSummary(String customerName, int customerAge, LocalDate startDate, LocalDate endDate) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public LocalDate getEndDate() {
        return endDate;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public Optional<LocalDate> getNextDue() {
        return Optional.ofNullable(this.nextDue);
    }

    public void setNextDue(LocalDate nextDue) {
        this.nextDue = nextDue;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalInterestAmount, double capitalAmount) {
        this.totalAmount = totalInterestAmount + capitalAmount;
    }

    public double getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(double outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    public void setOutstandingCount(long outstandingCount) {
        this.outstandingCount = outstandingCount;
    }

    public boolean isSettled() {
        return isSettled;
    }

    public void setSettled(boolean settled) {
        isSettled = settled;
    }

    @Override
    public String toString() {
        return "RentalSummary{" +
                "customerName='" + customerName + '\'' +
                ", customerAge=" + customerAge +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", nextDue=" + nextDue +
                ", totalAmount=" + String.format("%.2f", totalAmount) +
                ", outstandingAmount=" + String.format("%.2f", outstandingAmount) +
                ", outstandingCount=" + outstandingCount +
                ", isSettled=" + isSettled +
                ", rentals=" + rentals +
                '}';
    }
}
