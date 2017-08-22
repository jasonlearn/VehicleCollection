import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestVechicleAssignment2.
 *
 * @author  Jason Chan A00698160
 * @version Assignment 2
 * This class is to test all methods of the three subclasses of vehicle:
 * Car, Boat and Airplane
 * Each methods are tested twice for double verification
 */
public class TestVechicleAssignment2
{
    private Car testCar;
    private Boat testBoat;
    private Airplane testAirplane;
    /**
     * Sets up the test fixture for class  Car.
     * Called before every test case method.
     */
    @Before
    public void setUpTestCar1(){
        testCar = new Car(1997, "Dodge", "Ram", 175);
    } //end setup
    
    /**
     * to test accessor method getYearManufactured in class Car
     */
    @Test
    public void testCarGetYearManufactured1(){
        assertEquals(testCar.getYearManufactured(), 1997);
    } //end accessor method test
    
    /**
     * to test accessor method getMake in class Car
     */
    @Test
    public void testCarGetMake1(){
        assertEquals(testCar.getMake(), "Dodge");
    } //end accessor method test
    
    /**
     * to test accessor method getModel in class Car
     */
    @Test
    public void testCarGetModel1(){
        assertEquals(testCar.getModel(), "Ram");
    } //end accessor method test
    
    /**
     * to test accessor method getHorsePower in class Car
     */
    @Test
    public void testCarGetHorsePower1(){
        assertEquals(testCar.getHorsePower(), 175);
    } //end accessor method test
    
    /**
     * to test mutator method setHorsePower in class Car
     */
    @Test
    public void testCarSetHorsePower1(){
        testCar.setHorsePower(175);
        assertEquals(175, testCar.getHorsePower());
    } //end mutator method test

    /**
     * Tears down the test fixture for class Car.
     * Called after every test case method.
     * sets testCar to null
     */
    @After
    public void tearDownCar1(){
        testCar = null;
    } //end tear down
    
    /**
     * to test accessor method getYearManufactured in class Car
     */
    @Test
    public void testCarGetYearManufactured2(){
        testCar.setYearManufactured(1940);
        assertEquals(testCar.getYearManufactured(), 1940);
    } //end accessor method test
    
    /**
     * to test accessor method getMake in class Car
     */
    @Test
    public void testCarGetMake2(){
        testCar.setMake("Buggati");
        assertEquals(testCar.getMake(), "Buggati");
    } //end accessor method test
    
    /**
     * to test accessor method getModel in class Car
     */
    @Test
    public void testCarGetModel2(){
        testCar.setModel("Veyron");
        assertEquals(testCar.getModel(), "Veyron");
    } //end accessor method test
    
    /**
     * to test accessor method getHorsePower in class Car
     */
    @Test
    public void testCarGetHorsePower2(){
        testCar.setHorsePower(135);
        assertEquals(testCar.getHorsePower(), 135);
    } //end accessor method test
    
    /**
     * to test mutator method setHorsePower in class Car
     */
    @Test
    public void testCarSetHorsePower2(){
        testCar.setHorsePower(135);
        assertEquals(135, testCar.getHorsePower());
    } //end mutator method test
    
    /**
     * Tears down the test fixture.
     * Called after every test case method.
     * sets testCar to null
     */
    @After
    public void tearDownCar2(){
        testCar = null;
    } //end tear down
    
    /**
     * to test constructor for class Car
     */
    @Test
    public void testCarConstructor()
    {
        Car car1 = new Car(2000, "Lamborghini", "Diablo", 700);
        assertEquals(2000, car1.getYearManufactured());
        assertEquals("Lamborghini", car1.getMake());
        assertEquals("Diablo", car1.getModel());
        assertEquals(700, car1.getHorsePower());
    } //end test for constructor
    
        /**
     * to test equals method for class Car
     */
    @Test
    public void testCarEquals()
    {
        Car testCar1 = new Car(1940, "Buggati", "Veyron", 135);
        Car testCar2 = new Car(2014, "Honda", "Civic", 143);
        assertEquals(true, testCar1.equals(testCar2));
    } //end test for equals method

