import java.util.Scanner;

public class CodeExer5Better {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;
        int countVowel = 0;
        int countConsonant = 0;

        System.out.print("Please enter message: ");

        message = scanner.nextLine();
        scanner.close();

        for (char letter: message.toCharArray()) {

            if (Character.isAlphabetic(letter)) {
                letter = Character.toUpperCase(letter);
                if (letter == 'A' || letter == 'E' || 
                    letter == 'I' || letter == 'O' || 
                    letter == 'U') {
                    countVowel++;
                }
                else {
                    countConsonant++;
                }
            }
        }

        System.out.println("Vowels: " + countVowel);
        System.out.println("Consonants: " + countConsonant);
    }
}    
