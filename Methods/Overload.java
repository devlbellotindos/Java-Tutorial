public class Overload {

    public static void display(char letter) {
        System.out.println("Letter: " + letter);
    }

    public static void display(int number) {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        display(3);
        display('B');
    }
}