package com.pluralsight;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;


    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }


    //methods
    public ArrayList<Vehicle> getVehiclesByPrice(ArrayList<Vehicle> inventory, double min, double max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(ArrayList<Vehicle> inventory, String make, String model) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(ArrayList<Vehicle> inventory, String min, int max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(ArrayList<Vehicle> inventory, String color) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(ArrayList<Vehicle> inventory, int min, int max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(ArrayList<Vehicle> inventory, String vehicleType) {
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles(ArrayList<Vehicle> inventory) {
        return inventory;
    }

    public ArrayList<Vehicle> addVehicle(ArrayList<Vehicle> inventory) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("VIN#:");
            int vin = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Year:");
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Make:");
            String make = scanner.nextLine();

            System.out.println("Model:");
            String model = scanner.nextLine();

            System.out.println("Vehicle Type (e.g., sedan, SUV, truck):");
            String vehicleType = scanner.nextLine();

            System.out.println("Color:");
            String color = scanner.nextLine();

            System.out.println("Odometer reading");
            int odometer = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            //create new vehicle
            Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

            //add the vehicle to array
            inventory.add(vehicle);

            System.out.println("Vehicle added successfully");

            return inventory;
    }

    public ArrayList<Vehicle> removeVehicle(ArrayList<Vehicle> inventory) {
        return null;
    }
}
