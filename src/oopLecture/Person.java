package oopLecture;

public class Person {


    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person (String name){
        this.name = name;
    }
    //
    // SLIDE 3
        private String firstName;
        private String lastName;
        private String name;
//        public int age;

        public String getName() {
            return name;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
    // SLIDE 4

        // instance variables
//        public String firstName;
//        public String lastName;
//
//        // instance method
//        public String sayHello() {
//                return lastName + ", " + firstName + " says hi!";
//        }


    // SLIDE 7
//        public static long worldPopulation = 7_500_000_000L; // class property
//        public String name;                                  // instance property
//
//        public static void main(String[] args) {

//                System.out.println(Person.worldPopulation);
//                Person.worldPopulation -= 1;
//                System.out.println(worldPopulation);


//                Person theBestDrummerAlive = new Person();
//                theBestDrummerAlive.name = "Neil Peart";
//                Person.worldPopulation += 1; // accessing a static property
                // this also works, but is usually not a good idea
//                System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
                // DONT DO THIS, it will not compile
//                 System.out.println(Person.name);
//        }

}
