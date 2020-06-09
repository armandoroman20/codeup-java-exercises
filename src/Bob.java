import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String conversation;
//        String choice;
//        do {
//            System.out.println("Talk to Bob");
//            conversation = scanner.nextLine();
//            if (conversation.endsWith("?")) {
//                System.out.println("sure");
//            } else if (conversation.endsWith("!")) {
//                System.out.println("Whoa, chill out");
//            } else if (conversation.isEmpty()){
//                System.out.println("Fine. Be that way!");
//            } else {
//                System.out.println("Whatever");
//            }
//            System.out.println("\nDo you want to continue talking?(Y/N)");
//            choice = scanner.nextLine();
//        }while(choice.equalsIgnoreCase("y"));
//        System.out.println("Bye bob!");
//        scanner.close();
//        System.out.println("Scanner closed");

        //=====SOPHIES WAY=====//

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("If you want to talk to Bob, say hi!");

        String userInput;
        boolean greeting;

        do{
            userInput = sc.next();
            greeting = (!userInput.equals("bye"));

            if(userInput.endsWith("?")){
                System.out.println("Sure.");
            }else if(userInput.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }else if(userInput.equals("")){
                System.out.println("Fine. Be that way!");
            }else{
                System.out.println("Whatever.");
            }

        }while(greeting);


       }
    }

