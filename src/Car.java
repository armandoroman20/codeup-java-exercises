public class Car extends Vehicle{
    private int milerPerGallon;

    public Car(boolean isOperable, int passengerCapacity, String powerSource, int milerPerGallon) {
        super(isOperable, passengerCapacity, powerSource);
        this.milerPerGallon = milerPerGallon;
    }

    public int getMilerPerGallon() {
        return milerPerGallon;
    }

    public void setMilerPerGallon(int milerPerGallon) {
        this.milerPerGallon = milerPerGallon;
    }

    public void deployAirBag() {
        System.out.println("Deploying air bag!");
    }

    @Override
    public String toString() {
        return "Car{" + "isOperable=" + isOperable +
                ", passengerCapacity=" + passengerCapacity +
                ", powerSource='" + powerSource +
                "milerPerGallon=" + milerPerGallon + '\'' +
                '}';
    }
}
