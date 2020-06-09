import java.util.Random;
import java.util.Scanner;
public class MethodsExercises {
     static Scanner input = new Scanner(System.in);
     static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        testArithmetic();
//        add();
//        subtract();
//        multiply();
//        divide();
//        getInteger();
//        factorial();
        dice();
        input.close();
        scanner.close();
        System.out.println("Scanners are closed");
    }

//    public static double add(double a, double b) {
//        return a + b;
//    }
//    public static double subtract(double a , double b) {
//        return a - b;
//    }
//    public static double multiply(double a, double b){
//        return a*b;
//    }
//    public static double divide(double a, double b){
//        return a/b;
//    }
    public static void testArithmetic() {
        System.out.println(add());
        System.out.println(subtract());
        System.out.println(multiply());
        System.out.println(divide());
        System.out.println(getInteger());
        System.out.println(factorial());
    }

// I made a and b local variables which allowed me to have scanner inputs be called unto the main method

    public static int add() {
        String choice;
        do {
            System.out.print("Enter first number to add: ");
            int a = input.nextInt();
            System.out.print("Enter second number to add: ");
            int b = input.nextInt();
            int total = a + b;
            System.out.print("The total number is: " + total);
            System.out.println("\nDo you want add more numbers?(Y/N)");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));
        return 0;
    }

    public static int subtract() {
        String choice;
        do {
            System.out.print("Enter first number to subtract: ");
            int c = input.nextInt();
            System.out.print("Enter second number to subtract: ");
            int d = input.nextInt();
            int subtracted = c - d;
            System.out.printf("The subtracted number is: %d", subtracted);
            System.out.println("\nDo you want subtract more numbers?(Y/N)");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));
        return 0; // i wonder if theres another fix besides this
    }

    public static int multiply() {
        String choice;
        do {
            System.out.print("Enter first number to multiply: ");
            int e = input.nextInt();
            System.out.print("Enter second number to multiply: ");
            int f = input.nextInt();
            int multiplied = e * f;
            System.out.print("The multiplied number is: " + multiplied);
            System.out.println("\nDo you want multiply more numbers?(Y/N)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y"));
        return 0;
    }
//
    public static int divide() {
        String choice;
        do {
            System.out.print("Enter first number to divide: ");
            int g = input.nextInt();
            System.out.print("Enter second number to divide by: ");
            int h = input.nextInt();
            int divided = g / h;
            System.out.print("The divided number is: " + divided);
            System.out.println("\nDo you want divide more numbers?(Y/N)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y"));
        return 0;
    }

    public static int getInteger(){
        System.out.print("Please enter a min number: ");
        int min = input.nextInt();
        System.out.print("Please enter a max number: ");
        int max = input.nextInt();
        System.out.printf("Enter a number between %d, %d", min, max);
        int userInput = input.nextInt();
        if (userInput > max || userInput < min) {
            System.out.println("Please enter a number within the range");
            return getInteger();
        }
        System.out.println("Thanks for entering a valid number.");
        return userInput;
    }

    public static long factorial () {
        String choice;
        do {
            long factored = 1;
            System.out.print("Enter an integer to calculate its factorial: ");

            long userInt = input.nextInt();

            for (int c = 1; c <= userInt; c++)
                factored = factored * c;
                System.out.printf("%d! is: %d: ", userInt, factored);

            System.out.println("\nDo you want to continue?(Y/N)");
            choice = scanner.nextLine();
        }while(choice.equalsIgnoreCase("y"));
        return 0;
    }

    public static void dice() {
        String choice;
        do {
            System.out.print("enter the number of sides for a pair of dice: ");
            int diceSides = input.nextInt();
            int rolled;
            Random random = new Random();
            for(int i = 0; i < 2; i++) {
                rolled = random.nextInt(diceSides) + 1;
                System.out.printf("You rolled %d\n", rolled);
            }
            System.out.println("\nDo you roll again?(Y/N)");
            choice = scanner.nextLine();
        }while(choice.equalsIgnoreCase("y"));
    }

}

