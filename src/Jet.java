public class Jet extends Vehicle {
    private int maximumAltitude;

    public void takeOff(){
        System.out.println("Taking off...");
    }

    public Jet(boolean isOperable, int passengerCapacity, String powerSource, int maximumAltitude) {
        super(isOperable, passengerCapacity, powerSource);
        this.maximumAltitude = maximumAltitude;
    }

    public int getMaximumAltitude() {
        return maximumAltitude;
    }

    public void setMaximumAltitude(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    @Override
    public String toString() {
        return "Jet{" + "isOperable=" + isOperable +
                ", passengerCapacity=" + passengerCapacity +
                ", powerSource='" + powerSource +
                "maximumAltitude=" + maximumAltitude + '\'' +
        '}';
    }
}
