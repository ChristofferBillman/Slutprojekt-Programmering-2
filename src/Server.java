/*TODO:
 * Create class for database handling. DONE
 * finish Db class.
 * Connect login views to client.java. DONE
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    /**
     * Main method. Currently not working. Supposed to start new threads for each new user on connect.
     * @param args No arguments are used.
     */
    public static void main(String[] args) {
        ServerSocket ss;
        try {
            System.out.println("första");
            ss = new ServerSocket(3333);
            Socket socket = ss.accept();
            System.out.println("hej");
            ObjectInputStream oin=new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oout=new ObjectOutputStream(socket.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            boolean connected = true;
            System.out.println("User " + "" + " connected.");
            System.out.println("ok");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
