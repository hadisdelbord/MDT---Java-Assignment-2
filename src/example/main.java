package example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

class Car {

	private int id;
	private String make;
	private String model;
	private int yearOfManufacture;
	private String color;
	private double price;
	private int registerationNumber;

	public Car(int id, String make, String model, int yearOfManufacture, String color, double price,
			int registerationNumber) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.yearOfManufacture = yearOfManufacture;
		this.color = color;
		this.price = price;
		this.registerationNumber = registerationNumber;
	}

	public int getId() {
		return id;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public int getRegisterationNnumber() {
		return registerationNumber;
	}

	public String toString() {
		return "Car{" + "ID=" + id + ", Make='" + make + '\'' + ", Model='" + model + '\'' + ", Year of Manufacture="
				+ yearOfManufacture + ", Color='" + color + '\'' + ", Price=" + price + ", Registration Number="
				+ registerationNumber + '}';
	}

}

public class main {

	static void SaveToFile(String str) {
		String FilePath = "./output.txt";

		try {
			FileWriter fileWriter = new FileWriter(FilePath);

			BufferedWriter bw = new BufferedWriter(fileWriter);

			bw.write(str);

			bw.close();

			System.out.println("Data saved to " + FilePath);
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Car[] cars = new Car[] { new Car(1, "Honda", "Civic", 2020, "Blue", 20000.0, 123456),
				new Car(2, "Toyota", "Camry", 2019, "Red", 25000.0, 234567),
				new Car(3, "Tesla", "Model S", 2022, "Black", 75000.0, 345678),
				new Car(4, "Honda", "Accord", 2021, "White", 30000.0, 456789),
				new Car(5, "Toyota", "Corolla", 2018, "Silver", 18000.0, 567890),
				new Car(6, "Honda", "CR-V", 2020, "Green", 32000.0, 678901),
				new Car(7, "Tesla", "Model S", 2022, "Gray", 55000.0, 789012),
				new Car(8, "Ford", "Mustang", 2021, "Yellow", 45000.0, 890123),
				new Car(9, "Ford", "F-150", 2019, "Black", 40000.0, 901234),
				new Car(10, "Honda", "Pilot", 2020, "Blue", 35000.0, 102345),
				new Car(11, "Toyota", "Prius", 2017, "White", 17000.0, 213456),
				new Car(12, "Honda", "Odyssey", 2019, "Gray", 32000.0, 324567),
				new Car(13, "Tesla", "Cybertruck", 2023, "Silver", 80000.0, 435678),
				new Car(14, "Ford", "Explorer", 2020, "Red", 38000.0, 546789),
				new Car(15, "Ford", "Ranger", 2021, "Green", 41000.0, 657890),
				new Car(16, "Toyota", "Avalon", 2022, "White", 40000.0, 768901),
				new Car(17, "Honda", "Insight", 2018, "Blue", 21000.0, 879012),
				new Car(18, "Honda", "Accord", 2020, "Black", 42000.0, 980123),
				new Car(19, "Tesla", "Roadster", 2023, "Red", 100000.0, 109234),
				new Car(20, "Ford", "Bronco", 2021, "Orange", 47000.0, 120345) };

		Set<String> validInputs = Set.of("a", "b", "c", "e");
		Scanner scanner = new Scanner(System.in);

		System.out.println("" + "a) a list of cars of a given brand \n"
				+ "b) a list of cars of a given model that have been in use for more than n years \n"
				+ "c) a list of cars of a given year of manufacture, the price of which is higher than the specified one \n"
				+ "e) Exit\n" + "Select one filtering:");

		String FilterType = scanner.nextLine();
		String ListOutput = "";


		do {


			if (FilterType.equalsIgnoreCase("a")) {

				System.out.print("name of brand: ");
				String inputText = scanner.nextLine();
				for (Car c : cars) {
					if (c.getMake().equals(inputText)) { // compare of strings
						ListOutput += c.toString() + '\n';
					}
				}
				break;

			} else if (FilterType.equalsIgnoreCase("b")) {

				System.out.print("Enter the model: ");
				String ModelInput = scanner.nextLine();
				System.out.print("Minimum Years of use: ");
				String MinUseYears = scanner.nextLine();

				for (Car c : cars) {
					if (c.getModel().equals(ModelInput)
							&& (2025 - c.getYearOfManufacture()) >= Integer.valueOf(MinUseYears)) {
						ListOutput = ListOutput + c.toString() + '\n';
					}
				}
				break;

			} else if (FilterType.equalsIgnoreCase("c")) {

				System.out.print("Enter the year of manufacture: ");
				String YearOfManufactureInpute = scanner.nextLine();
				System.out.print("Minimum price: ");
				String MinPrice = scanner.nextLine();

				for (Car c : cars) {
					if (c.getYearOfManufacture() == Integer.valueOf(YearOfManufactureInpute)
							&& c.getPrice() > Integer.valueOf(MinPrice)) {
						ListOutput = ListOutput + c.toString() + '\n';
					}
				}
				break;

			} else if (FilterType.equalsIgnoreCase("e")) {

				System.out.println("GoodBye!");
				System.exit(0);
			} else {
				System.out.println("[ERROR] Please choose right filtering!");
			}

			System.out.println("" + "a) a list of cars of a given brand \n"
					+ "b) a list of cars of a given model that have been in use for more than n years \n"
					+ "c) a list of cars of a given year of manufacture, the price of which is higher than the specified one \n"
					+ "e) Exit \n" + "Select one filtering ? ");

			FilterType = scanner.nextLine();

			

		} while (true);
		if (!ListOutput.equals("")) {
			SaveToFile(ListOutput);
		} else {
			System.out.println("There is not any Cars with the properties");
		}

		
//		scanner.close();
	}

}
