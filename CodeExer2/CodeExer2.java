import java.util.Scanner;

public class CodeExer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String age;

        System.out.print("Please enter name: ");
        name = scanner.nextLine();

        System.out.print("Please enter age: ");
        age = scanner.nextLine();
        scanner.close();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
