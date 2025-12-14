import java.util.Scanner;

/* The gym class inherited from building class */
public class Gym extends Building{

    /**
     * The constructor for gym
     * @param name the name of gym
     * @param address the address of gym
     * @param nFloors the number of floors in gym
     */
    public Gym(String name, String address, int nFloors) {
        super(name, address, nFloors);
    }

    /**
     * Method to explore gym for clues.
     * @param player palyer itself
     * @param in user input
     * @param clueList all clues in the game
     * @param clueBook player's collected clues
     */
    public void explore (Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("--- Welcome to Gym! ---");
        System.out.println("There are 3 floors in Gym: ");
        boolean exploring = true;
        while (exploring){
            System.out.println("1. Reception ");
            System.out.println("2. Fitting room and swimming pool ");
            System.out.println("3. Fitness center ");
            System.out.println("Choose 1-3 or type 'exit' to leave: ");

            String choice1 = in.nextLine().trim();
            switch(choice1){
                case "1":
                    exploreReception(in, clueList, clueBook);
                    break;
                case "2":
                    explorePool(in, clueList, clueBook);
                    break;
                case "3":
                    exploreFitnessCenter(in, clueList, clueBook);
                    break;
                case "exit":
                    System.out.println("You've left the building");
                    exploring = false;
                    break;
                default:
                    System.out.println("You are not sure which floor you want to go to, so you stayed at the entrance. ");
            }
        }
    }

    /**
     * Method to explore reception in gym
     * @param in user input
     * @param clueList the entire list of clues 
     * @param clueBook the clues already collected by users. 
     */
    private void exploreReception(Scanner in, ClueList clueList, ClueBook clueBook){
        boolean exploringReception = true;
        while (exploringReception){
            System.out.println("You're now at the reception desk, you can: ");
            System.out.println("1. Ask the student worker at the reception about your roommate ");
            System.out.println("2. Look around ");
            System.out.println("Choose 1-2, or type 'exit' to leave: ");
            String choice2 = in.nextLine().trim();
            switch(choice2){
                case "1":
                    revealClue("GYM_1", clueList, clueBook);
                    break;
                case "2":
                    System.out.println("Unfortunately, you found nothing.");
                    break;
                case "exit":
                    System.out.println("You left the reception. ");
                    exploringReception = false;
                    break;
                default:
                    System.out.println("Nothing special here...");
            }
        }
    }

    /**
     * Method to explore swimming pool in gym
     * @param in user input
     * @param clueList the entire list of clues 
     * @param clueBook the clues already collected by users. 
     */
    private void explorePool(Scanner in, ClueList clueList, ClueBook clueBook){
        boolean exploringPool = true;
        while(exploringPool){
            System.out.println("You're now in front of the fitting room of the swimming pool, you can: ");
            System.out.println("1. Check the fitting room ");
            System.out.println("2. Check the swimming");
            System.out.println("Choose 1-2, or type 'exit' to leave the pool: ");
            String choice3 = in.nextLine().trim();
            switch(choice3){
                case "1":
                    revealClue("GYM_2", clueList, clueBook);
                    break;
                case "2":
                    revealClue("GYM_3", clueList, clueBook);
                    break;
                case "exit":
                    System.out.println("You decide to leave the pool for now.");
                    exploringPool = false;
                    break;
                default:
                    System.out.println("You hesitate and go back. ");
            }
        }
    }

    /**
     * Method to explore fitness center in gym
     * @param in user input
     * @param clueList the entire list of clues 
     * @param clueBook the clues already collected by users. 
     */
    private void exploreFitnessCenter(Scanner in, ClueList clueList, ClueBook clueBook){
        boolean exploringFitnessCenter = true;
        while (exploringFitnessCenter){
            System.out.println("You're now in the fitness center, you can: ");
            System.out.println("1. Work out on the elliptical machine for 30 minutes. ");
            System.out.println("2. Look around");
            System.out.println("Choose 1-2, or type 'exit' to leave: ");
            String choice4 = in.nextLine().trim();
            switch(choice4){
                case "1":
                    gymFriendConversation(in, clueList, clueBook);
                    break;
                case "2":
                    System.out.println("You looked around and found nothing special. Wearing a huge coat, you felt embarassed wandering around in the gym...");
                    break;
                case "exit":
                    System.out.println("You decide to leave the fitness center for now.");
                    exploringFitnessCenter = false;
                    break;
                default:
                    System.out.println("You hesitate and go back. ");
            }
        }
    }

    /**
     * Method for conversation with friends in gym
     * @param in user input
     * @param clueList the entire list of clues 
     * @param clueBook the clues already collected by users. 
     */
    private void gymFriendConversation(Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("As you're working out, one friend comes up to you and said: \" Hey, how are you?\" ");
        Boolean done = false;
        while (!done){
            System.out.println("You can respond: ");
            System.out.println("1. I'm good, how are you? ");
            System.out.println("2. Haven't seen you in a while! ");
            System.out.println("3. Have you seen my roommmate anywhere? I can't find her. ");
            System.out.println("4. Sorry, I'm working out right now, see you later! ");
            System.out.println("Choose 1-4 ");
            String choice5 = in.nextLine().trim();
            switch(choice5){
                case "1":
                    System.out.println("Friend: I'm good, thank you, trying to stay healthy hhhh");
                    break;
                case "2":
                    System.out.println("Friend: Yeah, we should have dinner together tonight. ");
                    break;
                case "3":
                    revealClue("GYM_4", clueList, clueBook);
                    done = true;
                    break;
                case "4":
                    System.out.println("Friend: Sorry, see you later!");
                    done = true;
                    break;
                default:
                    System.out.println("Friend: I'm not sure what you mean.");
            }
        }
    }

}
