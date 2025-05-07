import java.util.Scanner;

// Custom Exception Class
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

// Authentication Logic (Main Class)
public class Authen  {

    // Hardcoded valid credentials
    private static final String VALID_USERNAME = "ajay";
    private static final String VALID_PASSWORD = "123";

    // Method to authenticate user
    public static void authenticate(String username, String password) throws AuthenticationException {
        if (!username.equals(VALID_USERNAME) || !password.equals(VALID_PASSWORD)) {
            throw new AuthenticationException("Invalid username or password!");
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the login credentials
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Try to authenticate the user
        try {
            authenticate(username, password);  // If credentials match, proceed to try block
            System.out.println("Login successful!");
        } catch (AuthenticationException e) {  // If credentials do not match, proceed to catch block
            System.out.println("Authentication failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

