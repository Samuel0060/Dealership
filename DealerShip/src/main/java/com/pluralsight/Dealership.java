package com.pluralsight;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    ArrayList<Vehicle> Inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public static ArrayList<Vehicle> getVehiclesByPrice(ArrayList<Vehicle> inventory, double min, double max) {
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByMakeModel(ArrayList<Vehicle> inventory, String make, String model) {
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByYear(ArrayList<Vehicle> inventory, String min, int max) {
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByColor(ArrayList<Vehicle> inventory, String color) {
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByMileage(ArrayList<Vehicle> inventory, int min, int max) {
        return null;
    }

    public static ArrayList<Vehicle> getVehiclesByType(ArrayList<Vehicle> inventory, String vehicleType) {
        return null;
    }

    public static ArrayList<Vehicle> getAllVehicles(ArrayList<Vehicle> inventory) {
        return inventory;
    }

    public static ArrayList<Vehicle> addVehicle(ArrayList<Vehicle> inventory) {
//        Scanner scanner = new Scanner(System.in);
//        inventory.add(new Vehicle(scanner));
    }

    public static ArrayList<Vehicle> removeVehicle(ArrayList<Vehicle> inventory) {

    }
}
