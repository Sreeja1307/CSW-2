package Chapter13;

public class Car2 {
    @Override
    public String toString() {
        return "This is a car object.";
    }

    public static void main(String args[]) {
        Car2 car = new Car2();
        System.out.println(car.toString());

    }
}
