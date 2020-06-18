package abstractLecture.animals;

public class Dog extends Animal implements canWalk, canSwim{
    @Override
    public void eat() {
        System.out.println("Eats dog food...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps in my bed");
    }

    @Override
    public void moveForward() {
        System.out.println("moving forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("Moving backward");
    }

    @Override
    public void canCrawl() {
        System.out.println("crawling");
    }

    @Override
    public void swimForward() {
        System.out.println("Swimming forward");
    }

    @Override
    public void swimBackwards() {
        System.out.println("Swimming backward");
    }
}
