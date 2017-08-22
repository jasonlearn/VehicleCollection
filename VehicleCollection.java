import java.util.ArrayList;
import java.util.Collections;

/**
 * Jason Chan A00698160
 * Assignment 2
 * This class holds collections of vehicles, there are three types of vehicles in this assignment:
 * Car, Boat, and Airplane.
 * This class creates objects and adds them to the ArrayList to their class type.
 * It displays the list of each class type once, theres is then a method to sort the collection and 
 * displays the sorted collection,  each class type has their own way of comparing one from another.
 * The display methods automatically calls the toString method of each class and displays them on the screen.
 */
public class VehicleCollection {
	
	private ArrayList<Car> cars;
	private ArrayList<Boat> boats;
	private ArrayList<Airplane> airplanes;
	
	/**
	 * Constructor for VehicleCollection.
	 * Creates multiple arraylists and adds vehicle to the collection.
	 * displays all objects of the array unsorted.
	 * sorts collections.
	 * displays all objects of the array sorted according to each class type's requirement.
	 */
	public VehicleCollection(){
	cars = new ArrayList<Car>(); //creates a new arraylist for cars and adds the following
	cars.add(new Car(2000, "Lamborghini", "Diablo", 700));
	cars.add(new Car(1997, "Dodge", "Ram", 175));
	cars.add(new Car(1940, "Buggati", "Veyron", 135));
	cars.add(new Car(2014, "Honda", "Civic", 143));
	cars.add(new Car(2011, "Honda", "Civic", 143));
	cars.add(new Car(1999, "Toyota", "Corrola", 140));
	
	System.out.println("Collection of Cars:"); //title of car collection being display
	System.out.println(cars); //displays all cars unsorted
	System.out.println(); //line break
	
	//sorts all cars according to biggest horse power
	Collections.sort(cars); //sorting cars
	
	System.out.println("Collection of Cars: (Sorted by horsepower)"); //title of sorted car collection
	System.out.println(cars); //displays all cars sorted
	System.out.println(); //line break
	
	boats = new ArrayList<Boat>(); //creates a new arraylist for boats and adds the following boats
	boats.add(new Boat(1980, "Bayliner", "Extreme", true));
	boats.add(new Boat(2014, "Bayliner", "Extreme II", true));
	boats.add(new Boat(2000, "American Skier", "Skier Surpreme", false));
	boats.add(new Boat(2010, "Boesch", "Journey", false));
	
	System.out.println("Collection of Boats"); //title to display unsorted boats
	System.out.println(boats); //displays all boats unsorted
	System.out.println(); //line break
	
	//sorts all cars according to biggest horse power
	Collections.sort(boats); //sort all boats
	
	System.out.println("Collection of Boats: (Sorted by year manufactured)"); //title for displaying all sorted boats
	System.out.println(boats); //displays all boats sorted
	System.out.println(); //line break
	
	airplanes = new ArrayList<Airplane>(); //creates an arraylist for airplane and adds the following
	airplanes.add(new Airplane(1998, "ABC Motors", "Comac", 10000));
	airplanes.add(new Airplane(1940, "Boeing", "84", 45000));
	airplanes.add(new Airplane(2012, "Boeing", "737", 80000));
	airplanes.add(new Airplane(2014, "Abrams", "Motorhead", 70000));
	
	System.out.println("Collection of Airplanes:"); //title for displaying all airplanes
	System.out.println(airplanes); //displays all airplanes unsorted
	System.out.println(); //line break
	
	//sorts all cars according to maximum flight elevation in feet
	Collections.sort(airplanes); //sorts all airplanes
	
	System.out.println("Collection of Airplanes: (Sorted by flight elevation)"); //title for displaying all sorted airplanes
	System.out.println(airplanes); //displays all airplanes sorted
	System.out.println(); //line break
	} //end constructor for VehicleCollection
	
}// end class vehicle collection
