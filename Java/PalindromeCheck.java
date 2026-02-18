import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // reverse the string
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        // check palindrome
        if (str.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");

        sc.close();
    }
}
