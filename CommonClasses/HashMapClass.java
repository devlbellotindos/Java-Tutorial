import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, String> heroes = new HashMap<>();

        heroes.put("Batman", "Bruce Wyane");
        heroes.put("Spiderman", "Peter Parker");
        heroes.put("Ironman", "Tony Stark");
        heroes.put("Hulk", "Bruce Banner");

        System.out.println(heroes.get("Spiderman") + " is Spiderman.");

        System.out.println();

        for (String key: heroes.keySet()) {
            System.out.println("Key: " + key + " -> Value: " + heroes.get(key));
        }
    }
}
