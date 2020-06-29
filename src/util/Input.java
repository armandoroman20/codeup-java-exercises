package util;
import java.util.Scanner;
public class Input {

    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

//    private final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        // the input class can be used in place of scanner
        Input in = new Input();

        // getString()

//        System.out.println("Please enter your favorite word");
//        String favWord = in.getString();
//        System.out.println(favWord);
//
//        //yesNO()
//
//        System.out.print("Will you continue? ");
//        boolean yesNo = in.yesNo();
//        System.out.println(yesNo);

        // getInt()

//        System.out.print("Please enter a whole number: ");
//        int num = in.getInt();
//        System.out.println("You entered: " + num);

        // getInt(int min, int max)

//        System.out.print("Please enter a whole number between 1 and 10: ");
//        int numInRange = in.getInt(1, 10);
//        System.out.println("You entered " + numInRange);


        System.out.print("Please enter a number");
        double dNum = in.getDouble();
        System.out.println("You entered: " + dNum);

//        System.out.print("Please enter a whole number between 1 and 10: ");
//        double dNumInRange = in.getDouble(1, 10);
//        System.out.println("You entered " + dNumInRange);
    }



    public String getString() {
        return sc.nextLine();
    }
//
//
//
//    public boolean yesNo() {
//        // below is to clear out
//        String input = sc.next();
//        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
//    }

//    public int getInt(){
//        String userInput = getString();
//        try{
//            int userInt = Integer.valueOf(userInput);
//            return userInt;
//        }catch (NumberFormatException e){
//            System.out.println("Invalid input! Please enter an integer.");
//            return getInt();
//        }

//        if(sc.hasNextInt()) {
//            return sc.nextInt();
//        } else {
//            System.out.println("Error, please enter a valid integer");
//            //sc.next() will clear out scanner so i won't get a stack overflow error
//            sc.next();
//            return getInt();
//        }
//    }

//    public int getInt(int min, int max){
//        int userInt = getInt();
//        if (userInt >= min && userInt <= max) {
//            return userInt;
//        } else {
//            //if given wrong input ill just rerun THIS method
//            System.out.println("Please enter an integer between: " + min + " " + max);
//            return getInt(min, max);
//        }
//    }


//    public double getDouble(double min, double max){
//        double userDouble = getDouble();
//    }
//
    public double getDouble(){
        String userInput = getString();
        try{
            double userDouble = Double.valueOf(userInput);
            return userDouble;
        }catch (NumberFormatException e){
            System.out.println("Invalid input! Please enter a valid number.");
            return getDouble();
        }
    }
//        if(sc.hasNextDouble()) {
//            return sc.nextDouble();
//        } else {
//            System.out.println("Error, please enter a valid integer");
//            //sc.next() will clear out scanner so i won't get a stack overflow error
//            sc.next();
//            return getInt();
//        }
//    }
}
