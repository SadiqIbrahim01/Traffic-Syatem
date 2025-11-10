package data.models;

public class Vehicle {
    private static int counter = 1;
    private int id;
    private String name;
    private String model;
    private String year;
    private String color;
    private String plateNumber;
    private Owner owner;
    public Vehicle(String name, String model, String year, String color, String plateNumber, Owner owner) {
        this.id = counter++;
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
        this.plateNumber = plateNumber;
        this.owner = owner;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void getModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getPlateNumber() {
        return plateNumber;
    }
    public Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Model: " + model + " | Year: " + year + " | Color: " + color + " | Plate Number: " + plateNumber + " | Owner: " + owner;
    }
}
