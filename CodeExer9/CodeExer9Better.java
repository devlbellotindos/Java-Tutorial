import java.util.ArrayList;
import java.util.Scanner;

class MonthInfo {
    String name;
    int days;
    
    public MonthInfo(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }
}

public class CodeExer9Better {
    public static void main(String[] args) {
        ArrayList<MonthInfo> monthList = new ArrayList<>();

        monthList.add(new MonthInfo("January", 31));
        monthList.add(new MonthInfo("February", 29));
        monthList.add(new MonthInfo("March", 31));
        monthList.add(new MonthInfo("April", 30));
        monthList.add(new MonthInfo("May", 31));
        monthList.add(new MonthInfo("June", 30));
        monthList.add(new MonthInfo("July", 31));
        monthList.add(new MonthInfo("August", 31));
        monthList.add(new MonthInfo("September", 30));
        monthList.add(new MonthInfo("October", 31));
        monthList.add(new MonthInfo("November", 30));
        monthList.add(new MonthInfo("December", 31));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        Integer month = scanner.nextInt();
        scanner.close();

        System.out.print(monthList.get(month-1).getName() + " has " + monthList.get(month-1).getDays() + " days.");
    }
}
