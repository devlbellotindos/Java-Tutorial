import java.time.LocalDate;

public class LocalDateClass {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        
        LocalDate yesterday = today.minusDays(1);
        LocalDate lastmonth = today.minusMonths(1);
        LocalDate nextmonth = today.plusMonths(1);

        System.out.println("Today: " + today);
        System.out.println("Yerterday: " + yesterday);
        System.out.println("Last month: " + lastmonth);
        System.out.println("Next month: " + nextmonth);
        System.out.println("Day of Week: " + today.getDayOfWeek());
    }
}
