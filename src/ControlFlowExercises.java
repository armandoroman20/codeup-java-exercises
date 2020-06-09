import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


//        //=====increment by 2=====//

//        int j = 0;
//        do {
//            j+=2;
//            System.out.println(j);
//        }
//        while(j <= 100);
//    }

//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        }while(j >= -10);

//        start at 2, square numbers < 1,000,000

//            long j = 2;
//            do {
//                System.out.println(j);
//                j *= j;
//            }while(j < 1000000);

//        //=====increment by 2 FOR LOOP=====//

//        for(int i = 0; i <= 100 ; i += 2) {
//            System.out.println(i);
//        }

//        //=====decrement by 5 FOR LOOP=====//

//        int j;
//        for(j = 100; j >= -10 ; j -= 5) {
//            System.out.println(j);
//        }
//
//                    //=====FIZZBUZZ=====//
//
//        for(int k = 0; k <=100; k++) {
//            if(k%15==0)
//                System.out.println("FizzBuzz");
//            else if (k%5==0)
//                System.out.println("buzz");
//            else if(k%3==0)
//                System.out.println("fizz");
//            else
//            System.out.println(k);
//        }
//
        Scanner scanner = new Scanner(System.in);

                    //=====Display a table of powers=====//

//            char choice;
//            do {
//                System.out.print("What number would you like to go up to?");
//                int userInteger = scanner.nextInt();
//                System.out.println("Here is your table!");
//                System.out.println("number  | squared  | cubed");
//                System.out.println("------  | ------   | -----");
//                for (int i = 1; i <= userInteger; i++) {
//                    double squared = Math.pow(i, 2);
//                    double cubed = Math.pow(i, 3);
//                    System.out.printf("%n%d\t\t%.2f\t\t%.2f", i, squared, cubed);
//                }
//                System.out.println("\nDo you want to continue?(Y/N)");
//                choice = scanner.next().charAt(0);
//            } while (choice == 'y' || choice == 'Y');


        //=====DISPLAY GRADES=====//


//        char answer;
//        do {
//            System.out.print("Please enter a your grade: ");
//            int userGrade = scanner.nextInt();
//            if (userGrade <= 100 && userGrade >= 88)
//                System.out.println("You made an A!");
//            else if (userGrade <= 87 && userGrade >= 80)
//                System.out.println("You made a B!");
//            else if (userGrade <= 79 && userGrade >= 67)
//                System.out.println("You made a C!");
//            else if (userGrade <= 66 && userGrade >= 60)
//                System.out.println("You made a D!");
//            else if (userGrade <= 59 && userGrade >= 0)
//                System.out.println("You Failed!");
//            else
//                System.out.println("Please enter a grade between 0 - 100");
//            System.out.println("\nDo you want to continue?(Y/N)");
//            answer = scanner.next().charAt(0);
//        } while (answer == 'y' || answer == 'Y');
//        scanner.close();
//        System.out.println("Scanner Closed.");



    }}
