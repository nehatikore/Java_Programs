//In multilevel inheritance, a class is derived from another derived class
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

class FourWheeler extends Car {
    void stop() {
        System.out.println("Stop");
    }
}

public class Main {
    public static void main(String[] args) {
        FourWheeler f = new FourWheeler();
        f.speed();   // From Vehicle
        f.start();   // From Car
        f.stop();    // From FourWheeler
    }
}
