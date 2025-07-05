class Vehicle {
    void speed() {
        System.out.println("Speed");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Starting");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.speed();
        c.start();
    }
}
