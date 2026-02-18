import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of names with validation
        int n;
        do {
            System.out.print("Enter number of names: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);

        sc.nextLine(); // clear buffer

        String[] names = new String[n];

        // Input names
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            String name;
            do {
                name = sc.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.print("Name cannot be empty. Enter again: ");
                }
            } while (name.isEmpty());

            names[i] = name;
        }

        // Choose sorting order
        System.out.print("Sort in (A)scending or (D)escending order? ");
        char choice = sc.next().toUpperCase().charAt(0);

        // Sorting (case-insensitive)
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        if (choice == 'D') {
            Collections.reverse(Arrays.asList(names));
        }

        // Display sorted names
        System.out.println("\nSorted Names:");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }

        sc.close();
    }
}
