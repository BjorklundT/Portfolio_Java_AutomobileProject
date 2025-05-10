package vehicleinventory;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter; //  Allows the program to save the current vehicle inventory to a permanent location.
import java.io.IOException; // Used to handle potential errors that could occur when writing to the file.

public class AutomobileInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList to store multiple vehicles
        ArrayList<Automobile> inventory = new ArrayList<>();

        try {
            // Add a vehicle using parameterized constructor
            Automobile car1 = new Automobile("Toyota", "Corolla", "Blue", 2020, 35000);
            inventory.add(car1);
            System.out.println("Vehicle added using constructor.");

            // List vehicle info to confirm it was added properly
            for (String data : car1.listVehicleInfo()) {
                System.out.println(data);
            }

            // Remove vehicle
            String removeMessage = car1.removeVehicle(car1.getID());
            System.out.println(removeMessage);

            // Add a new vehicle using method
            String addMessage = car1.addNewVehicle("Ford", "Escape", "Gray", 2019, 42000);
            System.out.println(addMessage);

            // List new vehicle info
            for (String data : car1.listVehicleInfo()) {
                System.out.println(data);
            }

            // Update vehicle
            String updateMessage = car1.updateVehicle("Ford", "Escape", "Red", 2019, 40000);
            System.out.println(updateMessage);

            // List updated info to be sure everything was updated properly
            for (String data : car1.listVehicleInfo()) {
                System.out.println(data);
            }

            // Ask user if they want to print to file
            System.out.print("Would you like to save this vehicle info to file? (Y/N): ");
            String choice = scanner.nextLine().trim().toUpperCase(); // Allows for Yes or just Y with spaces

            if (choice.equals("Y")) {
                try {
                    FileWriter writer = new FileWriter("C:/Temp/Autos.txt");
                    for (String line : car1.listVehicleInfo()) {
                        writer.write(line + "\n");
                    }
                    writer.close();
                    System.out.println("Vehicle information written to C:/Temp/Autos.txt");
                } catch (IOException fileError) {
                    System.out.println("Error writing to file: " + fileError.getMessage());
                }
            } else {
                System.out.println("No file was saved.");
            }

        } catch (Exception ex) {
            System.out.println("An error occurred: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}

