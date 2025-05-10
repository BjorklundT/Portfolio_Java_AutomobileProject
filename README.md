# 🚗 Automobile Inventory System

## Overview

This project is a Java-based automobile inventory system designed to manage vehicle data using an object-oriented approach. It consists of two main classes:

- **`Automobile`** – Represents individual vehicles with functionality to store and manage their attributes.
- **`AutomobileInventory`** – Acts as the main driver class, demonstrating how to create, update, remove, list, and optionally export vehicle data using the `Automobile` class.

The system is structured for modularity and future expansion, supporting basic CRUD operations and file output for saved vehicle information.

---

## 🔧 Features and Functionality

### Core Class Structure

#### `Automobile` Class
- **Encapsulated Instance Variables** (`private`): `make`, `model`, `color`, `year`, `mileage`, `id`
- **Static Variable**: Auto-incrementing `id` using a shared `nextID` counter

#### `AutomobileInventory` Class
- Demonstrates real-world usage of the `Automobile` class
- Manages one or more `Automobile` objects
- Includes console output and optional file writing (`C:\Temp\Autos.txt`)

---

### Methods Implemented

#### In `Automobile`:
- `addNewVehicle(...)` – Adds new data to the vehicle
- `updateVehicle(...)` – Replaces vehicle attributes with new values
- `removeVehicle(id)` – Clears vehicle data only if the ID matches
- `listVehicleInfo()` – Returns a string array of vehicle details
- Getters (`getMake()`, `getModel()`, etc.) – Return individual values for external reference

Each method includes **try/catch error handling** and returns a message string to indicate success or failure.

#### In `AutomobileInventory`:
- Calls the parameterized constructor to initialize a vehicle
- Lists vehicle data and loops through the return array
- Removes and updates a vehicle using methods from the `Automobile` class
- Captures user input using `Scanner` to determine whether to write data to a file
- Uses `FileWriter` with exception handling to save vehicle details to `C:\Temp\Autos.txt`

---

## 📚 Skills and Java Concepts Explored

| Concept                      | Description                                                                 |
|-----------------------------|-----------------------------------------------------------------------------|
| **Object-Oriented Design**  | Designed both individual vehicle logic and system interaction.              |
| **Constructors**            | Used both default and parameterized constructors.                           |
| **Encapsulation**           | Protected internal variables with `private` and exposed them via getters.   |
| **Method Design**           | Built reusable methods for vehicle manipulation.                            |
| **Error Handling**          | Used `try-catch` in every method and for file I/O.                          |
| **Static Variables**        | Tracked vehicle IDs globally with an incrementing static counter.           |
| **Console Interaction**     | Used `Scanner` to simulate user decisions (Y/N).                            |
| **File I/O in Java**        | Used `FileWriter` to export vehicle data to a text file.                    |
| **Code Reusability**        | Structured code for use in larger, real-world inventory systems.            |

---

## 🧱 File Structure
vehicleinventory/
│
├── src/
│ └── vehicleinventory/
│ ├── Automobile.java # Core class with constructors, getters, and vehicle methods
│ └── AutomobileInventory.java # Final program demonstrating vehicle interaction and file writing
│
├── README.md # Project documentation

## 🔮 Final Project Capabilities

The final version of this project supports:

- Full CRUD-like logic:
  - Create and add a vehicle
  - List vehicle details
  - Update vehicle data
  - Remove a vehicle (by ID)
- Prompt to write vehicle data to a file
- Console output using formatted loops
- User decision input with `Scanner`

**Example Output File Path**:  
`C:\Temp\Autos.txt`

---

## 🧠 Lessons Learned

This project provided hands-on experience with:

- Object-oriented Java fundamentals
- Transitioning logic from Python to Java
- Designing a class for real-world use cases
- Exception handling for both user logic and I/O
- Console-based and file-based outputs

It also confirmed Java as a language that aligns with logical structure and clarity, helping develop confidence and capability in backend program design.

---

## 👨‍💻 Author

**Timothy G. Bjorklund**  
Project: Automobile Inventory System  
Language: Java  
