
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Vehicle> vehicles = new LinkedList<>();

        while (true){
            System.out.println("1 - Add Car | 2 - Add Van | 3 - Display all vehicles | 4 - Find cheapest vehicle | 5 - Find most expensive vehicle | 6 - Avg. daily rate | 7 - Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                {
                    Scanner vehicleScanner = new Scanner(System.in);
                    String make;
                    String model;
                    int year;
                    double dailyRate;
                    int numDoors;
                    String fuelType;

                    System.out.println("Car make: ");
                    make = vehicleScanner.nextLine();
                    System.out.println("Model: ");
                    model = vehicleScanner.nextLine();
                    System.out.println("Fuel type: ");
                    fuelType = vehicleScanner.nextLine();
                    System.out.println("Year: ");
                    year = vehicleScanner.nextInt();
                    System.out.println("Daily rate: ");
                    dailyRate = vehicleScanner.nextDouble();
                    System.out.println("Num of doors: ");
                    numDoors = vehicleScanner.nextInt();


                    Car vehicle = new Car(make, model, year, dailyRate, numDoors, fuelType);
                    vehicles.add(vehicle);
                    break;
                }
                case 2:
                {
                    Scanner vehicleScanner = new Scanner(System.in);
                    String make;
                    String model;
                    int year;
                    double dailyRate;
                    int cargoCapacity;
                    int numSeats;

                    System.out.println("Car make: ");
                    make = vehicleScanner.nextLine();
                    System.out.println("Model: ");
                    model = vehicleScanner.nextLine();
                    System.out.println("Year: ");
                    year = vehicleScanner.nextInt();
                    System.out.println("Daily rate: ");
                    dailyRate = vehicleScanner.nextDouble();
                    System.out.println("Cargo capacity: ");
                    cargoCapacity = vehicleScanner.nextInt();
                    System.out.println("Num of seats: ");
                    numSeats = vehicleScanner.nextInt();

                    Van vehicle = new Van(make, model, year, dailyRate, cargoCapacity, numSeats);
                    vehicles.add(vehicle);
                }
                case 3:
                {
                    for(Vehicle item : vehicles)
                    {
                        item.printDetails();
                    }
                    break;
                }
                case 4:
                {
                    double biggestDailyRate = 0;
                    String itemName = "Null";
                    for (Vehicle item : vehicles) {
                        if(item != null && item.getDailyRate() >= biggestDailyRate){
                            biggestDailyRate = item.getDailyRate();
                            itemName = item.getModel();
                        }
                    }
                    System.out.println("The most expensive vehicle is: " + itemName + ", " + biggestDailyRate);
                    break;
                }
                case 5:
                {
                    double smallestDailyRate = 999999;
                    String itemName = "Null";
                    for (Vehicle item : vehicles) {
                        if(item != null && item.getDailyRate() <= smallestDailyRate){
                            smallestDailyRate = item.getDailyRate();
                            itemName = item.getModel();
                        }
                    }
                    System.out.println("The least expensive vehicle is: " + itemName + ", " + smallestDailyRate);
                    break;
                }
                case 6:
                {
                    double sum = 0;
                    int counter = 0;
                    for (Vehicle item : vehicles) {
                        counter += 1;
                        sum += item.getDailyRate();
                    }
                    sum = sum/counter;
                    System.out.println("Average daily rate is: " + sum);
                    break;
                }
                case 7:
                {
                    return;
                }

            }
        }
    }
}