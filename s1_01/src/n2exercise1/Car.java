package n2exercise1;

public class Car {

	public static final String marca = "Toyota";

	public static String model;
	public final int potency;

	public Car() {
		this.potency = 0;
	}

	public Car(String model, int potency) {
		Car.model = model;
		this.potency = potency;
	}

	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Car.model = model;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotency() {
		return potency;
	}

	public static void slow() {
		System.out.println("The car is slow velocity.");
	}

	public void acelerar() {
		System.out.println("The car is accelerating.");
	}

	public void stop() {
		System.out.println("The car is breaking.");
	}

}
