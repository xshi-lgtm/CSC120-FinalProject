import java.util.Scanner;

public class CampusCenter extends Building{
    
    public CampusCenter(String name, String address, int nFloors, Boolean hasElevator){
        super(name, address, nFloors, hasElevator);    
    }

    public void explore(Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("--- Welcome to Campus Center! ---");
        System.out.println("Here, you can:");
        System.out.println("1. Order some food or coffee.");
        System.out.println("2. Sit for a while.");
        System.out.println("3. Just walk around. ");
        System.out.println("Choose 1-3: ");
        String choice1 = in.nextLine().trim();
        if ("1".equals(choice1) || "2".equals(choice1)){
            System.out.println("Your friend Shally then comes in. ");
            boolean talking = true;
            while (talking){
                System.out.println("You can say: ");
                System.out.println("1. \"Hey Shally, how are you?\"");
                System.out.println("2. \"Have you seen my roomate anywhere?\"");
                System.out.println("3. \"Enjoy your day, bye ~~\"");
                System.out.println("Choose 1-3: ");
                String choice2 = in.nextLine().trim();
                switch (choice2){
                    case "1":
                        revealClue("CC_1", clueList, clueBook);
                        break;

                    case "2":
                        revealClue("CC_1", clueList, clueBook);
                        talking = false;
                        break;
                    case "3":
                        talking = false;
                        break;
                    default:
                        System.out.println("Shally is not sure what you mean.");
                }
            }
        }else{
            System.out.println("You circled the CC for 30 minutes, feeling tired, and left. ");
        }
    }

    // private void revealClue(String code, ClueList clueList, ClueBook clueBook){
    //     Clue c = clueList.getClueByCode(code);
    //     if (c == null){
    //         System.out.println("No such clue in the inventory.");
    //         return;
    //     }
    //     if (c.isClueFound()){
    //         System.out.println("Nothing new.");
    //     }else{
    //         System.out.println("Congratulations🎉~ You found a new clue...");
    //         System.out.println(c.getClueDescription());
    //         c.markClueFound();
    //         clueBook.addClue(c);
    //     }
    // }

}
