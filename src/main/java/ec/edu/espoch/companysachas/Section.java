/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.companysachas;

/**
 *
 * @author HP
 */
public class Section {
    

    private int idSection;
    private String name;
    private double length;
    private double estimatedTime;
    private boolean enabled;

    public Section(int idSection, String name,
                   double length, double estimatedTime) {
        if (idSection <= 0 || name == null || name.isBlank()
                || length < 0 || estimatedTime < 0) {
            throw new IllegalArgumentException("Invalid section data");
        }
        this.idSection = idSection;
        this.name = name;
        this.length = length;
        this.estimatedTime = estimatedTime;
        this.enabled = true;
    }

    public int getIdSection() { return idSection; }
    public String getName() { return name; }
    public double getLength() { return length; }
    public double getEstimatedTime() { return estimatedTime; }
    public boolean isEnabled() { return enabled; }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setLength(double length) {
        if (length < 0) throw new IllegalArgumentException("Invalid length");
        this.length = length;
    }

    public void setEstimatedTime(double time) {
        if (time < 0) throw new IllegalArgumentException("Invalid time");
        this.estimatedTime = time;
    }

    public void disable() { enabled = false; }
}
    

