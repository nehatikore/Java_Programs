class Student {

    // private variables - cannot be accessed directly outside this class
    private String name;
    private int age;

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get the name
    public String getName() {
        return name;  // returning the name
    }

    // Setter method to set the age
    public void setAge(int age) {
        if(age > 0) {   // basic validation
            this.age = age;
        }
    }

    // Getter method to get the age
    public int getAge() {
        return age;  // returning the age
    }
}

// Main class to test it
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting values using setter methods
        s1.setName("Neha");
        s1.setAge(22);

        // Getting and storing values using getter methods
        String studentName = s1.getName();
        int studentAge = s1.getAge();

        // Printing the returned values
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
    }
}
