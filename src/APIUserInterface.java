import java.util.*;

public class APIUserInterface {
    private Scanner input = new Scanner(System.in);

    public String mainMenuPrompt()
    {
        boolean validInput = false;
        String response = null;
        System.out.println("Enter a name to lookup:");
        System.out.println("Q) Quit");
        response = input.nextLine().toUpperCase();
        return response;
    }
}
