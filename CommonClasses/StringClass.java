public class StringClass {
    public static void main(String[] args) {
        String message1 = "Hello World";       
        String message2 = new String("Hello Philippines");

        System.out.println(message1);
        System.out.println(message2);

        System.out.println(message1.charAt(6));
        System.out.println(message1.substring(6));
        System.out.println(message1.concat(message2));
        System.out.println(message1.contains("Hello"));
        System.out.println(message1.contentEquals(message2));
        System.out.println(message1.toCharArray());
        System.out.println(message1.toUpperCase());
        System.out.println(message1.toLowerCase());
    }
}