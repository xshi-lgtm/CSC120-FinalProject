import java.util.Scanner;

/* The game class that run the entire program */
public class Game {

    /**
     * The method that prints the introduction to the game
     */
    private static void intro(){
        System.out.println("===================================================================");
        System.out.println("===== Welcome to the Game: Finding the 'Disappeared Roommate' =====");
        System.out.println("===================================================================");
        System.out.println("##### Game Description ##### \nAfter an intensive study day during final, you finally got back to your dorm. You're so tired that you immediately fall asleep as soon as your head touches the pillow. However, the next day when you wake up, your roommate disappears. The room is messy and it seems like she didn't go back to dorm the whole night. Go around the campus to find clues to figure out where is your roommate!");
        System.out.println("At any time, you can: ");
        System.out.println("* move with 'go dorm/gym/neilson/burton/sabin-reed/hillyer/seelye/botanic-garden/cc'");
        System.out.println("* type 'explore' to search clues at current location");
        System.out.println("* type 'clues' to see the clues you already collected in your notebook");
        System.out.println("* type 'guess' if you think you know whaere your roommate is");
        System.out.println("* type 'match' to match a new roommate");
        System.out.println("* type 'call parent' to call rommate's parent");
        System.out.println("* type 'map' to see the map of the school");
        System.out.println("* type 'help' to see all commands");
    }

    /**
     * The method that prints all the commands to the user in the console
     */
    private static void showHelp(){
        System.out.println("The available commands are: ");
        System.out.println(" * help                     - see all available commands");
        System.out.println(" * explore                  - find clues in current location (the command you have to enter everytime to search for clues)");
        System.out.println(" * go dorm                  - go to dorm in ziskind");
        System.out.println(" * go gym                   - go to ainsworth gym");
        System.out.println(" * go neilson               - go to neilson library");
        System.out.println(" * go burton                - go to burton hall");
        System.out.println(" * go sabin-reed            - go to sabin reed hall");
        System.out.println(" * go hillyer               - go to hillyer hall");
        System.out.println(" * go seelye                - go to seelye hall");
        System.out.println(" * go botanic-garden        - go to botanic garden");
        System.out.println(" * go cc                    - go to campus cafe");
        System.out.println(" * clues                    - see all collected clues");
        System.out.println(" * guess                    - guess the final key for the game");
        System.out.println(" * match                    - match new roommate");
        System.out.println(" * call parent              - find roommate's parents");
        System.out.println(" * map                      - show campus map");
        System.out.println(" * quit                     - quite the game");
        System.out.println("**************************************************");
    }

    /**
     * The method that prints the campus map to the user
     */
    private static void showMap(){
        System.out.println("The buildings on campus: ");
        System.out.println(" * dorm                  - your house ziskind");
        System.out.println(" * gym                   - reception, swimming pool, fitting room, fitness center");
        System.out.println(" * neilson               - circulation desk, printer, quiet areas");
        System.out.println(" * burton                - Professor Gorom's Office, Professor Price's Office, lanscape studio");
        System.out.println(" * sabin-reed            - Geography Lab, Statistics classroom, Linear algebra classroom");
        System.out.println(" * hillyer               - Studios and hallways, Photography darkroom, Classrooms and lounge");
        System.out.println(" * seelye                - Math classroom, Lost and Found");
        System.out.println(" * botanic-garden        - plants storage area");
        System.out.println(" * cc                    - campus cafe");
        System.out.println("***************************************************");
    }

