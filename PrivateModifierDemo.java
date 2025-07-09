class Example {
    private int number = 10;

    private void display() {
        System.out.println("Private method");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.display(); // This is allowed inside the same class
    }
}
