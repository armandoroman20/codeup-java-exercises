import java.util.Random;

public class ServerNameGenerator {
    private static String[] adjectives = {"small", "wonderful", "stocky", "fit", "lazy", "clumsy", "nice", "fancy", "massive", "little"};
    private static String[] nouns = {"window", "cup", "pencil", "boy", "girl", "phone", "shovel", "jelly", "desert", "money"};

    static Random randomizer = new Random();

    public static String randomElem(String[] words){
        return words[randomizer.nextInt(words.length)];

    };

    public static String serverName(String a, String b){
        return "Your new server name is: " + a + "-" + b;
    }


//    public static void random() {
//        Random random = new Random();
//        int adj = random.nextInt(adjectives.length);
//        int noun = random.nextInt(nouns.length);
//        System.out.println("Your random new server name is: " + adjectives[adj] + "-" + nouns[noun]);
//    }

    public static void main(String[] args) {
        System.out.println(serverName(randomElem(adjectives), randomElem(nouns)));
//    random();
    }
}
