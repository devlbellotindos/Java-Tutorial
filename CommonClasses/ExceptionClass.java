import java.util.Scanner;

public class ExceptionClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 20;

        System.out.print("Please enter a number: ");
        Integer number2 = scanner.nextInt();
        scanner.close();

        try {
            System.out.println("Number is : " + number1/number2);
        } catch (ArithmeticException e){
           System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception Info: " + e);
        } finally {
            System.out.println("Done.");
        }
    }
}
