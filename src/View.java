import java.util.Scanner;

public class View {
    /**
     * Login method serves the view that prompts users to a login screen.
     */
    public static void login() {
        System.out.println("Välkommen till chatt.\nHar du redan ett konto?\nj/n?");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input.equals("j")) {
            System.out.println("Användarnamn:");
            String username = in.nextLine();
            System.out.println("Lösenord:");
            String pswd = in.nextLine();
            // Compare username and pswd to db values.

        } else if (input.equals("n")) {
            // Run registration view
        } else {
            System.out.println("Felaktig indata. Försök igen.");
            login();
        }
    }
    // Add method for login view. DONE
    // Add method for registration view.
    // Add method for chat view.
    // Add method for chat selection view.
}
