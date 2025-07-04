class Student {
    private String name; // private = hidden from outside
    private int age;

    // public setter method to set data
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    // public getter method to get data
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class to test
class Main {
    public static void main(String[] args) {
        Student s = new Student();
        
        s.setName("Neha");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
