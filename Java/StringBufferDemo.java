import java.util.Scanner;

public class StringBufferDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read first string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create StringBuffer
        StringBuffer sb = new StringBuffer(input);

        // Display capacity
        System.out.println("Capacity of StringBuffer: " + sb.capacity());

        // Reverse and convert to uppercase
        sb.reverse();
        String reversedUpper = sb.toString().toUpperCase();
        System.out.println("Reversed & Uppercase: " + reversedUpper);

        // Read another string
        System.out.print("Enter another string to append: ");
        String second = sc.nextLine();

        // Append new string
        sb.reverse(); // bring original order back
        sb.append(second);

        // Display final result
        System.out.println("After appending: " + sb);
    }
}