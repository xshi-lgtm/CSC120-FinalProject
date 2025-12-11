import java.util.Scanner;

public class BurtonHall extends Building{

    public BurtonHall(String name, String address, int nFloors){
        super(name, address, nFloors);
    }

    public void explore(Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("--- Welcome to Burton Hall! ---");
        System.out.println("There are four floors in Burton:");
        System.out.println("1. Restroom ");
        System.out.println("2. Professor Gorom's Office");
        System.out.println("3. Professor Price's Office");
        System.out.println("4. Lanscape studio");
        System.out.println("Choose 1-4: ");
        String choice1 = in.nextLine().trim();
        if ("1".equals(choice1) || "2".equals(choice1) || "3".equals(choice1)){
            System.out.println("It seems super quiet and empty here. Go to another floor to find more clues. ");
            return;
        }
        if ("4".equals(choice1)){
            System.out.println("You arrive at the 4th floor landscape studio. The door requires special OneCard access.");
            System.out.println("Here are several options: ");
            System.out.println("1. Try your own OneCard ");
            System.out.println("2. Call classmate Jane ");
            System.out.println("3. Knock the door");
            System.out.println("4. Go back");
            System.out.println("Choose 1-4: ");
            String choice2 = in.nextLine().trim();
            Boolean enterStudio = false;
            switch(choice2){
                case "1":
                    System.out.println("You don't have access to the lanscape studio.");
                    enterStudio = false;
                    break;
                case "2":
                    System.out.println("Jane respond to your phone call: \"I'm at the studio right now, I'll come and get you!\"");
                    enterStudio = true;
                    break;
                case "3": 
                    System.out.println("Your friend Jane is in the studio: \"On hey, come in!\"");
                    enterStudio = true;
                    break;
                case "4": 
                    System.out.println("You give up and go downstairs");
                    enterStudio = false;
                    break;
                default:
                    System.out.println("Not sure what you mean. Select a valid option.");
            }
            while(enterStudio){
            System.out.println("Now you've entered the lanscape studio, you can:");
            System.out.println("1. Look at professor's desk");
            System.out.println("2. Check your roommate's desk");
            System.out.println("3. Look around the studio");
            System.out.println("4. Email the professor and ask about your roommate");
            System.out.println("5. Leave the studio");
            System.out.println("Choose 1-5: ");
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
                    enterStudio = false;
                    break;
                default:
                    System.out.println("Jane doesn't understand what you're talking.");
            }
        }
        }
    }

    private void emailProfessor(Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("You open your laptop and write an email to the landscape professor.");
        System.out.println("You: \"Hi Professor, I havn't seen my roommate. Do you know where she is?\'");
        System.out.println("Professor replies:\"She emailed me saying she has a family situation and will miss class.\"");
        System.out.println("[You learn that your roommate said she has family reasons.]");
        System.out.println("You suddenly think: maybe her parents know more...");
    }

}


