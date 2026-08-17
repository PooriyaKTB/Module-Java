package rentalSummaryGenerator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OneYearContractRentalGenerator implements RentalCalculator {

    @Override
    public List<Rental> generateRentals(Contract contract) {

        List<Rental> rentals = new ArrayList<>();

        for (int i = 1; i <= contract.getContractLengthYears() * 12; i++) {

            LocalDate nextRental = contract.getStartDate().plusMonths(i);
            rentals.add(new Rental(nextRental, contract.getCarPrice() / 12, (contract.getCarPrice() * 0.02) / 12, !nextRental.isAfter(LocalDate.now())));
        }

        return rentals;
    }
}
