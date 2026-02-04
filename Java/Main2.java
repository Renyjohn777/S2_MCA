import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter real part of first number: ");
        int a = sc.nextInt();

        System.out.print("Enter imaginary part of first number: ");
        int b = sc.nextInt();

      
        System.out.print("Enter real part of second number: ");
        int c = sc.nextInt();

        System.out.print("Enter imaginary part of second number: ");
        int d = sc.nextInt();

       
        int realSum = a + c;
        int imagSum = b + d;

        
        System.out.println("Sum = " + realSum + " + " + imagSum + "i");
    }
}
