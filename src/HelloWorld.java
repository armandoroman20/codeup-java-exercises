import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Ganymede!");
        System.out.println("Hello, World!");
        System.out.println("I am getting hungry");

//        Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        short myFavoriteNumber = 10;
        System.out.println("My favorite number is: " + myFavoriteNumber);
//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "I am Batman!";
        System.out.println(myString);
//        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        double myNumber = 3.14;
        System.out.println(myNumber/myFavoriteNumber);

//        System.out.println("\"This is a double quoted string\"");

//        Copy and paste the following code blocks one at a time and execute them
        int x = 5;
        System.out.println(x++); // this will show 24 because you increment AFTER you call it
        System.out.println(x);
        int y = 5;
        System.out.println(++y); // this will show 25 because you increment BEFORE you call it
        System.out.println(y);

/*
* below is changing a double to an int, which is making it smaller. prints out 3
*/
        double pi = 3.14159;
        int almostPi = (int) pi;
        System.out.println(almostPi);

/* because we converted a larger data into a smaller data type we lose whatever is changed when converted
so below will print out 3.0 since we lost everything after the decimal
in this case .14159
 */
        double piAgain = almostPi;
        System.out.println(piAgain);

        // QUESTION 12
//        String theNumberThree = "three";
//        Object o = theNumberThree;

        //both give errors because you can't cast object as int or string as int

//        int three = (int) o;
//        int three = (int) "three";

//        System.out.println(three);

// QUESTION 13
        int z = 4;
//      x = x + 5; below is shorthand for this line
        z += 5;
        System.out.println(z);
        int a = 3;
        int b = 4;
//      b = b * a; below is short hand for this line
        b *= a ;
        System.out.println(b);

        int c = 10;
        int d = 2;
//        c = c / d;
//        d = d - c;
        c /= d;
        System.out.println(c);

        d -= c;
        System.out.println(d);

        /*this is an example as a placeholder, think of it as a variable,
        we use the %s to denote a place holder for the string 'name',
        using System.out.printf we can call upon this placeholder
        then we call upon name after the comma
         */
        String name = "codeup";

        System.out.printf("Hello there, %s. Nice to see you.\n", name);
        /*
        here we are using multiple placeholders using %s, greeting, and name
        whichever placeholder is called ion first will determine what is printed first
         */
        String greeting = "Salutations";
        System.out.printf("%s, %s!", greeting, name);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
//        String userInput = scanner.next(); // this will only take in the next single word entered
        String userInput = scanner.nextLine();  // this will take in a full sentence


        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}
