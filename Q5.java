package Chapter12;

class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("The name of the car is: " + name);
    }
}

class Car extends Vehicle {
    int doors;
    String fuel;

    public Car(String name, int doors, String fuel) {
        super(name);
        this.doors = doors;
        this.fuel = fuel;
    }

    public void display() {
        super.display();
        System.out.println("Number of doors: " + doors);
        System.out.println("Fuel type: " + fuel);
    }
}

class ElectricCar extends Car {
    String batteryCap;
    String rangePerChange;

    public ElectricCar(String name, int doors, String fuel, String batteryCap, String rangePerChange) {
        super(name, doors, fuel);
        this.batteryCap = batteryCap;
        this.rangePerChange = rangePerChange;
    }

    public void display() {
        super.display();
        System.out.println("Battery capacity: " + batteryCap);
        System.out.println("Range per charge: " + rangePerChange);
    }
}

public class Q5 {
    public static void main(String[] args) {
        ElectricCar C1 = new ElectricCar("Ferrari", 2, "Electricity", "F12 battery", "15,000-20,000 per Kwh");
        C1.display();
    }
}
