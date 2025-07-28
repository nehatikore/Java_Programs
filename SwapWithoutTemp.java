public class Swap {
    public static void main(String[] args) {
        int a = 5, b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }
}
// Logic: Swap without temp using addition/subtraction.
