public class VehicleTest {
    public static void main(String[] args) {
//        Vehicle a = new Vehicle();
        Car honda = new Car(true, 4, "gasoline", 24);
        Jet j = new Jet(true, 2, "jetfuel", 45000);
//
//        a.setOperable(false);
//        a.setPassengerCapacity(3);
//        a.setPowerSource("Gasoline");



//        honda.setOperable(true);
//        honda.setPassengerCapacity(4);
//        honda.setPowerSource("Gasoline");
//
//        j.setOperable(true);
//        j.setPassengerCapacity(2);
//        j.setPowerSource("Fuel");

//        System.out.println(a.toString());
        System.out.println(honda.toString());
        honda.deployAirBag();
        System.out.println(j.toString());
        j.takeOff();
    }
}
