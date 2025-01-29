package Chapter12;

class Device {
    String brand;
    String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Laptop extends Device {
    String processorType;
    int ramSize;

    public Laptop(String brand, String model, String processorType, int ramSize) {
        super(brand, model);
        this.processorType = processorType;
        this.ramSize = ramSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Processor Type: " + processorType);
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}

class Smartphone extends Device {
    int cameraResolution;
    int batteryCapacity;

    public Smartphone(String brand, String model, int cameraResolution, int batteryCapacity) {
        super(brand, model);
        this.cameraResolution = cameraResolution;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Camera Resolution: " + cameraResolution + "MP");
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "XPS 15", "Intel i7", 16);
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S22", 108, 5000);

        System.out.println("--- Laptop Details ---");
        laptop.displayInfo();

        System.out.println("\n--- Smartphone Details ---");
        smartphone.displayInfo();
    }
}
