// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Derived class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Another derived class extending Car
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging.");
    }
}

// Main class to demonstrate multilevel inheritance
public class MultilevelInheritanceSimple {
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar();
        
        // ElectricCar can access methods from Car and Vehicle class
        myCar.start();  // From Vehicle class
        myCar.drive();  // From Car class
        myCar.charge(); // From ElectricCar class
    }
}
