import javax.swing.JOptionPane;

public class JOptionPaneClass {
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog("Please enter message.");

        JOptionPane.showMessageDialog(null, message);
        System.out.println("Message: " + message);
    }
}
