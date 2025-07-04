// Class with default constructor
class Student {
    String name;
    int age;

    // Default constructor - no parameters
    Student() {
        name = "Neha";
        age = 22;
    }

    // Method to display values
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Object is created, default constructor is called
        Student s1 = new Student();

        // Display assigned values
        s1.display();
    }
}
