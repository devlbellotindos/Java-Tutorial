import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeClass {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("MMM dd, yyyy - hh:mm.ss");  
        
        System.out.println(today);
        System.out.println(today.format(pattern));
        System.out.println("Day of Week: " + today.getDayOfWeek());

        LocalDateTime lastmonth = today.minusMonths(1);
        LocalDateTime nextmonth = today.plusMonths(1);

        System.out.println("Last month: " + lastmonth.format(pattern));
        System.out.println("Next month: " + nextmonth.format(pattern));
    }
}
