package Chapter13;
class Car3 {
	private String brand;
	private String model;
	private String registrationNumber;
	Car3(String brand, String model, String registrationNumber) {
		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
	}
	public boolean equals(Object o) {
		if (o instanceof Car3) {
			Car3 car = (Car3) o;
			if (car.getBrand() == this.brand && car.getModel() == this.getModel() && car.getRegistrationNumber() == this.getRegistrationNumber()) {
				return true;
			} 
			else {
				return false;
			}
		} 
		else {
			return false;
		}
	}
	public String getBrand(){return brand;	}
	public String getModel(){return model;	}
	public String getRegistrationNumber(){return registrationNumber;	}
}

public class EqualsMethodTest {
	public static void main(String[] args) {
		Car3 myCar = new Car3("Mercedez Benz","A Class", "OD13 0007");
		Car3 carInGarage = new Car3("Mercedez Benz","A Class", "OD13 0007");
		if (myCar.equals(carInGarage)) {
			System.out.println("Yay!!! This is my Car!");
		}
		else  {
			System.out.println("That's Not My Car !!");
		}
	}
}