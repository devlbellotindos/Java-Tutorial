import java.util.Scanner;

public class CodeExer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;
        StringBuilder newMessage = new StringBuilder();
        int repCount = 0;

        System.out.print("Please enter message: ");

        message = scanner.nextLine();
        scanner.close();

        for (char letter: message.toCharArray()) {

            if (Character.isAlphabetic(letter)) {
                char capLetter = Character.toUpperCase(letter);
                if (capLetter == 'A' || capLetter == 'E' || 
                    capLetter == 'I' || capLetter == 'O' || 
                    capLetter == 'U') {
                    
                    repCount = 3;

                }
                else {
                    repCount = 2;
                }
            }
            else {
                repCount = 1;
            }

            for (int counter = 0; counter < repCount; counter++) {
                newMessage.append(letter);
            }
        }

        System.out.println("New message: " + newMessage);
    }
}