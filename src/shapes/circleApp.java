package shapes;

import util.Input;

public class circleApp {
    public static void main(String[] args) {
        Input in = new Input();

        boolean willContinue = false;
        do {
            System.out.print("Please enter a number: ");
            double radius = in.getDouble();
            Circle c = new Circle(radius);
            System.out.println(c.getArea());
            System.out.println(c.getCircumference());
            System.out.println("Circle count is: " + Circle.getCircleCount());
            System.out.println("Do you want to continue?");
            willContinue = in.yesNo();

        }while(willContinue);
        System.out.println("Your total circle count is: " + Circle.getCircleCount());
        System.out.println("Goodbye");
    }
}
