import java.util.Scanner;

/* The NeilsonLibrary class inherited from building class */
public class NeilsonLibrary extends Building{
    
    /**
     * The constructor for neilson library inherited from building
     * @param name the name of neilson library
     * @param address the address of neilson library
     * @param nFloors the number of floors in neilson library
     */
    public  NeilsonLibrary(String name, String address, int nFloors){
        super(name, address, nFloors);
    }

    /**
     * Method to explore neilson library for clues.
     * @param player palyer itself
     * @param in user input
     * @param clueList all clues in the game
     * @param clueBook player's collected clues
     */
    public void explore(Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("--- Welcome to Neilson Library! ---");
        boolean exploringNeilson = true;
        while (exploringNeilson){
            System.out.println("There are 3 floors in Neilson: ");
            System.out.println("1. Circulation desk, printers, borrowing desk ");
            System.out.println("2. Quiet space (where your roommate often studies)");
            System.out.println("3. Quiet space ");
            System.out.println("Choose the floor you want to go to (1-3), or type 'exit' to leave neilson: ");
            String choice1 = in.nextLine().trim();

            switch(choice1){
                case "1":
                    exploreFirstFloor(in, clueList, clueBook);
                    break;
                case "2":
                    exploreSecondFloor(in, clueList, clueBook);
                    break;
                case "3":
                    exploreThirdFloor(in, clueList, clueBook);
                    break;
                case "exit":
                    System.out.println("You decided to exit the building");
                    exploringNeilson = false;
                    break;
                default:
                    System.out.println("You feeling a bit lost. ");
            }

        }
    }

    /**
     * Method to explore neilson library first floor for clues.
     * @param player palyer itself
     * @param in user input
     * @param clueList all clues in the game
     * @param clueBook player's collected clues
     */
    private void exploreFirstFloor(Scanner in, ClueList clueList, ClueBook clueBook){
        boolean exploringFirstFloor = true; 
        while (exploringFirstFloor){
            System.out.println("You're now at the first floor in Neilson, you can: ");
            System.out.println("1. Ask at the circulation desk");
            System.out.println("2. Check the printers and computers");
            System.out.println("3. Go to the another borrowing desk");
            System.out.println("Choose 1-3, or type 'exit' to leave: ");
            String choice2 = in.nextLine().trim();

            switch(choice2){
                case "1":
                    revealClue("NEILSON_1", clueList, clueBook);
                    break;
                case "2":
                    revealClue("NEILSON_2", clueList, clueBook);
                    System.out.println("Want to check the computer? (yes/no): ");
                    String choice3 = in.nextLine().trim();
                    if (choice3.equals("yes")){
                        boolean exploringComputer = true;
                        while(exploringComputer){
                            System.out.println("Opening the computer, there are three folders on the desktop: ");
                            System.out.println("1. Document");
                            System.out.println("2. Files");
                            System.out.println("3. Downloads");
                            System.out.println("Choose 1-3 to select the folder you want to check or type 'exit' to stop exploring: ");
                            String choice4 = in.nextLine().trim();
                            switch (choice4){
                                case "1":
                                    System.out.println("No files in the document folder");
                                    break;
                                case "2":
                                    System.out.println("No files in the downloads folder");
                                    break;
                                case "3":
                                    revealClue("NEILSON_3", clueList, clueBook);
                                    break;
                                case "exit":
                                    System.out.println("You decied to stop exploring the computer. ");
                                    exploringComputer = false;
                                    break;
                                default:
                                    System.out.println("You decided to no longer explore the computer. ");
                            }

                        }
                    }
                    break;
                case "3":
                    revealClue("NEILSON_4", clueList, clueBook);
                    break; 
                case "exit":
                    System.out.println("You decided to leave neilson first floor");
                    exploringFirstFloor = false;
                    break;
                default:
                    System.out.println("You stand still, not sure what to do. ");
            }
        }
    }

    /**
     * Method to explore neilson library second floor for clues.
     * @param player palyer itself
     * @param in user input
     * @param clueList all clues in the game
     * @param clueBook player's collected clues
     */
    private void exploreSecondFloor(Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("You're now at the second floor in Neilson.");
        System.out.println("You looked around carefully.");
        revealClue("NEILSON_5", clueList, clueBook);
    }

    /**
     * Method to explore neilson library third floor for clues.
     * @param player palyer itself
     * @param in user input
     * @param clueList all clues in the game
     * @param clueBook player's collected clues
     */
    private void exploreThirdFloor(Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("You're now at the third floor in Neilson.");
        System.out.println("Walking around third floor, you noticed something ....");
        revealClue("NEILSON_6", clueList, clueBook);
    }
}
