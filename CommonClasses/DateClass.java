import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy - hh:mm.ss");

        System.out.println(now);
        System.out.println(formatter.format(now));
    }
}
