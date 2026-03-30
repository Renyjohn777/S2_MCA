import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000); // connect to server

            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            pw.println("Hello Server! This is Client.");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String response = br.readLine(); // read server response
            System.out.println("Server says: " + response);

            br.close();
            pw.close();
            s.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}