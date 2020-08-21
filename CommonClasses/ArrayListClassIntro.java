import java.util.ArrayList;

public class ArrayListClassIntro {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello World");
        list.add(3.14159);

        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}