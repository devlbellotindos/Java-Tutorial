import java.util.Scanner;

public class CodeExer7 {
    public static void checkIfLeapYear(Integer year) {
        StringBuilder info = new StringBuilder(year.toString());
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                info.append(" is a leap year.");
            }
            else {
                info.append(" is not a leap year.");
            }
        }
        else {
            if (year % 4 == 0) {
                info.append(" is a leap year.");
            }
            else {
                info.append(" is not a leap year.");
            }
        }
        System.out.println(info);
    }

    public static String digitToString(int digit) {
        String[] numbers = {"zero" , "one", "two", "three", "four", 
                            "five", "six", "seven", "eight", "nine"};
            
        return (numbers[digit] + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        Integer year = scanner.nextInt();
        scanner.close();

        checkIfLeapYear(year);

        StringBuilder info = new StringBuilder(year.toString());
        info.append(" - ");

        int divider = 1000;

        for (int cntr = 1; cntr <= 4; cntr++) {
            info.append(digitToString(year / divider));
            year = year % divider;
            divider /= 10;
        }
        System.out.println(info);
    }
}
