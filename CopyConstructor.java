class Student {
    String name;
    int age;
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Neha", 20);    // Original object
        Student s2 = new Student(s1);            // Copy object using copy constructor

        s1.display();  // Neha, 20
        s2.display();  // Neha, 20
    }
}
