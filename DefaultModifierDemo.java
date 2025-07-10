class Example {
    int number = 40;  // default access

    void display() {
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println("Number: " + obj.number);
        obj.display();
    }
}
