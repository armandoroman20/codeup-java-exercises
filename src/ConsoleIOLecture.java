import java.util.Scanner;

public class ConsoleIOLecture {

    public static void main(String[] args) {

//        System.out.println("Hello Ganymede!");
        // ================================== print() and println()

        // this:
//            System.out.println("here");
//            System.out.println("there");

        // is equivalent to this:
//            System.out.print("here\n");
//            System.out.print("there\n");

        // without the newline characters, print outputs this:
//            System.out.print("here");
//            System.out.print("there");

        // to concatenate, just like JS:
//            System.out.println("Hello" + " " + "World");


        // ================================== printf()

//         Print a formatted string using the following... printf(formatString, data)
//         printf allows you to use placeholders
        // same output as print():
//            System.out.printf("Hello");
//            System.out.printf("World!");



        // creating a string variable:
//            String bigBall = "World";
            // %n is new line
            // %s is to call a string
//            System.out.printf("Hello %s", bigBall);
//            System.out.printf("Hello %S", bigBall); // all caps

        // multiple variables:
//            int three = 3;
//            double threeHalf= 3.5;
//            String typeOfPetGroup = "cats";
        //    %d to represents a whole integer
        //    %f represents a floating point number, works woth doubles and floats
        //    %.2f represents 2 decimal places to be printed out
//        System.out.printf("I have  %d %s.\n", three, typeOfPetGroup);
//        System.out.printf("I have  %f %s.\n", threeHalf, typeOfPetGroup);
//        System.out.printf("I have  %.2f %s.\n", threeHalf, typeOfPetGroup);


        // currency:
//            int currencyPennies = 1000;
//            System.out.printf("I'll sell you swamp land for $%.2f an acre!", currencyPennies / 100.00);




        // ================================== USER INPUT

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        String userInput = sc.next(); // next will only spit out the first word
//        String userInput = sc.nextLine(); // nextLine will spit out full sentence
//        System.out.println(userInput);


        // .next() captures each input separated by whitespace:
//            System.out.print("Please enter your first, middle, and last name: ");
//            this will wait until user enters three separate items THEN print
//            String firstName = sc.next();
//            String lastName = sc.next();
//            String what = sc.next();
//
//            System.out.println(firstName);
//            System.out.println(lastName);
//            System.out.println(what);

        // .nextInt() captures the first valid int value:
//            System.out.print("Please enter your age: ");
//            int age = sc.nextInt();
//            System.out.println(age);
//            System.out.println("Your age doubled is: " + age * 2);

        // .nextLine():
//            remember this takes in the whole sentence
//            System.out.print("Favorite quote: ");
//            String quote = sc.nextLine();
//            System.out.println(quote);


        // unexpected behaviour
//        System.out.println("enter a word:");
//            String word1 = sc.next();
//            // to capture the sentence without program ending enter the following line
//            sc.nextLine(); // needed to clear out hitting enter
//        System.out.println("enter a sentence:");
//            String line1 = sc.nextLine();
//        System.out.println("enter a word:");
//            String word2 = sc.next();
//            sc.nextLine(); // needed to clear out hitting enter
//        System.out.println("enter a sentence:");
//            String line2 = sc.nextLine();
//            System.out.printf("%s%n%s%n%s%n%s%n", word1, line1, word2, line2);

        // check for presence of various data types

//            int userInt = 0;
//            if (sc.hasNextInt()) {
//                userInt = sc.nextInt();
//                System.out.printf("The user entered %d. This number times two is %d.", userInt, userInt * 2);
//            } else {
//                System.out.println("The user did not enter an integer");
//            }


    }

}
