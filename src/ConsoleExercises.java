import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {

        // Write some Java code that uses the variable pi to output the following:
//        double pi = 3.14159;
//        System.out.println(pi);
//        System.out.printf("The output is %.2f: ", pi);

        // Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        // What happens if you input something that is not an integer?
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//            int userNumber = scanner.nextInt();
//            //either works
//        System.out.printf("You entered: %d%n", userNumber);
//        System.out.println("You entered: " + userNumber);

        // Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.

//        System.out.printf("%nPlease enter 3 words: ");
//        String input1 = scanner.next();
//        String input2 = scanner.next();
//        String input3 = scanner.next();
//
////        System.out.println(input1);
////        System.out.println(input2);
////        System.out.println(input3);
//
//        System.out.printf("%s%n%s%n%s%n", input1, input2, input3);

//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        do you capture all the words?
//
//        System.out.println("Please enter a sentence");
//        String sentence = scanner.nextLine();
//        System.out.printf("You entered: %s", sentence);


//        Prompt the user to enter values of length and width of a classroom at Codeup.
//        scanner.useDelimiter(",");

        //=====THIS IS PARSING A STRING TO AN INT=====//

//        System.out.println("Please enter the length of the classroom: ");
//        String lengthString = scanner.nextLine();
//        int lengthINT = Integer.parseInt(lengthString);
//        System.out.println("Please enter the width of the classroom: ");
//        String widthString = scanner.nextLine();
//        int widthINT = Integer.parseInt(widthString);
//        System.out.println("The area of the classroom is: " + lengthINT * widthINT);
//        System.out.println("The perimeter of the classroom is: " + (lengthINT * 2) + (widthINT * 2));

//        In your perimeter/area calculator: - Accept decimal entries.
//        - Calculate the volume of the rooms in addition to the area and perimeter.

        //=====THIS IS PARSING A STRING INTO A DOUBLE=====//
        //=====CAN ALSO BE CHANGED TO A FLOAT=====//
//        System.out.println("Please enter the length of the classroom: ");
//        String lengthString = scanner.nextLine();
//        double lengthDub = Double.parseDouble(lengthString);
//        System.out.println("Please enter the width of the classroom: ");
//        String widthString = scanner.nextLine();
//        double widthDub = Double.parseDouble(widthString);
//        System.out.println("Please enter the height of the classroom: ");
//        String heightString = scanner.nextLine();
//        double heightDub = Double.parseDouble(heightString);
//
//        System.out.println("The area of the classroom is: " + lengthDub * widthDub);
//        System.out.println("The perimeter of the classroom is: " + (lengthDub * 2) + (widthDub * 2));
//        System.out.println("The volume of the classroom is: " + lengthDub * widthDub * heightDub);


                    //=====NON PARSING METHOD=====//
//        System.out.println("Please enter the length of the classroom: ");
//        float length = scanner.nextFloat();
//        System.out.println("Please enter the width of the classroom: ");
//        float width = scanner.nextFloat();
////        System.out.print("The area of the classroom is: " + length * width +  "\nThe perimeter of the classroom is:" + (length * 2) + (width * 2));
////        System.out.println("The perimeter of the classroom is: " + (length * 2) + (width * 2));
//        float area = length * width;
//        float perimeter = (length * 2) + (width * 2);
//        System.out.printf("The length of the classroom is: %.2f. \nThe width of the classroom is: %.2f. \nThe area of the classroom is: %.2f, \nThe perimeter of the classroom is: %.2f", length, width, area, perimeter);


        //=====Justin's method=====//
        System.out.print("Please enter length of room in centimeters:");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter width of room in centimeters:");
        int width = Integer.parseInt(scanner.nextLine());
        int area = length * width;
        int perimeter = (length + width) *2;
        System.out.printf("The area of the room is %d%nThe perimeter of the room is %d", area, perimeter);


    }
}