    /**
     * The method that handles the explore command to different specific methods in child classes. 
     * @param player the player itself
     * @param in the user input
     * @param clueList the list of all clues
     * @param clueBook the clues collected by the users
     * @param ziskind_house the ziskind house instance created by ziskind house class
     * @param ainsworth_gym the ainsworth gym instance created by ainsworth gym class
     * @param neilson_library neilson library instance created by the neilson library class
     * @param burton_hall burton hall instance created by the burton hall class
     * @param sabin_reed sabin reed hall instance created by the sabin reed class
     * @param hillyer_hall hillyer hall instance created by the hillyer hall class
     * @param seelye_hall seelye hall instance created by the seelye hall class
     * @param botanic_garden the botanic garden instance created by the botanic garden class
     * @param campus_center campus center instance created by the campus center class
     */
    private static void handleExplore(Myself player, Scanner in, ClueList clueList, ClueBook clueBook, ZiskindHouse ziskind_house, Gym ainsworth_gym, NeilsonLibrary neilson_library, BurtonHall burton_hall, SabinReed sabin_reed, Hillyer hillyer_hall, Seelye seelye_hall, BotanicGarden botanic_garden, CampusCenter campus_center){
        String location = player.getCurrentLocation();
        switch(location){
            case "Ziskind House":
                ziskind_house.explore(player, in, clueList, clueBook);
                break;
            case "Ainsworth Gym and Olin Fitness Center":
                ainsworth_gym.explore(player, in, clueList, clueBook);
                break;
            case "Neilson Library":
                neilson_library.explore(player, in, clueList, clueBook);
                break;
            case "Burton Hall":
                burton_hall.explore(player, in, clueList, clueBook);
                break;
            case "Sabin-Reed Hall":
                sabin_reed.explore(player, in, clueList, clueBook);
                break;
            case "Hillyer Hall":
                hillyer_hall.explore(player, in, clueList, clueBook);
                break;
            case "Seelye Hall":
                seelye_hall.explore(player, in, clueList, clueBook);
                break;
            case "Botanic Garden":
                botanic_garden.explore(player, in, clueList, clueBook);
                break;
            case "Campus Center":
                campus_center.explore(player, in, clueList, clueBook);
                break;
            default:
                System.out.println("You're lost at Smith College. Try to go back to dorm first...");
        }
    }

    /**
     * the method that handles users' guesses
     * @param player players themselves
     * @param in the user input
     * @return true if the player guessed the right answer, false otherwise
     */
    private static boolean handleGuess(Myself player, Scanner in){
        System.out.println("Where do you think your roommate is? ");
        String answer = in.nextLine().trim().toLowerCase();
        if (answer.contains("china")){
            System.out.println("You guessed: China");
            System.out.println("Your phone buzzed: message from roommate");
            System.out.println("\'Hey! I rushed to airport so I didn't tell you yet. I was on the plane to China yesterday and am now taking a connecting fly in Qatar. I'll talk to you later!\'");
            System.out.println("=== Good Ending: You figured out that your roommate is going back home in China. ===");
            return true;
        }else{
            System.out.println("That doesn't seem right. Keep finding clues!!");
            return false;
        }
    }

    /**
     * the method that handles users' matching new roommate request
     * @param player the player themselves
     */
    private static void handleMatchNewRoommate(Myself player){
        System.out.println("You opened Smith Portal, residence life self service, and fill out the form requesting for new roommate.");
        System.out.println("You soon get a new roommate and live together happily.");
        System.out.println("Unfortunately, your roommate comes back in a few days, saying that she had some family emergency and went back to China.");
        System.out.println("However, she doesn't have places to live because you already had another roommate. Feeling extremely angry, she left the room. ");
        System.out.println("=== Bad Ending: you make your roommate angry. ===");
    }

    /**
     * the method that handles users' call parent request
     * @param player player themselves
     */
    private static void handleCallParent(Myself player){
        if(player.hasCalledParent()){
            System.out.println("You already called her parents before.");
            return;
        }
        player.setCalledParent();
        System.out.println("You called your roommate's parents");
        System.out.println("They said 'Oh, we have some family emergency so we asked her to travel back to China for a while. We thought she told you already. Don't worry!'");
    }
    
