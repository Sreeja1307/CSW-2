package Chapter13;

public class Car {
    @Override
    public String toString() {
        return "This is a car object.";
    }

    public static void main(String args[]) {
        Car car = new Car();
        System.out.println(car);
    }
}
