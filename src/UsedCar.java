
public class UsedCar extends Car {
	
	// double mileage
	// add non arg 
	// 5 constructor args with double mileage at the end 
	
	
	protected double mileage;	
	
	public UsedCar() {}
	
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
		
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "UsedCar [make = " + make + ", model = " + model + ", year = " + year + ", price = "
				+ price + ", mileage = " + mileage + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
