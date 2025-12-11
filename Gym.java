import java.util.Scanner;

public class Gym extends Building{

    public Gym(String name, String address, int nFloors) {
        super(name, address, nFloors);
    }

    public void explore (Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("--- Welcome to Gym! ---");
        System.out.println("There are 3 floors in Gym: ");
        System.out.println("1. Reception ");
        System.out.println("2. Fitting room and swimming pool ");
        System.out.println("3. Fitness center ");
        System.out.println("Choose 1-3: ");

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
            default:
                System.out.println("You are not sure which floor you want to go to, so you stayed at the entrance. ");
        }
    }

    private void exploreReception(Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("You're now at the reception desk, you can: ");
        System.out.println("1. Ask the student worker at the reception about your roommate ");
        System.out.println("2. Look around ");
        System.out.println("Choose 1-2 ");
        String choice2 = in.nextLine().trim();
        switch(choice2){
            case "1":
                revealClue("GYM_1", clueList, clueBook);
                break;
            case "2":
                System.out.println("Unfortunately, you found nothing.");
                break;
            default:
                System.out.println("Nothing special here...");
        }
    }

    private void explorePool(Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("You're now in front of the fitting room of the swimming pool, you can: ");
        System.out.println("1. Check the fitting room ");
        System.out.println("2. Check the swimming");
        System.out.println("Choose 1-2 ");
        String choice3 = in.nextLine().trim();
        switch(choice3){
            case "1":
                revealClue("GYM_2", clueList, clueBook);
                break;
            case "2":
                revealClue("GYM_3", clueList, clueBook);
                break;
            default:
                System.out.println("You hesitate and go back. ");
        }
    }

    private void exploreFitnessCenter(Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("You're now in the fitness center, you can: ");
        System.out.println("1. Work out on the elliptical machine for 30 minutes. ");
        System.out.println("2. Look around");
        System.out.println("Choose 1-2 ");
        String choice4 = in.nextLine().trim();
        switch(choice4){
            case "1":
                gymFriendConversation(in, clueList, clueBook);
                break;
            case "2":
                System.out.println("You looked around and found nothing special. Wearing a huge coat, you felt embarassed wandering around in the gym...");
                break;
            default:
                System.out.println("You hesitate and go back. ");
        }
    }

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
