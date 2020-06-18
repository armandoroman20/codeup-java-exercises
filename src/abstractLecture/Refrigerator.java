package abstractLecture;

public class Refrigerator extends Appliance{
    @Override
    public void makeSound() {
        System.out.println("The fridge hums...");
    }

    @Override
    public void doWork() {
        System.out.println("Keep it chill");
    }

}
