package abstractLecture;

public class ApplianceTest {
    public static void main(String[] args) {
        Appliance myFridge = new Refrigerator();
        myFridge.brand = "lg";
        myFridge.doWork();
        System.out.println(myFridge.brand);
    }
}
