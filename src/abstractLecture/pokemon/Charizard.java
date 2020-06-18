package abstractLecture.pokemon;

public class Charizard extends Pokemon implements FireType{
    public Charizard(int hp, String name, String trainer) {
        super(hp, name, trainer);
    }


    @Override
    public void attack() {
        System.out.println("Charizard attacks...");
    }

    @Override
    public void fireBlast() {
        System.out.println("Charizard used fire blast!");
    }

    @Override
    public void flameWheel() {
        System.out.println("Charizard used flame wheel!");
    }

    @Override
    public void ember() {
        System.out.println("Charizard used ember!");
    }
}