    /**
     * to test toString method for class Car
     */
    @Test
    public void testCarToString()
    {
        Car testCar1 = new Car(2000, "Lamborghini", "Diablo", 700);
        equals("This car is a 2000 Lamborghini Diablo with 700 hp., car1.toString()");
    } //end toString method test

    /**
     * to test compareTo method for class Car
     */
    @Test
    public void testCarCompareTo()
    {
        Car testCar1 = new Car(2014, "Honda", "Civic", 143);
        Car testCar2 = new Car(1940, "Buggati", "Veyron", 135);
        assertEquals(8, testCar1.compareTo(testCar2));
    } //end CompareTo method test
    
    /**
     * to test method accelerate for class Car
     */
    @Test
    public void testCarAccelerate()
    {
        Car testCar = new Car(2014, "Honda", "Civic", 143);
        testCar.accelerate();
    } //end accelerate method test
    
    @Test
    public void testCarSteerLeft()
    {
        Car testCar = new Car(2014, "Honda", "Civic", 143);
        testCar.steerLeft();
    } //end steerLeft method test
    
    @Test
    public void testCarSteerRight()
    {
        Car testCar = new Car(2014, "Honda", "Civic", 143);
        testCar.steerRight();
    } //end steerRight method test
    
    /**
     * The following tests are to test all methods of class Boat
     */
    /**
     * Sets up the test fixture for class Boat.
     * Called before every test case method.
     */
    @Before
    public void setUpTestBoat1(){
        testBoat = new Boat(1997, "Bayliner", "Extreme", true);
    } //end setup
    
    /**
     * to test accessor method getYearManufactured in class Boat
     */
    @Test
    public void testBoatGetYearManufactured1(){
        assertEquals(testBoat.getYearManufactured(), 1997);
    } //end accessor method test
    
    /**
     * to test accessor method getMake in class Boat
     */
    @Test
    public void testBoatGetMake1(){
        assertEquals(testBoat.getMake(), "Bayliner");
    } //end accessor method test
    
    /**
     * to test accessor method getModel in class Boat
     */
    @Test
    public void testBoatGetModel1(){
        assertEquals(testBoat.getModel(), "Extreme");
    } //end accessor method test
    
    /**
     * to test accessor method getMotorized in class Boat
     */
    @Test
    public void testBoatGetMotorized1(){
        assertEquals(testBoat.getIsMotorized(), true);
    } //end accessor method test
    
    /**
     * to test mutator method setMotorized in class Boat
     */
    @Test
    public void testBoatSetMotorized1(){
        testBoat.setIsMotorized(true);
        assertEquals(true, testBoat.getIsMotorized());
    } //end mutator method test

    /**
     * Tears down the test fixture for class Car.
     * Called after every test case method.
     * sets testCar to null
     */
    @After
    public void tearDownBoat1(){
        testBoat = null;
    } //end tear down
    
    /**
     * to test accessor method getYearManufactured in class Boat
     */
    @Test
    public void testBoatGetYearManufactured2(){
        testBoat.setYearManufactured(2000);
        assertEquals(testBoat.getYearManufactured(), 2000);
    } //end accessor method test
    
    /**
     * to test accessor method getMake in class Boat
     */
    @Test
    public void testBoatGetMake2(){
        testBoat.setMake("American Skier");
        assertEquals(testBoat.getMake(), "American Skier");
    } //end accessor method test
    
    /**
     * to test accessor method getModel in class Boat
     */
    @Test
    public void testBoatGetModel2(){
        testBoat.setModel("Skier Supreme");
        assertEquals(testBoat.getModel(), "Skier Supreme");
    } //end accessor method test
    
    /**
     * to test accessor method getMotorized in class Boat
     */
    @Test
    public void testBoatGetMotorized2(){
        testBoat.setIsMotorized(false);
        assertEquals(testBoat.getIsMotorized(), false);
    } //end accessor method test
    
    /**
     * to test mutator method setHorsePower in class Car
     */
    @Test
    public void testCarSetMotorized2(){
        testBoat.setIsMotorized(false);
        assertEquals(false, testBoat.getIsMotorized());
    } //end mutator method test
    
