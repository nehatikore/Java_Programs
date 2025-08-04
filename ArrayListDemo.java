import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println("Name: " + name);
        }

        names.remove("Bob");  // Remove element

        System.out.println("After removal: " + names);
    }
}
