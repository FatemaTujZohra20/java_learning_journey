package day03_conditionals;

/**
    Learning:
    * Fail fast principle
    * Cleaner logic
    * Used heavily in production systems
 */
public class GuardClauseExample {
    public static void main(String[] args) {
        int amount = -100;

        // Guard clause: fail fast
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        System.out.println("Processing payment of: " + amount);
    }
}
