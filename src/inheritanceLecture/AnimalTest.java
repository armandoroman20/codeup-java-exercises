package inheritanceLecture;

public class AnimalTest {



    public static void main(String[] args) {


//        Animal a = new Animal();
//        Dog d = new Dog();
//        Cat c = new Cat();
//
//        a.setAge(3);
//        a.setSpecies("Primate");
//
//        d.setSpecies("canine");
//        d.setAge(5);
//
//        c.setSpecies("Feline");
//        c.setAge(3);
//
//
////        a.makeNoise();
////        d.makeNoise();
////        c.makeNoise();
//
//        System.out.println(a.toString());
//        System.out.println("=============");
//        System.out.println(d.toString());
//        System.out.println("=============");
//        System.out.println(c.toString());

        Dog d = new Dog();
//        d.setSpecies("canine");
//        d.setAge(3);

//        d.setBreed("Pug");

        d.makeNoise();
//        d.makeGenericAnimalNoise();

        Animal a = new Animal();
        a.setSpecies("Primate");
        a.setAge(100);
        a.makeNoise();


        Cat c = new Cat(9);
        c.makeNoise();

        Animal[] animals = new Animal[2];
        animals[0] = d;
        animals[1] = c;

        Dog dog = (Dog) animals[0];
        dog.fetchBall();


//        makeAnimalsNoisy(animals);
    }

    private static void makeAnimalsNoisy(Animal[] animals) {
    }


}
