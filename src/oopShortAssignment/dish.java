package oopShortAssignment;


public class dish {

    private int cost;
    private String nameOfDish;
    private boolean wouldRecommend;

    public void setCost(int costOfDish) {
        this.cost = costOfDish;
    }
    public int getCost() {
        return this.cost;
    }

    public void setName(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }
    public String getName(){
        return this.nameOfDish;
    }

    public void setRecommendation(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
    public boolean getRecommendation() {
        return this.wouldRecommend;
    }



//    public void printSummary() {
//        System.out.printf("The cost of each %s Taco is %d cents, and it is %b that I would recommend.", nameOfDish, costInCents, wouldRecommend);
//    }

}
