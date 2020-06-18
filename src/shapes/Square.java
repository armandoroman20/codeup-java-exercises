package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    // i didnt make this as EXPLICIT as it should've been like in sophie's
//    @Override
//    public void setLength(double length) {
//
//    }
//
//    @Override
//    public void setWidth(double width) {
//
//    }

    //=====Sophie's way=====//
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
//
    //^^^^^Sophie's way^^^^^//

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
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