    /**
     * main that runs the entire program
     */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ClueList clueList = new ClueList();
        ClueBook clueBook = new ClueBook();
        BotanicGarden botanic_garden = new BotanicGarden("Botanic Garden", "16 College Ln, Northampton, MA 01063", 1);
        BurtonHall burton_hall = new BurtonHall("Burton Hall", "46 College Ln, Northampton, MA 01063", 4);
        CampusCenter campus_center = new CampusCenter("Campus Center", "100 Elm St, Northampton, MA 01063", 1);
        Gym ainsworth_gym = new Gym("Ainsworth Gym and Olin Fitness Center", "102 Lower College Ln, Northampton, MA 01060", 3);
        Hillyer hillyer_hall = new Hillyer("Hillyer Hall", "22 Elm St, Northampton, MA 01063", 3);
        NeilsonLibrary neilson_library = new NeilsonLibrary("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 3);
        SabinReed sabin_reed = new SabinReed("Sabin-Reed Hall", "44 College Ln, Northampton, MA 01063", 3);
        Seelye seelye_hall = new Seelye("Seelye Hall", "2 Seelye Dr #1, Northampton, MA 01060", 2);
        ZiskindHouse ziskind_house = new ZiskindHouse("Ziskind House", "1 Henshaw Ave, Northampton, MA 01063", 3);

        intro();
        Boolean running = true;

        System.out.println("Enter user information to play");
        System.out.println("User name: ");
        String user_name = in.nextLine().trim();

        System.out.println("-----------------------------------------------------");
        System.out.println("---------------- Let's start ........ ---------------");
        System.out.println("-----------------------------------------------------");

        Myself player = new Myself(user_name, "Ziskind House");
        System.out.println("You have initialized yourself in the game...");
        System.out.println("Hello, " + user_name + ". You're currently at " + player.getPeopleLocation().toUpperCase());
        
        while (running && !player.isGameOver()){
            System.out.println("Enter a command (type 'help' for options)");
            String choice1 = in.nextLine().trim().toLowerCase();

            switch(choice1){
                case "help":
                    showHelp();
                    break;
                case "map":
                    showMap();
                    break;
                case "clues":
                    clueBook.showClues();
                    break;
                case "go dorm":
                    player.setCurrentLocation("Ziskind House");
                    System.out.println("Walking back to dorm at Ziskind House... ");
                    break;
                case "go gym":
                    player.setCurrentLocation("Ainsworth Gym and Olin Fitness Center");
                    System.out.println("Walking to Ainsworth Gym... ");
                    break;
                case "go neilson":
                    player.setCurrentLocation("Neilson Library");
                    System.out.println("Walking to Neilson Library... ");
                    break;
                case "go burton":
                    player.setCurrentLocation("Burton Hall");
                    System.out.println("Walking to Burton Hall... ");
                    break;
                case "go sabin-reed":
                    player.setCurrentLocation("Sabin-Reed Hall");
                    System.out.println("Walking to Sabin-Reed Hall... ");
                    break;
                case "go hillyer":
                    player.setCurrentLocation("Hillyer Hall");
                    System.out.println("Walking to Hillyer Hall... ");
                    break;
                case "go seelye":
                    player.setCurrentLocation("Seelye Hall");
                    System.out.println("Walking to Seelye Hall... ");
                    break;
                case "go botanic-garden":
                    player.setCurrentLocation("Botanic Garden");
                    System.out.println("Walking to Botanic Garden... ");
                    break;
                case "go cc":
                    player.setCurrentLocation("Campus Center");
                    System.out.println("Walking to Campus Center... ");
                    break;
                case "explore":
                    handleExplore(player, in, clueList, clueBook, ziskind_house, ainsworth_gym, neilson_library, burton_hall, sabin_reed, hillyer_hall, seelye_hall, botanic_garden, campus_center);
                    break;
                case "guess":
                    if(handleGuess(player, in)){
                        running = false;
                        break;
                    }else{
                        break;
                    }
                case "match":
                    handleMatchNewRoommate(player);
                    break;
                case "call parent":
                    handleCallParent(player);
                    break;
                case "quit":
                    running = false;
                    System.out.println("You failed to find roommmate. Your roommate is gone forever :(");
                    break;
                default:
                    System.out.println("Unclear command. Try to type 'help' to see all available commands");
            }
        }

        System.out.println("=============== Game End. Thanks for playing! ================");
        System.out.println("===== Hope your roommate will not disappear in real life =====");
        System.out.println("==============================================================");
        in.close();

    }
}
