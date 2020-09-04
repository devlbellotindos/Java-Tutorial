import java.util.ArrayList;
import java.util.Scanner;

public class CodeExer9 {
    public static void main(String[] args) {
        ArrayList<String> monthNames = new ArrayList<>();
        ArrayList<Integer> monthDays = new ArrayList<>();
        monthNames.add("January");
        monthNames.add("February");
        monthNames.add("March");
        monthNames.add("April");
        monthNames.add("May");
        monthNames.add("June");
        monthNames.add("July");
        monthNames.add("August");
        monthNames.add("September");
        monthNames.add("October");
        monthNames.add("November");
        monthNames.add("December");
        monthDays.add(31);
        monthDays.add(29);
        monthDays.add(31);
        monthDays.add(30);
        monthDays.add(31);
        monthDays.add(30);
        monthDays.add(31);
        monthDays.add(31);
        monthDays.add(30);
        monthDays.add(31);
        monthDays.add(30);
        monthDays.add(31);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        Integer month = scanner.nextInt();
        scanner.close();

        System.out.print(monthNames.get(month-1) + " has " + monthDays.get(month-1).toString() + " days.");
    }
}
