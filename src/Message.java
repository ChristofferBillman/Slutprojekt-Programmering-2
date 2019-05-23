public class Message {

    String message;
    String recipient;
    String sender;

    Message(String message, String recipient, String sender) {

        this.recipient = recipient; // ip:port
        this.sender = sender; // ip:port
        this.message = message; // String
    }
}
