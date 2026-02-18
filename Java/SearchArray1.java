import java.util.Scanner;

public class SearchArray1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int index = -1;

        // Searching element
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        // Output result
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");

        sc.close();
    }
}
