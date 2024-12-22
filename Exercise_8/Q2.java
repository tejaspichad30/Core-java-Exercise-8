package Exercise_8;

/* 2. Vehicle Rental System:Design a Vehicle class with attributes 
 * for make, model, and rental price. Create subclasses Car and Bike 
 * that add specific attributes (e.g., number of doors for cars). 
 * Implement methods to calculate rental cost based on the number of days rented.
 */

class Vehicle {
    String make;
    String model;
    double rentalPricePerDay;

    // Constructor
    public Vehicle(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    
    // Method to display vehicle details
    
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price per Day: $" + rentalPricePerDay);
    }

    // Method to calculate rental cost
    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days;
    }
}

class Car extends Vehicle {
    int numberOfSeats;

    // Constructor
    public Car(String make, String model, double rentalPricePerDay, int numberOfSeats) {
        super(make, model, rentalPricePerDay);
        this.numberOfSeats = numberOfSeats;
    }

    // Method to display car details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}

class Bike extends Vehicle {
    // Constructor
    public Bike(String make, String model, double rentalPricePerDay) {
        super(make, model, rentalPricePerDay);
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Create vehicles
        Car car = new Car("Toyota", "Corolla", 50.0, 4);
        Bike bike = new Bike("Yamaha", "MT-07", 30.0);

        // Display vehicle details
        System.out.println("Vehicle Details:");
        car.displayDetails();
        System.out.println();
        bike.displayDetails();

        // Calculate rental costs
        int rentalDays = 3;
        System.out.println("\nRental Costs:");
        System.out.println("Car Rental Cost for " + rentalDays + " days: $" + car.calculateRentalCost(rentalDays));
        System.out.println("Bike Rental Cost for " + rentalDays + " days: $" + bike.calculateRentalCost(rentalDays));
    }
}
