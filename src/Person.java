public class Person {
    // this is an instance
    private String name;

    // this is the constructor
    public Person (String name) {
        // if in the setName method i have a transformation (lowercase)
        // like this.name = name.toLowerCase();
        // id use this.setName(name);
        // or below if i dont have a transformation i need to make
        this.name = name;
    }

    public String getName(){
        //TODO: return the person's name
        // use this.name to be more explicit in calling
        // private String name;
        return this.name;
    }

    public void setName(String name){
        //TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.println("This persons name is: " + this.name);
    }


    public static void main(String[] args){
        Person person = new Person("armando");
        person.sayHello();
        // below will print out message with different names
        person.setName("Roman");
        person.sayHello();
    }

}
