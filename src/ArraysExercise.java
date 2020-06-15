import oopLecture.Person;
import java.util.Arrays;

public class ArraysExercise {
    public static Person[] addPerson(Person[] friend, Person person){
        Person[] newFriend = Arrays.copyOf(friend, friend.length + 1);

        // this is to assign the new person's name
        // to the last index of the new longer array
        newFriend[newFriend.length -1] = person;
        return newFriend;
    }

    public static void main(String[] args) {
        Person[] friend = new Person[3];
        friend[0] = new Person("sophie");
        friend[1] = new Person("Roman");
        friend[2] = new Person("Briana");
        friend = addPerson(friend, new Person("John"));
        for(Person eachPerson : friend){
            System.out.println(eachPerson.getName());
        }

    }

}
