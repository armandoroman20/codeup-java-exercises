package abstractLecture.deliveryTruck;

public class TruckOne extends RefrigeratedTruck{
    @Override
    public void coolTime() {
        System.out.println("This truck keeps items cold for 8 hours");
    }
}
