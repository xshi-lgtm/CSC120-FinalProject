import java.util.Scanner;

/* The Building burton hall inherited from building class */
public class BurtonHall extends Building{

    /**
     * Constructor for burton hall class inherited from building class
     * @param name the name of burton hall
     * @param address the address of burton hall
     * @param nFloors the number of floors in burton hall
     */
    public BurtonHall(String name, String address, int nFloors){
        super(name, address, nFloors);
    }

    /**
     * Method to explore burton hall for clues.
     * User can stay inside Burton and keep choosing floors
     * until they type "exit" / "b" to leave the building.
     */
    public void explore(Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("--- Welcome to Burton Hall! ---");

        boolean exploringBurton = true;

        while (exploringBurton) {
            System.out.println("\nYou are inside Burton Hall.");
            System.out.println("Floors you can visit:");
            System.out.println("1. Restroom ");
            System.out.println("2. Professor Gorom's Office");
            System.out.println("3. Professor Price's Office");
            System.out.println("4. Landscape studio (4th floor)");
            System.out.println("Type 1-4 to choose a floor, or type 'exit' to leave Burton.");
            System.out.print("Your choice: ");

            String choice1 = in.nextLine().trim().toLowerCase();

            switch (choice1) {
                case "1":
                case "2":
                case "3":
                    System.out.println("It seems super quiet and empty here. Maybe try another floor.");
                    break;

                case "4":
                    exploreLandscapeStudio(player, in, clueList, clueBook);
                    break;

                case "exit":
                    System.out.println("You decide to leave Burton Hall for now.");
                    exploringBurton = false;
                    break;

                default:
                    System.out.println("Not sure what you mean. Please type 1, 2, 3, 4, or 'exit'.");
            }
        }
    }

    /**
     * Method to explore the landscape studio on the 4th floor
     * @param player player itself
     * @param in user input
     * @param clueList all clues in the game
     * @param clueBook player's collected clues
     */
    private void exploreLandscapeStudio(Myself player, Scanner in, ClueList clueList, ClueBook clueBook) {
        System.out.println("You arrive at the 4th floor landscape studio. The door requires special OneCard access.");
        System.out.println("Here are several options: ");
        System.out.println("1. Try your own OneCard ");
        System.out.println("2. Call classmate Jane ");
        System.out.println("3. Knock the door");
        System.out.println("4. Go back to the hallway");
        System.out.print("Choose 1-4: ");

        String choice2 = in.nextLine().trim();
        boolean enterStudio = false;

        switch(choice2){
            case "1":
                System.out.println("You don't have access to the landscape studio.");
                enterStudio = false;
                break;
            case "2":
                System.out.println("Jane responds to your phone call: \"I'm at the studio right now, I'll come and get you!\"");
                enterStudio = true;
                break;
            case "3": 
                System.out.println("Your friend Jane is in the studio: \"Oh hey, come in!\"");
                enterStudio = true;
                break;
            case "4": 
                System.out.println("You decide not to go in and stay in the hallway.");
                enterStudio = false;
                break;
            default:
                System.out.println("Not sure what you mean. Select a valid option 1-4.");
        }

        if (!enterStudio) {
            return;
        }

        boolean inStudio = true;
        while (inStudio){
            System.out.println("\nNow you've entered the landscape studio, you can:");
            System.out.println("1. Look at professor's desk");
            System.out.println("2. Check your roommate's desk");
            System.out.println("3. Look around the studio");
            System.out.println("4. Email the professor and ask about your roommate");
            System.out.println("5. Leave the studio (back to the hallway)");
            System.out.print("Choose 1-5: ");

            String choice3 = in.nextLine().trim();

            switch(choice3){
                case "1":
                    revealClue("BURTON_1", clueList, clueBook);
                    break;
                case "2":
                    revealClue("BURTON_2", clueList, clueBook);
                    break;
                case "3":
                    revealClue("BURTON_3", clueList, clueBook);
                    break;
                case "4":
                    emailProfessor(player, in, clueList, clueBook);
                    break;
                case "5":
                    inStudio = false; 
                    break;
                default:
                    System.out.println("Jane doesn't understand what you're talking about.");
            }
        }
    }

    /**
     * Method to email the professor about the roommate
     * @param player player itself
     * @param in user input
     * @param clueList all clues in the game
     * @param clueBook player's collected clues
     */
    private void emailProfessor(Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("You open your laptop and write an email to the landscape professor.");
        System.out.println("You: \"Hi Professor, I haven't seen my roommate. Do you know where she is?\"");
        System.out.println("Professor replies: \"She emailed me saying she has a family situation and will miss class.\"");
        System.out.println("[You learn that your roommate said she has family reasons.]");
        System.out.println("You suddenly think: maybe her parents know more...");
    }
}



