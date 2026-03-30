import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server waiting for client...");

            Socket s = ss.accept(); // wait for client connection
            System.out.println("Client connected!");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String msg = br.readLine(); // read message from client
            System.out.println("Client says: " + msg);

            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            pw.println("Hello Client, message received!");

            br.close();
            pw.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}