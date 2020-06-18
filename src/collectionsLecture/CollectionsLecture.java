package collectionsLecture;
import java.util.*;
import java.util.function.DoubleToIntFunction;

public class CollectionsLecture {
    public static void main(String[] args) {
        // HOW TO CREATE AN ARRAYLIST

        List<String> instructors = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        List<Person> people = new ArrayList<>();

        List<String> randomList = new ArrayList<>();
        // HOW TO ADD ELEMENTS TO ARRAY LIST

        instructors.add("justin");
        instructors.add("Sophie");
        instructors.add("Casey");
        instructors.add("Vivian");
        System.out.println(instructors);
        System.out.println(instructors.size());
        System.out.println(instructors.contains("justin"));
        System.out.println(instructors.contains("Justin"));

        // after SOUTING the array should return the list without justin
        instructors.remove(0);
        System.out.println(instructors);

        // this is how to convert array numbers into list array
        // int[] threeNumbers = {10,2,6};
        // I have to convert above to the syntax below to convert into a list
        List<Integer> threeNumbers = Arrays.asList(10,2,6);
        List<Integer> numbersList = new ArrayList<>(threeNumbers);
        System.out.println(numbersList);


        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(10);
        numbers.add(10);
        System.out.println(numbers.indexOf(10));
        // since there's no 8 in the list the default is -1
        System.out.println(numbers.indexOf(8));
        System.out.println(numbers.lastIndexOf(10));


        // this is how to utilize constructor to add to arrayList
        people.add(new Person("Jim", "ross"));
        people.add(new Person("Bob", "Dole"));
        // this will set this person at index 0
        people.add(0, new Person("John", "smith"));
        // this will return the person at index 1
        System.out.println(people.get(1));
        // this will print out hash code
        System.out.println(people);

        // to get first name I need to iterate over the array
        for(Person aPerson : people){
            System.out.println(aPerson.getFirstName());
        }

        // testing to see if a list is empty// will will true or false depending on if it is or isn't
        System.out.println(instructors.isEmpty());
        System.out.println(randomList.isEmpty());

    }
}
