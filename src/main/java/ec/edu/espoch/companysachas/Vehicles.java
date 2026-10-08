/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.companysachas;

/**
 *
 * @author HP
 */
public class Vehicles {
    

    private String licensePlate;
    private String description;
    private boolean available;

    public Vehicles(String licensePlate, String description) {
        if (licensePlate == null || licensePlate.isBlank()
                || description == null || description.isBlank()) {
            throw new IllegalArgumentException("Invalid vehicle data");
        }
        this.licensePlate = licensePlate;
        this.description = description;
        this.available = true;
    }

    public String getLicensePlate() { return licensePlate; }
    public String getDescription() { return description; }
    public boolean isAvailable() { return available; }

    public void setLicensePlate(String plate) {
        if (plate == null || plate.isBlank()) {
            throw new IllegalArgumentException("Invalid plate");
        }
        this.licensePlate = plate;
    }

    public void setDescription(String description) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Invalid description");
        }
        this.description = description;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
    

