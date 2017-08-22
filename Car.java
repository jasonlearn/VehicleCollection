 /**
 * Jason Chan A00698160
 * Assignment 2
 * This is class Car which inheirts a constructor of its Parent (Super) class, Vehicle.
 * This class contains methods to compare different Car objects, verify if they are equals, 
 * and has a method to convert all details to String.
 */

final class Car extends Vehicle implements Steerable, Comparable<Car>{
    
    private int horsePower;
    public static final int MIN_HORSE_POWER = 0;
    public static final int EQUALS_WITHIN_THIS_HORSE_POWER = 10;
    
    /**
     * Constructor for Car
     * @param yearManufactured to set attribute for manufacture year of car
     * @param make to set attribute for make of the car
     * @param model to set attribute for model of the car
     * @param horsePower to set the horse power of the car
     */
    public Car(int yearManufactured, String make, String model, int horsePower) {
        super(yearManufactured, make, model); //inherits parent class (vehicle) constructor
        this.setHorsePower(horsePower); //set the horse power
    } //end constructor for car
    
    /**
     * Method to compare and see if the two cars are equal, 
     * will be equal if difference is within 10 horseower.
     * @param car to compare this car with that car.
     * @return if the two cars compared are equal.
     */
    @Override
    public boolean equals(Car car){
        if(car instanceof Car && ((Math.abs(((Car)car).getHorsePower() - this.getHorsePower())) 
                                      < EQUALS_WITHIN_THIS_HORSE_POWER)){
            return true; //if the two cars are within the met requirement - EQUALS_WITHIN_THIS_HOSE_POWER
        }
        return false; //else returns false if cars are not equals
    } //end equals method
    
    /**
     * Method to return car details as a String.
     * @return String of the car's detail
     */
    @Override
    public String toString(){
        // returns with method toString
        return "This car is a " + super.getYearManufactured() + " " + super.getMake() 
               + " " + super.getModel() + " with " + horsePower + " hp. \n";
    } //end method toString

    /**
     * Method to compare two car to see which has a bigger horsepower.
     * @param car to compare with this car.
     * @return + if (this car is bigger) if it has a higher horse power.
     */
    public int compareTo(Car car) {
        Car c = (Car)car;
        return this.getHorsePower() - c.getHorsePower();
    } //end method compareTo
    
    /**
     * Accessor to get the horse power of the car
     * @return horsePower to this car
     */
    public int getHorsePower() {
        return horsePower;
    } //end accessor method

    /**
     * Mutator method to set attribute horse power of this car.
     * @param horsePower to give a new value for this car
     */
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower; //parameter horse power is set to this car's horse power
    } //end mutator method
    
    @Override
    public void accelerate() {
        System.out.println("fire pistons, turn wheels");
    } //end interface Steerable method accelerate

    @Override
    public void steerLeft() {
        System.out.println("turn wheels left");
    } //end interface Steerable method turn left

    @Override
    public void steerRight() {
        System.out.println("turn wheels right");
    } //end interface Steerable method turn right
    
} //end class car
