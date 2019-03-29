/*TODO:
 * Create class for database handling.
 */


import java.io.*;
import java.net.ServerSocket;

public class Server {

    public Server() {

        ServerSocket ss;
        try {
            ss = new ServerSocket(3333);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