    /**
     * Tears down the test fixture.
     * Called after every test case method.
     * sets testBoat to null
     */
    @After
    public void tearDownBoat2(){
        testBoat = null;
    } //end tear down
    
    /**
     * to test constructor for class Boat
     */
    @Test
    public void testBoatConstructor()
    {
        Boat boat1 = new Boat(2014, "Bayliner", "Extreme II", true);
    } //end test for construct

    /**
     * to test method equals of class Boat
     */
    @Test
    public void testBoatEquals()
    {
        Boat boat1 = new Boat(1980, "Bayliner", "Extreme", true);
        Boat boat2 = new Boat(2014, "Bayliner", "Extreme II", true);
        assertEquals(true, boat1.equals(boat2));
        Boat boat3 = new Boat(2000, "American Skier", "Skier Supreme", false);
        assertEquals(false, boat1.equals(boat3));
    } //end test for equals in class Boat

    /**
     * to test method toString in class Boat
     */
    @Test
    public void testBoatToString()
    {
        Boat boat1 = new Boat(2000, "American Skier", "Skier Supreme", false);
        equals("This boat is a 2000 American Skier Skier Surpreme without (motor)., boat1.toString()");
    } //end test for method toString

    /**
     * to test method compareTo in class Boat
     */
    @Test
    public void testBoatCompareTo()
    {
        Boat boat1 = new Boat(2014, "Bayliner", "Extreme II", true);
        Boat boat2 = new Boat(2010, "Boesch", "Journey", false);
        assertEquals(4, boat1.compareTo(boat2));
    } //end test for compareTo
    
    /**
     * to test method accelerate for class Boat
     */
    @Test
    public void testBoatAccelerate()
    {
        Boat testBoat = new Boat(2014, "Bayliner", "Extreme II", true);
        testBoat.accelerate();
    } //end accelerate method test
    
    @Test
    public void testBoatSteerLeft()
    {
        Boat testBoat = new Boat(2014, "Bayliner", "Extreme II", true);
        testBoat.steerLeft();
    } //end steerLeft method test
    
    @Test
    public void testBoatSteerRight()
    {
        Boat testBoat = new Boat(2014, "Bayliner", "Extreme II", true);
        testBoat.steerRight();
    } //end steerRight method test
    
    /**
     * Following tests is to test class Airplane methods
     */
    /**
     * Sets up the test fixture for class Boat.
     * Called before every test case method.
     */
    @Before
    public void setUpTestAirplane1(){
        testAirplane = new Airplane(1998, "ABC Motors", "Comac", 10000);
    } //end setup
    
    /**
     * to test accessor method getYearManufactured in class Airplane
     */
    @Test
    public void testAirplaneGetYearManufactured1(){
        assertEquals(testAirplane.getYearManufactured(), 1998);
    } //end accessor method test
    
    /**
     * to test accessor method getMake in class Airplane
     */
    @Test
    public void testAirplaneGetMake1(){
        assertEquals(testAirplane.getMake(), "ABC Motors");
    } //end accessor method test
    
    /**
     * to test accessor method getModel in class Airplane
     */
    @Test
    public void testAirplaneGetModel1(){
        assertEquals(testAirplane.getModel(), "Comac");
    } //end accessor method test
    
    /**
     * to test accessor method getMaximumHeightFeet in class Airplane
     */
    @Test
    public void testAirplaneGetMaximumHeightFeet1(){
        assertEquals(testAirplane.getMaximumHeightFeet(), 10000);
    } //end accessor method test
    
    /**
     * to test mutator method setMaximumHeightFeet in class Airplane
     */
    @Test
    public void testAirplaneSetMaximumHeightFeet1(){
        testAirplane.setMaximumHeightFeet(10000);
        assertEquals(10000, testAirplane.getMaximumHeightFeet());
    } //end mutator method test

    /**
     * Tears down the test fixture for class Airplane.
     * Called after every test case method.
     * sets testAirplane to null
     */
    @After
    public void tearDownAirplane1(){
        testAirplane = null;
    } //end tear down
    
