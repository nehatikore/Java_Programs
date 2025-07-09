class Example {
    protected int number = 30;

    protected void show() {
        System.out.println("Protected method");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.show();  // Calls the protected method
        System.out.println(obj.number);  // Accesses the protected variable
    }
}
