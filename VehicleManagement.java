import java.util.*;

public class VehicleManagement {
   public static void main(String[] args) {
   Scanner read = new Scanner(System.in);
   List<Vehicle> vehicleList = new ArrayList<>();
   int selection;

      do {
          System.out.print("\nMenu:");
          System.out.print("\n1. Add a vehicle");
          System.out.print("\n2. Display a list of vehicle details");
          System.out.print("\n3. Delete a vehicle");
          System.out.print("\n4. Sort vehicle list by age");
          System.out.print("\n5. Quit");
          System.out.print("\nSelect a choice: ");
          selection = read.nextInt();
          read.nextLine();

          switch (selection) {
             case 1:
                    System.out.print("\nEnter registration number: ");
                    String regNo = read.nextLine();
                    System.out.print("Enter make: ");
                    String make = read.nextLine();
                    System.out.print("Enter year of manufacture: ");
                    int yearOfManufacture = read.nextInt();
                    System.out.print("Enter value: ");
                    double value = read.nextDouble();
                    read.nextLine();

                    Vehicle newVehicle = new Vehicle(regNo, make, yearOfManufacture, value);
                    vehicleList.add(newVehicle);
                    System.out.println("Vehicle successfully added!");
             break;

             case 2:
                    if (vehicleList.isEmpty()) {
                        System.out.print("\n3There are no vehicles in the list.");
                    } else {
                        System.out.print("\nList of vehicles added:");
                        System.out.print("\n---------------------------------------------" + "\n");
                        for (Vehicle vehicle : vehicleList) {
                            System.out.printf("%-18s %-6s %4d %.2f\n", vehicle.getRegNo(), vehicle.getMake(), vehicle.getYearOfManufacture(), vehicle.getValue());
                        }
                    }
             break;

             case 3:
                   System.out.println("\nSelect the vehicle to delete:\n");
                        for (int i = 0; i < vehicleList.size(); i++) {
                        System.out.println((i + 1) + ". " + vehicleList.get(i));
                        }
                  System.out.print("\nEnter the number of the vehicle to delete: ");
                  int remove = read.nextInt();

                  if (remove >= 1 && remove <= vehicleList.size()) {
                     vehicleList.remove(remove - 1);
                     System.out.print("\nVehicle removed successfully!");
                 } 
                 else {
                     System.out.print("Invalid selection!");
                 }
             break;
                  
             case 4:
                    System.out.print("\n1. Sort by age (ascending)");
                    System.out.print("\n2. Sort by age (descending)");
                    System.out.print("\nPlease select any of the options provided: ");
                    int options = read.nextInt();

                    if (options == 1) {
                       Collections.sort(vehicleList, Comparator.comparingInt(Vehicle::getYearOfManufacture));
                       System.out.print("\nVehicles' age sorted in ascending order:\n");
                       for (Vehicle vehicle : vehicleList) {
                       System.out.println(vehicle);
                       }
                   } 
                   else if (options == 2) {
                       Collections.sort(vehicleList, Comparator.comparingInt(Vehicle::getYearOfManufacture).reversed());
                       System.out.print("\nVehicles' age sorted in descending order:\n");
                       for (Vehicle vehicle : vehicleList) {
                       System.out.println(vehicle);
                       }
                  }
                   else {
                      System.out.print("Returning to main menu.");
                  }
                  break;


             case 5:
                    System.out.print("Exiting program....");
             break;

            default:
                    System.out.print("\nInvalid choice. Please try again.");
            }
        } while (selection != 5);

        read.close();
    }
}