    /**
     * to test accessor method getYearManufactured in class Airplane
     */
    @Test
    public void testAirplaneGetYearManufactured2(){
        testAirplane.setYearManufactured(2014);
        assertEquals(testAirplane.getYearManufactured(), 2014);
    } //end accessor method test
    
    /**
     * to test accessor method getMake in class Airplane
     */
    @Test
    public void testAirplaneGetMake2(){
        testAirplane.setMake("Abrams");
        assertEquals(testAirplane.getMake(), "Abrams");
    } //end accessor method test
    
    /**
     * to test accessor method getModel in class Airplane
     */
    @Test
    public void testAirplaneGetModel2(){
        testAirplane.setModel("Motorhead");
        assertEquals(testAirplane.getModel(), "Motorhead");
    } //end accessor method test
    
    /**
     * to test accessor method getMaximumHeightFeet in class Airplane
     */
    @Test
    public void testAirplaneGetMaximumHeightFeet2(){
        testAirplane.setMaximumHeightFeet(70000);
        assertEquals(testAirplane.getMaximumHeightFeet(), 70000);
    } //end accessor method test
    
    /**
     * to test mutator method setMaximumHeightFeet in class Airplane
     */
    @Test
    public void testBoatSetMaximumHeightFeet2(){
        testAirplane.setMaximumHeightFeet(70000);
        assertEquals(70000, testAirplane.getMaximumHeightFeet());
    } //end mutator method test

    /**
     * Tears down the test fixture for class Airplane.
     * Called after every test case method.
     * sets testAirplane to null
     */
    @After
    public void tearDownAirplane2(){
        testAirplane = null;
    } //end tear down
    
    /**
     * to test constructor for class Airplane
     */
    @Test
    public void testAirplaneConstructor()
    {
        Airplane airplane1 = new Airplane(2014, "Abrams", "Motorhead", 70000);
    } //end test for construct

    /**
     * test to construct an Airplane object
     */
    @Test
    public void testConstructor()
    {
        Airplane airplane1 = new Airplane(2012, "Boeing", "737", 80000);
        assertEquals(2012, airplane1.getYearManufactured());
        assertEquals("Boeing", airplane1.getMake());
        assertEquals("737", airplane1.getModel());
        assertEquals(80000, airplane1.getMaximumHeightFeet());
    } //end constructor test for class Airplane

    /**
     * test equals method in class Airplane
     */
    @Test
    public void testEquals()
    {
        Airplane airplane1 = new Airplane(2012, "Boeing", "737", 80000);
        Airplane airplane2 = new Airplane(2014, "Abrams", "Motorhead", 70000);
        assertEquals(10000, airplane1.compareTo(airplane2));
    } //end test equals

    /**
     * test toString method in class Airplane
     */
    @Test
    public void testToString()
    {
        Airplane airplane1 = new Airplane(2014, "Abrams", "Motorhead", 70000);
        equals("This airplane is a 2014 Abrams Motorhead that can reach 70000 feet., airplane1.toString()");
    } //end test toString

    /**
     * test compareTo method in Airplane
     */
    @Test
    public void testCompareTo()
    {
        Airplane airplane1 = new Airplane(2014, "Abrams", "Motorhead", 70000);
        Airplane airplane2 = new Airplane(1940, "Boeing", "84", 45000);
        assertEquals(25000, airplane1.compareTo(airplane2));
    } //end test compareTo
    
    /**
     * to test method accelerate for class Airplane
     */
    @Test
    public void testAirplaneAccelerate()
    {
        Airplane airplane2 = new Airplane(1940, "Boeing", "84", 45000);
    } //end accelerate method test
    
    @Test
    public void testAirplaneSteerLeft()
    {
        Airplane airplane2 = new Airplane(1940, "Boeing", "84", 45000);
        testAirplane.steerLeft();
    } //end steerLeft method test
    
    @Test
    public void testAirplaneSteerRight()
    {
        Airplane airplane2 = new Airplane(1940, "Boeing", "84", 45000);
        testAirplane.steerRight();
    } //end steerRight method test
    
} //end class TestVehicleAssignment2
