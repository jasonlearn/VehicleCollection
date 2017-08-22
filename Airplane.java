/**
 * Jason Chan A00698160
 * Assignment 2
 * This is class Airplane which inheirts a constructor of its Parent (Super) class, Vehicle.
 * This class contains methods to compare different Airplane objects, verify if they are equals, 
 * and has a method to convert all details to String.
 */
public class Airplane extends Vehicle implements Steerable, Comparable<Airplane>{
	
	private int maximumHeightFeet;
	public static final int MIN_HEIGHT_FEET = 0;
	public static final int EQUALS_WITHIN_THIS_HEIGHT_FEET = 1000;
	
	/**
	 * Constructor for Airplane
	 * @param yearManufactured to set attribute for manufactured year of airplane
	 * @param make to set attribute for make of the airplane
	 * @param model to set attribute for model of the airplane
	 * @param maximumHeightFeet to set attribute of max height of flight in feet for airplane
	 */
	public Airplane(int yearManufactured, String make, String model, int maximumHeightFeet) {
		super(yearManufactured, make, model); //inherits parent class (vehicle) constructor
		this.setMaximumHeightFeet(maximumHeightFeet); //set the maximum flight height in feet of this airplane
	} //end constructor of airplane

	/**
	 * Method to compare airplanes
	 * @param airplane to identify if airplane equals
	 * @return true of false if the two airplanes are equal
	 */
	public boolean equals(Airplane airplane){
		if(airplane instanceof Airplane || Math.abs((((Airplane)airplane).getMaximumHeightFeet()) - 
										   this.getMaximumHeightFeet()) < EQUALS_WITHIN_THIS_HEIGHT_FEET){
			return true; //true, when the two compared airplanes are within the requirement height difference
		}
		else{
			return false; //false, when the requirements are not met
		}
	} //end method equals
	
	/**
	 * To return information of the airplane to String
	 * @return String details of this airplane
	 */
	@Override
	public String toString(){
		return "This airplane is a " + super.getYearManufactured() + " " + super.getMake() + " " 
				+ super.getModel() + " that can reach " + maximumHeightFeet + " feet. \n";
	} //end method toString
	
	/**
	 * Method to compare two airplanes to see which has a higher flight height in feet.
	 * @param airplane to compare to this airplane.
	 * @return + if (this airplane is higher) if it has a higher max height in feet
	 */
	@Override
	public int compareTo(Airplane airplane) {
		Airplane a = (Airplane)airplane;
		return this.getMaximumHeightFeet() - a.getMaximumHeightFeet();
	} //end method compareTo

	/**
	 * @return maximum flight height in feet
	 */
	public int getMaximumHeightFeet() {
		return maximumHeightFeet;
	} //end accessor

	/**
	 * @param maximumHeightFeet sets attribute to airplane
	 */
	public void setMaximumHeightFeet(int maximumHeightFeet) {
		this.maximumHeightFeet = maximumHeightFeet;
	} // end mutator	

	@Override
	public void accelerate() {
		System.out.println("fire engines on wings");
	} //end interface Steerable method accelerate

	@Override
	public void steerLeft() {
		System.out.println("lift wing flaps to turn left");
	} //end interface Steerable method turn left

	@Override
	public void steerRight() {
		System.out.println("lift wing flaps to turn right");
	} //end interface Steerable method turn right
	
} //end class of airplane