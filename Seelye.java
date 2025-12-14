import java.util.Scanner;

/* The seelye class inherited from building class */
public class Seelye extends Building{

    /**
     * The constructor for seelye inherited from building
     * @param name the name of seelye hall
     * @param address the address of seelye hall
     * @param nFloors the number of floors in seelye hall
     */
    public Seelye(String name, String address, int nFloors) {
        super(name, address, nFloors);
    }

    /**
     * Method to explore seelye for clues.
     * @param player palyer itself
     * @param in user input
     * @param clueList all clues in the game
     * @param clueBook player's collected clues
     */
    public void explore(Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("--- Welcome to Seelye! ---");
        boolean exploringSeelye = true;
        while (exploringSeelye){
            System.out.println("There are 2 floors in Seelye ");
            System.out.println("1. Math classroom");
            System.out.println("2. Lost and Found");
            System.out.println("Choose the floor you want to go to (1-2), or type 'exit' to leave seelye hall: ");
            String choice1 = in.nextLine().trim();
            switch (choice1){
                case "1":
                    talkToClassmate(in, clueList, clueBook);
                    break;
                case "2":
                    checkLostandFound(in, clueList, clueBook);
                    break;
                case "exit":
                    System.out.println("You decide to leave the seelye hall");
                    exploringSeelye = false;
                    break;
                default:
                    System.out.println("You're not sure where to go.");
            }

        }
    }

    /**
     * Method to talk to classmate.
     * @param in user input
     * @param clueList all clues in the game
     * @param clueBook player's collected clues
     */
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

    /**
     * Method to check the lost and found location.
     * @param in user input
     * @param clueList all clues in the game
     * @param clueBook player's collected clues
     */
    private void checkLostandFound(Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("You checked the lost and found box and found something interesting...");
        revealClue("SEELYE_2", clueList, clueBook);
    }
}
