import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Prompt the user for a password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Output the registration message
        System.out.println("["+username + "] has been registered...");

        // Close the scanner
        scanner.close();
    }
}
