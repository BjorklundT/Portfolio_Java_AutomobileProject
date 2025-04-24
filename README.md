# 🚗 Automobile Inventory System (CSC320-1 Portfolio Milestone)

## Overview

This project is part of the **Module 6 Portfolio Milestone** for *CSC320-1: Programming I* at Colorado State University Global. The goal is to build a modular and object-oriented `Automobile` class to represent vehicles in a dealership inventory system. The class includes constructors, methods, encapsulated variables, and error-handling logic in preparation for a complete inventory program.

The work submitted here will later be integrated into the **final portfolio project**, which will feature a fully interactive Java console application that manages an inventory of vehicles using lists and file storage.

---

## 🔧 Features and Functionality

### ✅ Core Class Structure
- **Encapsulated Instance Variables** (`private`): make, model, color, year, mileage, id
- **Static Variable**: auto-incrementing `id` using a shared `nextID` counter

### ✅ Constructors
- **Default Constructor** – Initializes a vehicle with blank/default values
- **Parameterized Constructor** – Creates a vehicle using provided values

### ✅ Methods Implemented
- `addNewVehicle(...)` – Adds new data to the vehicle
- `updateVehicle(...)` – Replaces vehicle attributes with new values
- `removeVehicle(id)` – Clears vehicle data only if the ID matches
- `listVehicleInfo()` – Returns a string array of vehicle details
- `getID()` and other getters – Return individual values for external reference

Each method includes **try/catch error handling** and returns a message string to indicate success or failure.

---

## 📚 Skills and Java Concepts Explored

| Concept                      | Description                                                                 |
|-----------------------------|-----------------------------------------------------------------------------|
| **Object-Oriented Design**  | Used classes, instance variables, and methods to encapsulate vehicle logic. |
| **Constructors**            | Practiced both default and parameterized constructor creation.              |
| **Encapsulation**           | Protected internal variables with `private` and exposed them via getters.   |
| **Method Design**           | Built custom methods for adding, updating, removing, and displaying data.   |
| **Error Handling**          | Used `try-catch` blocks to gracefully handle runtime errors.                |
| **Static Variables**        | Used a shared `nextID` to uniquely identify vehicles.                       |
| **Code Reusability**        | Designed the class for future integration into a full inventory system.     |
| **User-Centered Design**    | Built around user prompts, unique IDs, and method responses for clarity.    |

---

## 📁 File Structure
