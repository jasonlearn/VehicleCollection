/**
 * Jason Chan A00698160
 * Assignment 2
 * This is an abstract class, a Parent (super) class for Car, Boat and Airplane.
 * It has a constructor  of three parameters, yearManufactured, make and model.
 * Which is inherited by the three subclasses.
 * This is an abstract class, therefore this will not create any objects of this class.
 */

public abstract class Vehicle {

    private int yearManufactured;
    private String make;
    private String model;
    
    /**
     * Constructor for vehicle which child classes will inherit
     * @param yearManufactured to set attributes for year manufactured of this vehicle
     * @param make to set attribute for make of this vehicle
     * @param model to set the attribute model for this vehicle
     */
    public Vehicle(int yearManufactured, String make, String model){
        this.setYearManufactured(yearManufactured);
        this.setMake(make);
        this.setModel(model);
    } //end constructor

    /**
     * Accessor method
     * @return getYearManufactured of vehicle
     */
    public int getYearManufactured() {
        return yearManufactured;
    } //end accessor

    /**
     * Mutator method.
     * @param setYearManufactured of vehicle
     */
    public void setYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
    } //end mutator

    /**
     * Accessor method
     * @return getMake of vehicle
     */
    public String getMake() {
        return make;
    } //end accessor

    /**
     * Mutator method.
     * @param setMake of vehicle
     */
    public void setMake(String make) {
        this.make = make;
    } //end mutator

    /**
     * Accessor method
     * @return getModel of vehicle
     */
    public String getModel() {
        return model;
    } //end accessor

    /**
     * Mutator method.
     * @param setModel of vehicle
     */
    public void setModel(String model) {
        this.model = model;
    } //end mutator
    
    /**
     * method to compare two cars
     */
    public boolean equals(Car car){
        return false;
    } //end method
    
    /**
     * method to compare two boats
     */
    public boolean equals(Boat boat){
        return false;
    } //end method
} //end class Vechicle

