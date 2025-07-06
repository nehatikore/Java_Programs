interface A {
    void m1();
}

interface B {
    void m2();
}

class C implements A, B {

    public void m1() {
        System.out.println("M1 method");
    }

    public void m2() {
        System.out.println("M2 method");
    }
}

public class Main {
    public static void main(String[] args) {
        C ob = new C();
        ob.m1();
        ob.m2();
    }
}
