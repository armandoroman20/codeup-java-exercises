import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {


    public static void main(String[] args) throws IOException {

//        Path myDirectory = Paths.get("src");
//        Path myFile = Paths.get("src","Bob.java");
//
//        System.out.println(Files.exists(myDirectory));
//        System.out.println(Files.exists(myFile));
//
//        // Using Paths.get(), check to see if your .gitignore file exists. Print the result
//        Path gitIgnore = Paths.get(".gitignore");
//        System.out.println(Files.exists(gitIgnore));

        String directory = "test";
        Path myTest = Paths.get("src", directory);
        // below is going to create a file called "hello.txt" in the test directory we made
        Path helloFile = Paths.get(directory, "hello.txt");

        // writing to hello.txt

//        String[] names = {"Justin", "Sophie", "Vivian"};
//        List<String> instructors = Arrays.asList(names);
//        List<String> students = new ArrayList<>();
//        students.add("laura");
//        students.add("andrew");
//        students.add("mark");
//        students.add("aaron");
//        students.add("jay");
//        try {
//            Files.write(helloFile, students);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            List<String> myStudents = Files.readAllLines(helloFile);
//            System.out.println(myStudents);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
        List<String> myStudents = Files.readAllLines(helloFile);
//        for(String student : myStudents){
//            System.out.println(student);
//        }

        String newStudent = "Ramon";
        List<String> newStudents = Arrays.asList("Ramon", "Jorge", "Augustine");
        Files.write(helloFile,newStudents,StandardOpenOption.APPEND);

        System.out.println(myStudents);

        List<String> newClass = new ArrayList<>();

        for(String student : myStudents){
            if(student.equals("justin")){
                newClass.add("Shelby");
                continue;
            }
            newClass.add(student);
        }

        Files.write(helloFile,newClass);
        System.out.println(newClass);

//        if (Files.notExists(myTest)) {
//            try {
//                Files.createDirectories(myTest);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if(Files.notExists(helloFile)){
//            try {
//                Files.createFile(helloFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }



    }





}
