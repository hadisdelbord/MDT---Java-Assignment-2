# Car Filtering and Saving Program

Student: Hadis Delbord - 7222043

## Description
This Java program allows the user to filter a list of car objects based on three different criteria and save the results to a file. The program first presents the user with three filtering options. After selecting a filter and entering the necessary inputs, the program searches the car array for matching results. If any cars meet the filtering criteria, they are saved to a file.

## Functionality
The program allows filtering cars based on the following criteria:
1. **Filter by Brand**: Displays a list of cars of a given brand.
2. **Filter by Model and Years of Use**: Displays cars of a given model that have been in use for more than a specified number of years.
3. **Filter by Year of Manufacture and Price**: Displays cars of a given year of manufacture with a price higher than a specified amount.

### Data Structure
The car information is stored as an array of `Car` objects. Each car has the following attributes:

- `id`: Car ID (integer)
- `make`: Brand of the car (string)
- `model`: Car model (string)
- `yearOfManufacture`: Year of manufacture (integer)
- `color`: Color of the car (string)
- `price`: Price of the car (double)
- `registrationNumber`: Car registration number (integer)

## How It Works
1. **Input Filtering Type**: The user is prompted to choose from three options:
    - `a`: Filter by brand.
    - `b`: Filter by model and years of use.
    - `c`: Filter by year of manufacture and price.
    - `e`: Exit

2. **Filter Conditions**: Based on the user's choice:
    - **Option a**: The user inputs a car brand, and the program searches for cars matching that brand.
    - **Option b**: The user inputs a car model and the minimum number of years in use. The program finds cars that match the model and have been used for at least that long.
    - **Option c**: The user inputs a year of manufacture and a minimum price. The program finds cars from that year with a price higher than the specified amount.

3. **Saving to File**: After filtering, if matching cars are found, the results are saved to a file called `output.txt`. If no matches are found, the program displays a message saying no cars match the criteria.

### Example File Output:
	Car{ID=3, Make='Tesla', Model='Model S', Year of Manufacture=2022, Color='Black', Price=75000.0, Registration Number=345678}
	Car{ID=7, Make='Tesla', Model='Model S', Year of Manufacture=2022, Color='Gray', Price=55000.0, Registration Number=789012}
	
## File Paths
The file path where the results are saved is set as `./output.txt`. You can change this path inside the `SaveToFile` method if necessary.

### Example Interaction:
	a) a list of cars of a given brand 
	b) a list of cars of a given model that have been in use for more than n years 
	c) a list of cars of a given year of manufacture, the price of which is higher than the specified one  
	e) Exit
	Select one filtering:
	b
	Enter the model: Model S
	Minimum Years of use: 1
	Data saved to ./output.txt

	