package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }
//    protected double width;
//    protected double length;
//
//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
}