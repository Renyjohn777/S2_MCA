import java.io.*;
import java.util.Scanner;

public class Exp25 {
    public static void main(String[] args) {
        String filename = "output.txt";
        Scanner sc = new Scanner(System.in);

        // Writing to file
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Enter text to write to file (type 'STOP' to end):");
            String line;
            while (!(line = sc.nextLine()).equalsIgnoreCase("STOP")) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            System.out.println("\nData successfully written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Reading from file
        System.out.println("\nReading contents of " + filename + ":");
        System.out.println("-----------------------------");
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
