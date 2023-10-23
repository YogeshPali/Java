import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the string input
        String userInput = scanner.nextLine();

        // Display the entered string
        System.out.println("You entered: " + userInput);

    }
}
