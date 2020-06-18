package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    //=====Sophie's way=====//
//    @Override
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    @Override
//    public void setWidth(double width) {
//        this.width = width;
//    }
    //^^^^^Sophie's way^^^^^//

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
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
