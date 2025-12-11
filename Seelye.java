import java.util.Scanner;

public class Seelye extends Building{

    public Seelye(String name, String address, int nFloors) {
        super(name, address, nFloors);
    }

    public void explore(Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("--- Welcome to Seelye! ---");
        System.out.println("There are 2 floors in Seelye ");
        System.out.println("1. Math classroom");
        System.out.println("2. Lost and Found");
        System.out.println("Choose the floor you want to go to (1-2): ");
        String choice1 = in.nextLine().trim();
        switch (choice1){
            case "1":
                talkToClassmate(in, clueList, clueBook);
                break;
            case "2":
                checkLostandFound(in, clueList, clueBook);
                break;
            default:
                System.out.println("You're not sure where to go.");
        }
    }

    private void talkToClassmate(Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("You met Joyce who just finished calc 3 class. ");
        Boolean talking = true;
        while(talking){
            System.out.println("Talk to Joyce! You can say: ");
            System.out.println("1. Hi, Joyce, how's your class? ");
            System.out.println("2. Did you see my roommate anywhere? ");
            System.out.println("3. Sorry, busying finding roommate. I'll talk to you later!");
            System.out.println("Choose 1-3: ");
            String choice2 = in.nextLine().trim();
            switch(choice2){
                case "1":
                    System.out.println("Joyce: Pretty Good, thanks!");
                    break;
                case "2":
                    revealClue("SEELYE_1", clueList, clueBook);
                    talking = false;
                    break;
                case "3":
                    System.out.println("Bye...");
                    talking = false;
                    break;
                default:
                    System.out.println("You said nothing and left. ");
            }
        }
    }

    private void checkLostandFound(Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("You checked the lost and found box and found something interesting...");
        revealClue("SEELYE_2", clueList, clueBook);
    }
}
