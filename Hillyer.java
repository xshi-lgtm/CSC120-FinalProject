import java.util.Scanner;

public class Hillyer extends Building{
    
    public Hillyer(String name, String address, int nFloors){
        super(name, address, nFloors);
    }

    public void explore(Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("--- Welcome to Hillyer! ---");
        System.out.println("There are 3 floors in Hillyer: ");
        System.out.println("1. Studios and hallways ");
        System.out.println("2. Photography darkroom (special access required) ");
        System.out.println("3. Classrooms and lounge ");
        System.out.println("Choose the floor you want to go to (1-3): ");

        String choice1 = in.nextLine().trim();

        switch(choice1) {
            case "1":
                System.out.println("Nothing special here on the first floor");
                break;
            case "2":
                exploreDarkroom(in, clueList, clueBook);
                break;
            case "3":
                exploreThirdFloor(in, clueList, clueBook);
                break;
            default:
                System.out.println("You get confused and decided to leave the building.");
        }

    }

    private void exploreDarkroom(Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("The darkroom door is locked. ");
        System.out.println("Knock? (yes/no): ");
        String choice2 = in.nextLine().trim().toLowerCase();
        if(!choice2.equals("yes")){
            System.out.println("You decided not to bother anyone. ");
            return;
        }
        System.out.println("Your friend Amy who's taking photography class opens the door for you.");
        Boolean talking = true;
        while(talking){
            System.out.println("Talking to Amy! You can say: ");
            System.out.println("1. Hey, how's your photography project?");
            System.out.println("2. Do you know where my roommate is? (they're friends as well)");
            System.out.println("3. Sorry for bothering. ");
            System.out.print("Choose 1-3: ");
            String choice3 = in.nextLine().trim();
            switch(choice3){
                case "1":
                    System.out.println("Amy: It's going pretty well. Thanks for asking. I'm going to work on it now, bye!");
                    talking = false;
                    break;
                case "2":
                    revealClue("HILLYER_1", clueList, clueBook);
                    talking = false;
                    break;
                case "3":
                    System.out.println("Amy: No worries, I'm taking a rest right now.");
                    break;
                default:
                    System.out.println("Amy: I'm not sure what you mean");
            }
        }
    }

    private void exploreThirdFloor(Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("On the third floor lounge, you run into Emily.");
        Boolean talking = true;
        while(talking){
            System.out.println("Talk to Emily! You can say: ");
            System.out.println("1. Hey, Emily, why are you here?");
            System.out.println("2. Have you heard anything about my roommate?");
            System.out.println("3. Hi, Emily. I'm busy right now. See you later! ");
            System.out.print("Choose 1-3: ");
            String choice4 = in.nextLine().trim();
            switch(choice4){
                case "1":
                    System.out.println("Emily: I'm doing my calculus homework here. I found this place helping me stay concentrated. ");
                    break;
                case "2":
                    revealClue("HILLYER_2", clueList, clueBook);
                    talking = false;
                    break;
                case "3":
                    System.out.println("Emily: See ya!");
                    break;
                default:
                    System.out.println("Emily: I don't really understand what you're saying. ");
            }
        }
    }
}
