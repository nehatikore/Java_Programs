import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        fruits.add(1, "Orange");
        System.out.println("List: " + fruits);

        fruits.set(2, "Grapes");
        System.out.println("After modification: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("List contains Mango? " + fruits.contains("Mango"));
        System.out.println("Size: " + fruits.size());

        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        Collections.reverse(fruits);
        System.out.println("Reversed list: " + fruits);

        fruits.clear();
        System.out.println("Cleared list: " + fruits);
    }
}
