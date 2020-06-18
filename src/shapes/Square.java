package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    protected void setLength(double length) {

    }

    @Override
    protected void setWidth(double width) {

    }
//
//    protected double side;
//
//    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getArea() {
//        System.out.println("Using overridden area method");
//        return 4 * length;
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.println("Using overridden perimeter method");
//        return Math.pow(length, 2);
//    }
}
