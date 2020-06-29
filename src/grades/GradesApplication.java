package grades;
import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

        static HashMap<String,Student> students = new HashMap<>();
        static Input input = new Input();
        static Scanner scanner = new Scanner(System.in);
    public static void studentList(){
        for (String username : students.keySet()) {
            System.out.println(username);
        }
        System.out.println();
    }

    public static void viewIndividualStudent() {
        System.out.println("Please enter the username you'd like more info on: ");
        String userName = input.getString();
        String choice;
        do {
            if (students.containsKey(userName)) {
                System.out.println("Name" + students.get(userName).getName() + " - GitHub Username: " + userName);
                System.out.printf("Current Average: %.2f\n", students.get(userName).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of \"" + userName + "\"");
            }
            System.out.println("Would you like to enter a student Id? 1 = yes");
            choice = scanner.next();
        }while(choice.equalsIgnoreCase("y"));

    }

    public static void viewAllGrades(){
        for(String username : students.keySet()){
            System.out.println(username + " : " + students.get(username));
        }
    }
    public static void main(String[] args) {
        Student Armando = new Student("Armando");
        Armando.addGrade(75);
        Armando.addGrade(100);
        Armando.addGrade(90);

        Student Nina = new Student("Nina");
        Nina.addGrade(80);
        Nina.addGrade(70);
        Nina.addGrade(60);

        Student Carlos = new Student("Carlos");
        Carlos.addGrade(90);
        Carlos.addGrade(80);
        Carlos.addGrade(90);

        students.put("roman9871", Armando);
        students.put("Nina-fit", Nina);
        students.put("Campos_carfamily", Carlos);


        viewIndividualStudent();
    }
}
