import java.util.Scanner;

public class                                                                            {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter order of matrix (n x n): ");
        n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean flag = true;

        // Check symmetric
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag)
            System.out.println("Matrix is Symmetric");
        else
            System.out.println("Matrix is NOT Symmetric");
    }
}
