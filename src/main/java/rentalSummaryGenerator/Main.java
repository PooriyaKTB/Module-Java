package rentalSummaryGenerator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Pooriya", "ketabi", 34);
        Contract contract1 = new Contract(customer1, LocalDate.now(), 30000, 3);

        System.out.println(customer1.getCustomerName());
        System.out.println(contract1.getCustomerName());

        Contract oneYearContract = new Contract(new Customer("John", "Smith", 25), LocalDate.of(2025, 8, 12), 10000, 1);
        Contract twoYearContract = new Contract(new Customer("Michael", "Jones", 56), LocalDate.of(2025, 12, 12), 20000, 2);
        Contract threeYearContract = new Contract(new Customer("Jane", "Doe", 77), LocalDate.of(2024, 4, 1), 50000, 3);
        Contract completedContract = new Contract(new Customer("Rosie", "Parker", 47), LocalDate.of(2021, 7, 10), 40000, 3);

        RentalSummaryService rentalSummaryService = new RentalSummaryService();
        try {
            rentalSummaryService.printRentalSummary(oneYearContract);
            rentalSummaryService.printRentalSummary(threeYearContract);
            rentalSummaryService.printRentalSummary(completedContract); // Should print a message to say the contract is complete
            rentalSummaryService.printRentalSummary(twoYearContract); // Should throw a suitable error
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}