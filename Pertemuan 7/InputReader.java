import java.util.Scanner;

public class InputReader {
    private Scanner scanner;
    
    public InputReader(){
        scanner = new Scanner(System.in);
    }

    public String getInput(){
        String input = "";
        while (input.trim().isEmpty()) {
            System.out.print("> ");
            input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Please enter your message.");
            }
        }
        return input;
    }
}