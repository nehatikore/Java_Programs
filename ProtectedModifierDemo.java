class Example {
    protected int number = 30;

    protected void display() {
        System.out.println("Protected method");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println("Number: " + obj.number);
        obj.display();
    }
}
