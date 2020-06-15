package arraysLecture;

import oopLecture.Person;

import java.util.Arrays;

public class ArraysLecture {
//    static int numberOfPlanets = 8;

    public static String[] colorsCopy(String[] array){
        String[] newCopy = Arrays.copyOf(array, array.length+1);
        return newCopy;
    }
    public static void main(String[] args) {
        // number inside of array is the length
//        String[] planets = new String[numberOfPlanets];

        // can also be done like this
        // anything that evaluates to an int, can be passed as an index
//        int numberOfPlanets = 8;
//        System.out.println(planets.length);
//        planets[0] = "Mercury";
//        planets[7] = "Neptune";

//        System.out.println(planets[0]);
//        System.out.println(planets[7]);

        // you can create an array with curl brackets if you know exactly what
        // want inside the array
//        int[]myNumbers = {1,2,3,4,5,6,7,8,9,10};
//
//        for(int x: myNumbers){
//            ++x;
//            System.out.println(x);
//        }
//        int[] otherNumbers = {5,4,3,2,1};
//        Arrays.sort(otherNumbers);
//        System.out.println(Arrays.toString(otherNumbers));
//        System.out.println(Arrays.equals(myNumbers,otherNumbers));
//
//        // create an array containing person object
//        Person justin = new Person("Justin", "Reich");
//        Person[] instructors = new Person[3];
//        instructors[0] = justin;
//        instructors[1] = new Person("sophie", "k");
//        instructors[2] = new Person("david", "stephens");
//        System.out.println(Arrays.toString(instructors));
//
//
//        Person[] oneMoreInstructor = Arrays.copyOf(instructors, instructors.length + 1);
//        System.out.println(Arrays.toString(oneMoreInstructor));
//        oneMoreInstructor[3] = new Person("john", "smith");
//        System.out.println(Arrays.toString(oneMoreInstructor));
//
//        // to actually print out name
//        for(Person instructor : instructors){
//            System.out.println(instructor.getFirstName());
//        }
//        System.out.println(instructors[2].getLastName());


//        // creating an array of car objects
//        Car[] myCars = new Car[5];
//        // instantiate a new object
//        myCars[0] = new Car();
//        myCars[0].setMake("Nissan");
//        myCars[0].setModel("Rogue");
//        myCars[0].setYear(2017);
//        System.out.println(myCars[0].getMake());
//        System.out.println(myCars[0].getModel());
//        System.out.println(myCars[0].getYear());
//
//        Car marksCar = new Car();
//        myCars[1] = marksCar;
//        marksCar.setMake("Ford");
//        System.out.println(marksCar.getMake());
//        System.out.println(myCars[1].getMake());


        //=====ENHANCED FOR LOOP=====//

//        String[] theBeatles = {"John", "Ringo", "George", "Paul"};
//        Arrays.sort(theBeatles);
//        for(String beatle: theBeatles){
//            System.out.println(beatle);
//        }

        //=====ARRAYS MANIPULATION METHODS=====//

        // arrays.fill
        String[] colors = new String[7];
        Arrays.fill(colors, "blue");
        System.out.println(Arrays.toString(colors));

        //Arrays.toString
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(colorsCopy(colors)));
        // Arrays.equals
//        System.out.println(Arrays.equals(instructors,theBeatles));


    }
}
