/*TODO:
 * Create class for database handling.
 * Create Database. DONE
 * Connect login views to client.java.
 */

import java.io.*;
import java.net.ServerSocket;

public class Server {

    public Server() {

        // Create socket.
        ServerSocket ss;
        try {
            ss = new ServerSocket(3333);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
