package vehicleinventory;

public class Automobile {

    // Instance variables declared private to protect internal state (Encapsulation)
    private int id; // Unique vehicle ID
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Static variable to auto-increment vehicle IDs across all Automobile objects
    private static int nextID = 1;

    // Default Constructor
    // Initializes fields with empty or zero values when no data is passed
    public Automobile() {
        this.id = nextID++; // Assign a unique ID
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    // Parameterized Constructor
    // Initializes object fields with provided data at creation
    public Automobile(String make, String model, String color, int year, int mileage) {
        this.id = nextID++; // Assign a unique ID
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    // GETTERS – Used to access private data from outside the class
    public int getID() {
        return this.id;
    }
    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public String getColor() {
        return this.color;
    }
    public int getYear() {
        return this.year;
    }
    public int getMileage() {
        return this.mileage;
    }

    // Method: Add new vehicle data
    // Updates the object with new values; returns success or error message
    public String addNewVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle successfully added.";
        } catch (Exception add) {
            return "Error adding vehicle: " + add.getMessage();
        }
    }

    // Method: Update all fields of an existing vehicle
    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated successfully.";
        } catch (Exception update) {
            return "Error updating vehicle: " + update.getMessage();
        }
    }

    // Method: Clear vehicle data if ID matches
    public String removeVehicle(int inputID) {
        try {
            if (this.id == inputID) {
                this.make = "";
                this.model = "";
                this.color = "";
                this.year = 0;
                this.mileage = 0;
                return "Vehicle with ID " + this.id + " was cleared.";
            } else {
                return "Vehicle ID mismatch.";
            }
        } catch (Exception remove) {
            return "Error removing vehicle: " + remove.getMessage();
        }
    }

    // Method: Return vehicle data as an array of strings
    public String[] listVehicleInfo() {
        try {
            String[] info = {
                "Vehicle ID: " + this.id,
                "Make: " + this.make,
                "Model: " + this.model,
                "Color: " + this.color,
                "Year: " + this.year,
                "Mileage: " + this.mileage
            };
            return info;
        } catch (Exception listData) {
            return new String[] {"Error listing vehicle info: " + listData.getMessage()};
        }
    }
}