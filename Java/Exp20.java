import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(int number) {
        super("Negative input detected: " + number + " is not allowed!");
    }
}

public class Exp20 {
    static void validateNumber(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int sum = 0, count = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = sc.nextInt();
            try {
                validateNumber(num);
                sum += num;
                count++;
            } catch (NegativeNumberException e) {
                System.out.println("Exception: " + e.getMessage());
                System.out.println("Skipping this input...\n");
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("\nSum: " + sum);
            System.out.println("Valid inputs: " + count);
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("No valid positive integers entered.");
        }
        sc.close();
    }
}
