package abstractLecture;

public class Blender extends Appliance{
    @Override
    public void makeSound() {
        System.out.println("Loud whirl");
    }

    @Override
    public void doWork() {
        System.out.println("blend stuff");
    }
}
