package inheritanceLecture;
// this is the child class from Animal

public class Dog extends Animal {

    private String breed;


    public Dog() {
        super();
    }

    public String getBreed() {
        return breed;
    }

    public void fetchBall() {
        System.out.println("The dog is fetching the ball");
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }

    // I over rid the makeNoise method from the parent
    // to the make noise with what noise a dog makes
    // I call the bark by typing d.makeNoise()

    public void makeNoise() {
        System.out.println("This animal BARKS");
    }

    // can also be done

//    @Override
//    public void makeNoise() {
//        System.out.println("This animal BARKS");
//    }

    // method overloading, im able to make a parameter
    // and when I put a String into the parameter field in the
    // d.makeNoise() in the AnimalTest.Java
    // the string input wil be printed out
//    public void makeNoise(String noise){
//        System.out.println(noise);
//    }


    // I made this method to print out the parent method of make noise by using
    // d.makeGenericAnimalNoise();
    // remember there is a difference between
    // d.makeGenericAnimalNoise(); AND d.makeNoise();

    public void makeGenericAnimalNoise() {
        // calling on the parent's method of makeNoise
        // with the word super
        super.makeNoise();
    }

    // since we added the String of breed in this class
    // I need to override the method toString to print out
    // the new string of Breed

    // original is below

//    @Override
//    public String toString() {
//        return "Animal{" +
//                "species='" + species + '\'' +
//                ", age=" + age +
//                '}';
//    }

    // above refactored turns into below

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + this.getSpecies() + '\'' +
                ", age=" + this.getAge() +
                ", breed='" + breed +'\'' + '}';
    }


}
