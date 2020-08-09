import java.util.Scanner;

public class CodeExer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;
        int countVowel = 0;
        int countConsonant = 0;

        System.out.print("Please enter message: ");

        message = scanner.nextLine();
        scanner.close();

        for (char letter: message.toCharArray()) {
            if (letter == 'a' || letter == 'A' || 
                letter == 'e' || letter == 'E' || 
                letter == 'i' || letter == 'I' || 
                letter == 'o' || letter == 'O' || 
                letter == 'u' || letter == 'U') {
                countVowel++;
            }
            else if (letter == ' ' || letter == '.' || letter == '?' ||
                     letter == '!' || letter == ',') {
                // Do nothing for space
            }
            else {
                countConsonant++;
            }
        }

        System.out.println("Vowels: " + countVowel);
        System.out.println("Consonants: " + countConsonant);
    }
}