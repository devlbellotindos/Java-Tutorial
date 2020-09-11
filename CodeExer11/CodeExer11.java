import java.util.ArrayList;
import javax.swing.JOptionPane;

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

public class CodeExer11 {
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

        String month = JOptionPane.showInputDialog("Please enter a month index (1-12).");
        String message;

        if (Character.isDigit(month.charAt(0)) && Character.isDigit(month.charAt(1)) && month.length() == 2) {
            message = monthList.get(Integer.parseInt(month)-1).getName() + " has " + monthList.get(Integer.parseInt(month)-1).getDays() + " days.";
        }
        else {
            message = "Please enter a valid number between 1 to 12.";
        }
        

        JOptionPane.showMessageDialog(null, message);
        System.out.println("Output: " + message);
    }
}
