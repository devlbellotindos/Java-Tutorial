import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CodeExer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        System.out.print("Please enter a year: ");

        year = scanner.nextInt();
        scanner.close();

        System.out.println("Friday the 13th Dates: ");
        LocalDate dates = LocalDate.of(year, 1, 13);

        for (int cntr = 1; cntr <= 12; cntr++) {
            if (dates.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println(dates);
            }

            dates = dates.plusMonths(1);
        }
    }
}
