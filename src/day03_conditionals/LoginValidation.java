package day03_conditionals;

/**
    I have learned:
    * && (AND)
    * || (OR)
    * .equals() instead of == for strings
    * Real authentication logic basics
 */
public class LoginValidation {
    public static void main(String[] args) {

        String username = "admin";
        String password = "3478";

        if (username.equals("admin") && password.equals("3478")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password!");
        }
    }
}
