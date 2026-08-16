package RentalSummaryGenerator;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class RentalSummaryService {

    private Optional<RentalSummary> generateRentalSummary(Contract contract) {

        RentalSummary summary = new RentalSummary(contract.getCustomerName(), contract.getCustomerAge(), contract.getStartDate(), contract.getStartDate().plusYears(contract.getContractLengthYears()));

        RentalCalculator rentalCalculator;

        if (contract.getContractLengthYears() == 1) {
            rentalCalculator = new OneYearContractRentalGenerator();
        } else if (contract.getContractLengthYears() == 3) {
            rentalCalculator = new ThreeYearsContractRentalGenerator();
        } else {
            throw new IllegalArgumentException();
        }

        summary.setRentals(rentalCalculator.generateRentals(contract));

        List<Rental> rentals = summary.getRentals();

        if (rentals.get(rentals.size() - 1).getDueDate().isBefore(LocalDate.now()) || rentals.get(rentals.size() - 1).getDueDate().isEqual(LocalDate.now())) {
            return Optional.empty();
        }

        summary.setNextDue(rentals.stream().filter(r -> (r.getDueDate()).isAfter(LocalDate.now())).map(r -> r.getDueDate()).findFirst());
        summary.setTotalAmount(rentals.stream().map(Rental::getInterestAmount).reduce(0.0, (acc, cur) -> acc + cur), contract.getCarPrice());
        summary.setOutstandingAmount(rentals.stream().filter(r -> (r.getDueDate()).isAfter(LocalDate.now())).mapToDouble(r -> r.getCapitalAmount() + r.getInterestAmount()).reduce(0, (acc, cur) -> acc + cur));
        summary.setOutstandingCount(rentals.stream().filter(r -> (r.getDueDate()).isAfter(LocalDate.now())).count());
        summary.setSettled(rentals.stream().map(r -> r.getDueDate().isAfter(LocalDate.now())).findAny().isPresent());

        return Optional.of(summary);
    }

    void printRentalSummary(Contract contract) {

        Optional<RentalSummary> summaryOptional = generateRentalSummary(contract);

        if (summaryOptional.isPresent()) {
            System.out.println(summaryOptional.get());
        } else {
            System.out.println("Contract for " + contract.getCustomerName() + " is completed.");
        }
    }
}
