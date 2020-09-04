import java.time.LocalTime;

public class LocalTimeClass {
    public static void main(String[] args) {
        LocalTime current = LocalTime.now();

        LocalTime pastTime = current.minusMinutes(90);
        LocalTime futureTime = current.plusMinutes(90);

        System.out.println("Now: " + current);
        System.out.println("90 Minutes Ago: " + pastTime);
        System.out.println("90 Minutes From Now: " + futureTime);
    }
}
