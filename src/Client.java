/* TODO:
 * Add event listener to escape key to exit current view.
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    // Create scanner object.
    static Scanner in = new Scanner(System.in);

    /**
     * Main method connects to the server and read/writes to ObjectInput/OutputStream.
     * @param args No arguments are used.
     */
    public static void main(String[] args) {
        // Setup
        View.login();
        Socket socket = null;
        boolean connected = false;
        ObjectInputStream oin = null;
        ObjectOutputStream oout = null;
        BufferedReader br = null;
        // Connect to server.
        connect(socket,oout,oin,connected);

        try {
            Message received = new Message(null,null,null); // received is actually supposed to come from server.
            Message sender = new Message(null,null,null);
            sender.message = "localhost";

            // Running while connected.
            while(connected) {
                sender.message=br.readLine();
                oout.writeObject(sender);
                System.out.println("You: " + sender.message);
                oout.flush();
                received.message = oin.readUTF();
                System.out.println(received.sender + ": " + received.message);
            }
            System.out.println("Anslutningen avbröts.");

            // If connection is lost.
        } catch (IOException e) {
            System.out.println("Anslutningen avbröts\nFörsök igen?\nj/n");
            String input = in.nextLine();
            if (input.equals("j")) {
                connect(socket,oout, oin, connected);
            } else if (input.equals("n")) {
                View.login();
            } else {
            }
            //e.printStackTrace();
        }
    }

    /**
     *
     * @param socket passing variable into connect.
     * @param oout passing variable into connect.
     * @param oin passing variable into connect.
     * @param connected passing variable into connect.
     */
    private static void connect(Socket socket, ObjectOutputStream oout, ObjectInputStream oin, boolean connected) {
        try {
            socket = new Socket("localhost", 3333);
            oin = new ObjectInputStream(socket.getInputStream());
            oout = new ObjectOutputStream(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ansluten.");
            connected = true;
        } catch (IOException e) {
            System.out.println("Anslutningen avbröts\nFörsök igen?\nj/n");
            String input = in.nextLine();
            if (input.equals("j")) {
                connect(socket, oout, oin, connected);
            } else if (input.equals("n")) {
                View.login();
            } else {
            }
        }
    }
}
