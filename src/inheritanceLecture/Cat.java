package inheritanceLecture;

public class Cat extends Animal{


    private int noOfLivesLeft;

    public Cat(int noOfLivesLeft) {
        super("feline", 9);
        this.noOfLivesLeft = noOfLivesLeft;
    }

    public int getNoOfLivesLeft() {
        return noOfLivesLeft;
    }

    public void setNoOfLivesLeft(int noOfLivesLeft) {
        this.noOfLivesLeft = noOfLivesLeft;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
