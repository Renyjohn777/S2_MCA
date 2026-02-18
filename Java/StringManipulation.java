import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // i. Find the length of the string
        System.out.println("Length of string: " + str.length());

        // ii. Character at second and fourth position
        if (str.length() >= 4) {
            System.out.println("Character at 2nd position: " + str.charAt(1));
            System.out.println("Character at 4th position: " + str.charAt(3));
        } else {
            System.out.println("String too short to get 2nd and 4th characters");
        }

        // iii. Substring using start index only
        if (str.length() >= 3)
            System.out.println("Substring from index 2: " + str.substring(2));

        // iv. Substring using start and end index
        if (str.length() >= 5)
            System.out.println("Substring from index 1 to 4: " + str.substring(1, 4));

        // v. Concatenate another string
        System.out.print("Enter another string to concatenate: ");
        String str2 = sc.nextLine();
        System.out.println("Concatenated string: " + str.concat(str2));

        // vi. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // vii. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        sc.close();
    }
}
