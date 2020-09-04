import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar xmas = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy - hh:mm.ss");

        xmas.set(2020, Calendar.DECEMBER, 25);

        System.out.println(xmas.getTime());
        System.out.println(xmas.get(Calendar.WEEK_OF_YEAR));
        System.out.println(formatter.format(xmas.getTime()));
    }
}
