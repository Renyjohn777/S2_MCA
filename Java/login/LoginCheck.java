import java.util.Scanner;

public class LoginCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Predefined correct credentials
        String correctUsername = "admin";
        String correctPassword = "1234";

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {
            // Check credentials
            if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
                throw new InvalidLoginException("Invalid Username or Password!");
            }

            System.out.println("Login Successful!");

        } catch (InvalidLoginException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}