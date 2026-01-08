package day03_conditionals;

/*
    Learning in this section:
    * Nested logic
    * Decision hierarchy
    * Business rule modeling
 */
public class LoanEligibility {
    public static void main(String[] args) {

        int age = 30;
        int salary = 40_000;

        if (age >= 21) {
            if (salary >= 30_000) {
                System.out.println("Loan Approved!");
            } else {
                System.out.println("Loan Rejected: Salary too low!!");
            }
        } else {
            System.out.println("Loan Rejected: Age criteria not met!!");
        }
    }
}
