import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c;

        
        System.out.print("Enter number of rows: ");
        r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] sum = new int[r][c];

       
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }

     
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

      
        System.out.println("Sum of matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
