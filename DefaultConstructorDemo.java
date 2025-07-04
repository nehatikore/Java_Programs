// Class with default constructor
class Student {
    String name;  // default: null
    int age;      // default: 0

    // Default constructor without assigning values
    Student() {
        // no value assigned
    }

    // Method to display values
    void display() {
        System.out.println("Name: " + name); // will print null
        System.out.println("Age: " + age);   // will print 0
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // default constructor called

        s1.display(); // shows default values
    }
}
