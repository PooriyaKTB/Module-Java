package RentalSummaryGenerator;

import java.time.LocalDate;

public class Rental {

    private final LocalDate dueDate;
    private final double capitalAmount;
    private final double interestAmount;
    private boolean paid;

    public Rental(LocalDate dueDate, double capitalAmount, double interestAmount, boolean isPaid) {
        this.dueDate = dueDate;
        this.capitalAmount = capitalAmount;
        this.interestAmount = interestAmount;
        this.paid = isPaid;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getCapitalAmount() {
        return capitalAmount;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public boolean isPaid() {
        return paid;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "dueDate=" + dueDate +
                ", capitalAmount=" + String.format("%.2f", capitalAmount) +
                ", interestAmount=" + String.format("%.2f", interestAmount) +
                ", paid=" + paid +
                '}';
    }
}
