import java.util.Scanner;

public class Input {
    public static void main(final String args[]) {

        System.out.print("Enter a word: ");
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Word: " + input);
    }
}
