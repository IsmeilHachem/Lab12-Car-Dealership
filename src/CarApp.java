import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Motors admin console!");

		int userInput = 0;

		ArrayList<Car> cars = new ArrayList<>();

		boolean Valid = true;

		do {
			System.out.println("How many cars are you entering?");
			try {
				userInput = scnr.nextInt();
				scnr.nextLine();
			} catch (InputMismatchException Ex) {
				Valid = false;
				System.out.println("Wrong input there bud");
				scnr.nextLine();
				continue;
			}
		} while (!Valid);

		String[] make = new String[userInput];
		String[] model = new String[userInput];
		int[] year = new int[userInput];
		double[] price = new double[userInput];
		for (int i = 0; i < userInput; i++) {
			Car m1 = new Car();
			
			System.out.println("Enter Car Make: ");
			make[i] = scnr.next();
			scnr.nextLine();
			m1.setMake(make[i]);
			
			System.out.println("Enter Car Model: ");
			model[i] = scnr.next();
			scnr.nextLine();
			m1.setModel(model[i]);
			
			System.out.println("Enter Car Year: ");
			year[i] = scnr.nextInt();
			scnr.nextLine();
			m1.setYear(year[i]);
			
			System.out.println("Enter Car Price: ");
			
			price[i] = scnr.nextDouble();
			scnr.nextLine();
			m1.setPrice(price[i]);
			
			cars.add(m1);
			
		}
		System.out.println("...");
		System.out.println("Current inventory:");

		for(Car m2 : cars) { 
			System.out.format("%-10s %-10s %7d \t $%6.2f", m2.getMake() , m2.getModel() , m2.getYear() , m2.getPrice());
			System.out.print("\n");
//			m2.getMake();
//			m2.getModel();
//			m2.getPrice();
//			m2.getYear();
			
		}
		
		scnr.close();
		
	
//		String[] Model = new String[userInput];
//		for (int i1 = 0; i1 < userInput; i1++) {
//			System.out.println("Enter Car Model: ");
//			Model[i1] = scnr.next();
//			scnr.nextLine();
//		}
//		int[] Year = new int[userInput];
//		for (int i1 = 0; i1 < userInput; i1++) {
//			System.out.println("Enter Car Year: ");
//			Year[i1] = scnr.nextInt();
//			scnr.nextLine();
//		}
//		double[] Price = new double[userInput];
//		for (double i1 = 0; i1 < userInput; i1++) {
//			System.out.println("Enter Car Price: ");
//			Price[(int) i1] = scnr.nextDouble();
//			scnr.nextLine();
//		}
		

//		int userInput = 0;
//		for (int i = 0; i < userInput; i++) {
//			System.out.println("Welcome to the Grand Circus Motors admin console!");
//			scnr.nextLine();
//			System.out.println("How many cars are you entering?");
//			userInput = scnr.nextInt();

	}
	

}
