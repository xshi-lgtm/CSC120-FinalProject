import java.util.Scanner;

/* The Sabin reed class inherited from building class */
public class SabinReed extends Building{
    
    /**
     * The constructor for sabin reed inherited from building
     * @param name the name of sabin reed hall
     * @param address the address of sabin reed hall
     * @param nFloors the number of floors in sabin reed hall
     */
    public SabinReed(String name, String address, int nFloors){
        super(name, address, nFloors);
    }

    /**
     * Method to explore sabin reed for clues.
     * @param player palyer itself
     * @param in user input
     * @param clueList all clues in the game
     * @param clueBook player's collected clues
     */
    public void explore(Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("--- Welcome to Sabin Reed! ---");
        boolean exploringSabinReed = true;
        while (exploringSabinReed){
            System.out.println("There are 3 floors in Sabin Reed: ");
            System.out.println("1. Geography Lab");
            System.out.println("2. Statistics classroom");
            System.out.println("3. Linear algebra classroom");
            System.out.println("Choose the floor you want to go to (1-3), or type 'exit' to leave building: ");
            String choice1 = in.nextLine().trim();

            switch (choice1){
                case "1":
                    System.out.println("The geography lab looks normal and nobody is here. You didn't find any clue and left. ");
                    break;
                case "2":
                    System.out.println("On the second floor, you met your roommate's SDS classmate Doris ");
                    Boolean talking = true;
                    while(talking){
                        System.out.println("You can say: ");
                        System.out.println("1. Hi Doris, how are you? ");
                        System.out.println("2. Did my roommate come to class today? ");
                        System.out.println("3. Have a nice day, see you later!");
                        System.out.println("Choose 1-3: ");
                        String choice2 = in.nextLine().trim();
                        switch(choice2){
                            case "1":
                                System.out.println("I'm good. First time seeing you here.");
                                break;
                            case "2":
                                revealClue("SABINREED_1", clueList, clueBook);
                                talking = false;
                                break;
                            case "3":
                                System.out.println("Bye.");
                                talking = false;
                                break;
                            default:
                                System.out.println("Doris: I don't understand what you're saying. ");
                        }   
                    }
                    break;
                case "3":
                    System.out.println("There are other people having psychology class in the linear algebra classroom. ");
                    break;
                case "exit":
                    System.out.println("You decide to leave building.");
                    exploringSabinReed = false;
                    break;
                default:
                    System.out.println("You're not sure what to do. ");
            }

        }
    }
}
