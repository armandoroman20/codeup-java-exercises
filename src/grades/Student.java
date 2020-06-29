package grades;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Student {
    private String name;
    private static List<Integer> grades;



    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
    double sum = 0;
    for(int grade : grades) {
    sum += grade;
    }
        return sum / grades.size();
    }


    public static void main(String[] args) {
        Student student1 = new Student("armando");
        grades.add(100);
        grades.add(55);
        grades.add(60);
        System.out.println(student1.getGradeAverage());
    }



}
