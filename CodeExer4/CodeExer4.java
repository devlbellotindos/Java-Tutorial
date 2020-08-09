import java.util.Scanner;

public class CodeExer4 {

    public static void checkIfLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            }
            else {
                System.out.println(year + " is not a leap year.");
            }
        }
        else {
            if (year % 4 == 0) {
                System.out.println(year + " is a leap year.");
            }
            else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }

    public static void digitToString(int digit) {
        switch (digit) {
            case 0:
                System.out.print("zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        checkIfLeapYear(year);

        System.out.print(year + " - ");

        int divider = 1000;

        for (int cntr = 1; cntr <= 4; cntr++) {
            digitToString(year / divider);
            year = year % divider;
            divider /= 10;
        }
    }
}
