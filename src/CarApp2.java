import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println(
				"Welcome to AutoIsh! Only place where the cars are somewhat automobiles and somewhat (think of something creative).");

		// create the list of cars. Don't need input
		// create menu system my way
		// store all (Used)Car instances together in same arraylist --> no array use.

		ArrayList<Car> myCars = new ArrayList<>();
		myCars.add(new UsedCar("Ford", "Model T", 1908, 7.0, 111.11));
		myCars.add(new UsedCar("Jeep", "Gnome", 1776, 1781.76, 57483.9));
		myCars.add(new UsedCar("Audi", "4CC", 2032, 4000.0, 58763.9));
		myCars.add(new Car("Chevy", "Bevy", 2001, 2218.9));
		myCars.add(new Car("GMC", "Carol", 2019, 73565.0));
		myCars.add(new Car("Lincoln", "Gator", 1863, 1861.65));
		

		System.out.printf("%-2s %-10s %-10s %-10s %-10s %-10s\n", "  ", "Make", "Model", "Year", "Price", "Mileage");
		System.out.println("=======================================================");

		for (int i = 0; i < myCars.size(); ++i) {
			if (myCars.get(i) instanceof UsedCar) {
				UsedCar tempUsedCar = (UsedCar) myCars.get(i);

				System.out.printf("%-2d %-10s %-10s %-10d $%-10.2f %-10.1f\n", (i + 1), myCars.get(i).getMake(),
						myCars.get(i).getModel(), myCars.get(i).getYear(), myCars.get(i).getPrice(),
						tempUsedCar.getMileage());

			} else {
				System.out.printf("%-2d %-10s %-10s %-10d $%-10.2f\n", (i + 1), myCars.get(i).getMake(),
						myCars.get(i).getModel(), myCars.get(i).getYear(), myCars.get(i).getPrice());
			}
		}

		int carChoice = 0;
		boolean Valid = true;
		String finalChoice = "";
		String userChoice = "";
		do {
			
			do {
				System.out.println("Which car would you like? (Please type number from the menu)");
				try {
					carChoice = scnr.nextInt();
					scnr.nextLine();
					System.out.println(myCars.get(carChoice - 1).toString());
			
				} catch (IndexOutOfBoundsException Ex) {
					Valid = false;
					System.out.println("That's too auto for us.. Please pick another number");
					continue;
				}
			} while (!Valid);
			
			System.out.println("Would you like to buy this car? (yes/no)");
			userChoice = scnr.nextLine();
			if (userChoice.equals("yes") || userChoice.equals("Yes")) {
				System.out.println("\nExcellent! Our finacne department will be in touch shortly.");
				myCars.remove(carChoice - 1);
				scnr.nextLine();
			} 
			
			System.out.printf("%-2s %-10s %-10s %-10s %-10s %-10s\n", "  ", "Make", "Model", "Year", "Price", "Mileage");
			System.out.println("=======================================================");

			for (int i = 0; i < myCars.size(); ++i) {
				if (myCars.get(i) instanceof UsedCar) {
					UsedCar tempUsedCar = (UsedCar) myCars.get(i);

					System.out.printf("%-2d %-10s %-10s %-10d $%-10.2f %-10.1f\n", (i + 1), myCars.get(i).getMake(),
							myCars.get(i).getModel(), myCars.get(i).getYear(), myCars.get(i).getPrice(),
							tempUsedCar.getMileage());

				} else {
					System.out.printf("%-2d %-10s %-10s %-10d $%-10.2f\n", (i + 1), myCars.get(i).getMake(),
							myCars.get(i).getModel(), myCars.get(i).getYear(), myCars.get(i).getPrice());
				}
			}
			
			System.out.println("Would you like to choose another? (y/n)");
			finalChoice = scnr.next();
			if (finalChoice.equals("y") || finalChoice.contentEquals("Y")) {
				continue;
			} else {
				break;
			}


		}while (userChoice.equals("yes") || userChoice.equals("Yes"));
		
		System.out.println("Thank you. Have a Blessed Day!");
		scnr.close();
	}
}
