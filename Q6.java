package Chapter12;

class Vehicle {
    String vehicleID;
    double capacity;
    double speed;
    double routeDistance;

    public Vehicle(String vehicleID, double capacity, double speed, double routeDistance) {
        this.vehicleID = vehicleID;
        this.capacity = capacity;
        this.speed = speed;
        this.routeDistance = routeDistance;
    }

    public void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("Capacity: " + capacity + " tons");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Route Distance: " + routeDistance + " km");
    }

    public void calculateTransportTime() {
        if (speed > 0) {
            System.out.println("Transport Time: " + (routeDistance / speed) + " hours");
        } else {
            System.out.println("Invalid speed. Cannot calculate transport time.");
        }
    }
}

class Truck extends Vehicle {
    int axles;
    boolean refrigerated;

    public Truck(String vehicleID, double capacity, double speed, double routeDistance, int axles, boolean refrigerated) {
        super(vehicleID, capacity, speed, routeDistance);
        this.axles = axles;
        this.refrigerated = refrigerated;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Axles: " + axles);
        System.out.println("Refrigerated: " + (refrigerated ? "Yes" : "No"));
    }
}

class Ship extends Vehicle {
    double deckSize;
    double sailingRange;

    public Ship(String vehicleID, double capacity, double speed, double routeDistance, double deckSize, double sailingRange) {
        super(vehicleID, capacity, speed, routeDistance);
        this.deckSize = deckSize;
        this.sailingRange = sailingRange;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Deck Size: " + deckSize + " sq. meters");
        System.out.println("Sailing Range: " + sailingRange + " km");
    }
}

class Airplane extends Vehicle {
    double maxAltitude;
    String engineType;

    public Airplane(String vehicleID, double capacity, double speed, double routeDistance, double maxAltitude, String engineType) {
        super(vehicleID, capacity, speed, routeDistance);
        this.maxAltitude = maxAltitude;
        this.engineType = engineType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Maximum Altitude: " + maxAltitude + " feet");
        System.out.println("Engine Type: " + engineType);
    }
}

class Minitruck extends Truck {
    double payloadCapacity;
    double fuelEfficiency;

    public Minitruck(String vehicleID, double capacity, double speed, double routeDistance, int axles, boolean refrigerated, double payloadCapacity, double fuelEfficiency) {
        super(vehicleID, capacity, speed, routeDistance, axles, refrigerated);
        this.payloadCapacity = payloadCapacity;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Truck truck = new Truck("T123", 15, 80, 300, 4, true);
        Ship ship = new Ship("S456", 200, 40, 1000, 500, 5000);
        Airplane airplane = new Airplane("A789", 50, 900, 5000, 35000, "Jet");
        Minitruck minitruck = new Minitruck("MT321", 5, 60, 200, 2, false, 2, 15);

        System.out.println("--- Truck Details ---");
        truck.displayInfo();
        truck.calculateTransportTime();
        
        System.out.println("\n--- Ship Details ---");
        ship.displayInfo();
        ship.calculateTransportTime();
        
        System.out.println("\n--- Airplane Details ---");
        airplane.displayInfo();
        airplane.calculateTransportTime();
        
        System.out.println("\n--- Minitruck Details ---");
        minitruck.displayInfo();
        minitruck.calculateTransportTime();
    }
}
