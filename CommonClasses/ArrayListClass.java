import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello Cebu");
        list.add("Hello World");
        list.add("Hello Philippines");
 
        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.forEach((msg) -> System.out.println(msg));

        System.out.println(list.indexOf("Hello World"));
        
        list.remove(0);

        list.forEach((msg) -> System.out.println(msg));

        list.clear();

        System.out.println(list.isEmpty());
    }
}