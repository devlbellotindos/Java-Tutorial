public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder message = new StringBuilder("Hello World");
        System.out.println(message);

        message.append(", Hello Philippines");
        System.out.println(message);

        message.replace(13, 18, "Hi");
        message.replace(0, 5, "Hi");
        System.out.println(message);

        message.delete(9, 12);
        System.out.println(message);

        message.insert(3, "Cebu, ");
        System.out.println(message);

        message.reverse();
        System.out.println(message);

    }
}