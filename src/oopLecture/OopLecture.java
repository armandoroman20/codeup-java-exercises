package oopLecture;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;
public class OopLecture {
    public static void main(String[] args) {

        // ======================== slide 3 (classes and objects)
        Scanner sc = new Scanner(System.in);
//
        //Look at person.java to see the class that'll allow me to use the .firstName, and .lastName
//            Person rick = new Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            rick.age = 23;
//            System.out.println(rick.firstName);
//            System.out.println(rick.lastName);
//            System.out.println(rick.age);
////            System.out.println(rick.isEmployed);
//
//            Person rick2 = new Person();
//            rick2.firstName = "Rick";
//            rick2.lastName = "Sanchez";
//            System.out.println(rick2.firstName);
//            System.out.println(rick2.lastName);
//
//        // this is false
//        System.out.println(rick == rick2);
//        // this will print out a custom id
//        System.out.println(rick);
//        System.out.println(rick2);
//
//            Person fred = new Person();
//            fred.firstName = "Fred";
//            fred.lastName = "Smith";
//            System.out.println(fred.firstName);
//            System.out.println(fred.lastName);



        // -- Dog Example --


//            Dog d1 = new Dog();
//
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";
//
//        System.out.println(d1.name);



        // ======================== slide 4 (object fields)

//            Person rick = new Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());

        // -- Dog Method Example --

//            Dog d1 = new Dog();
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";
//
//            d1.callForDog("Tater");


        // ======================== slide 5 (class fields)

        // If i get rid of static in the Arithmetic.java
        // I can create a new object here
        // Arithmetic a = new Arithmetic();
        // and input System.out.println(a.PI);
        // HOWEVER static would be best case usage



//            System.out.println(Arithmetic.PI);
//            System.out.println(Arithmetic.add(5, 5));
//            System.out.println(Arithmetic.multiply(5, 5));

        // -- DogHelper Example --

//        System.out.println(DogHelper.NUMBER_OF_DOG_BREEDS);
//        System.out.println(DogHelper.APPROX_POPULATION_OF_DOGS);

        // ======================== slide 7 (class vs. object fields)

//            Person theBestDrummerAlive = new Person();
//            theBestDrummerAlive.name = "Neil Peart";
//            Person.worldPopulation += 1; // accessing a static property
//
//            System.out.println(Person.worldPopulation);

//            // this also works, but is usually not a good idea
//            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//            System.out.println(theBestDrummerAlive.name);

//        Person person = new Person();
//        person.name = "John Smith";
//        person.age = 32;
//
        // below is hot to use the setTitle and getTitle method created
        // in the Post.java file
//        Post post = new Post();
//        post.setTitle("A day in the life");
//        System.out.println(post.getTitle());
//        post.category = "Funny";
//        post.title = "A day in the life";
//        post.content = "I am what i am";
//        post.createdAt = new Date();
//        post.editedAt = new Date();
//        post.author = person;

        // to call the printSummary method be sure to put object name in front of the method name
        // ex. post.printSummary
        // we defined what is printed out in the method in the Post.java file


//        post.printSummary();


        // to call the person object individual attributes you can sout and call the object.property
        // within the parenthesis

//        System.out.println(person.name);
        // ======================== slide 8 (constructors)



//            Student s = new Student("Cathy Smith");
////            s.name = "Justin Reich";
////            s.cohort = "Lassen";
//
//            Student s1 = new Student("Justin Reich", "Lassen");
//            System.out.println(s1.name);
//            System.out.println(s1.cohort);

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.printx(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 9 (this keyword)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 10 (visibility)

//            Student student = new Student("John Doe", 82.4);
//            System.out.println(student.name) // "John Doe"
//            // DON'T DO THIS - can't access private properties outside the class
//            System.out.println(student.grade);
//            System.out.println(student.shareGrade()); // Do this instead


    }
}
