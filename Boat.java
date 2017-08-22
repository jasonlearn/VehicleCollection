/**
 * Jason Chan A00698160
 * Assignment 2
 * This is class Boat which inheirts a constructor of its Parent (Super) class, Vehicle.
 * This class contains methods to compare different Boat objects, verify if they are equals, 
 * and has a method to convert all details to String.
 */

public class Boat extends Vehicle implements Steerable, Comparable<Boat>{
	
	private boolean isMotorized;
	
	/**
	 * Constructor for boat.
	 * @param yearManufactured to set attribute for manufacture year of boat
	 * @param make to set attribute for make of the boat
	 * @param model to set attribute for model of the boat
	 * @param isMotorized set true if this boat has a motor
	 */
	public Boat(int yearManufactured, String make, String model, boolean isMotorized) {
		super(yearManufactured, make, model);
		this.setIsMotorized(isMotorized); //sets whether this boat has a motor
	} //end constructor for boat
	
	/**
	 * Method to compare if the boat taken as parameter is equal to this boat,
	 * will be equal if both boats has a motor.
	 * @param boat to compare with this boat to see if its a equal
	 * @return whether the two boats are equals
	 */
	@Override
	public boolean equals(Boat boat){
		if(boat instanceof Boat && ((Boat)boat).getIsMotorized() == this.getIsMotorized()){
			return true; //true, if the two boats has a motor
		}
		else{
			return false; //false, when either boat don't have a motor
		}
	} //end equals method
	
	/**
	 * Method toString to return details of this boat as a String.
	 * @return String details of this boat
	 */
	@Override
	public String toString(){

		String motor = ""; //variable to imply whether this boat has a motor
		if(isMotorized){
			motor = " with (motor)."; //will display this if the boat has a motor
		}
		else{
			motor = " without (motor)"; //will display this if the boat does not have a motor
		}
		return "This boat is a " + super.getYearManufactured() + " " + 
					super.getMake() + " " + super.getModel() + motor+"\n";
	} //end method toString
	
	/**
	 * Method to compare two boats to see which is newer.
	 * @param boat to compare with this boat.
	 * @return + if (this boat is bigger) if it is a newer boat.
	 */
	public int compareTo(Boat boat) {
		Boat b = (Boat)boat;
		return this.getYearManufactured() - b.getYearManufactured();
	} //end method compareTo

	/**
	 * Accessor method.
	 * @return isMotorized a boolean value whether this boat is motorized.
	 */
	public boolean getIsMotorized() {
		return isMotorized;
	} //end accessor method

	/**
	 * Mutator method to alter the value of isMotorized
	 * @param isMotorized 
	 */
	public void setIsMotorized(boolean isMotorized) {
		this.isMotorized = isMotorized;
	} //end mutator method
	
	@Override
	public void accelerate() {
		System.out.println("jet water");
	} //end interface Steerable method accelerate

	@Override
	public void steerLeft() {
		System.out.println("turn tiller left");
	} //end interface Steerable method turn left

	@Override
	public void steerRight() {
		System.out.println("turn tiller right");
	} //end interface Steerable method turn right
	
} //end class boat
