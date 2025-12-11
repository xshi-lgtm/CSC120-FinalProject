import java.util.Scanner;

public class BotanicGarden extends Building{

    private String[] pathWays = {"forward", "left", "forward", "right"};

    public BotanicGarden(String name, String address, int nFloors){
        super(name, address, nFloors);
    }

    public void explore(Myself player, Scanner in, ClueList clueList, ClueBook clueBook){
        System.out.println("--- Welcome to Botanic Garden! ---");
        System.out.println("Here is a small storage area maze to get to the plant storage area where you can meet your roommate's botanic classmate.");
        System.out.println("Move with commands: \n * forward \n * left \n * right \n * go down");
        int index = 0;
        Boolean finished = false;
        while (!finished){
            System.out.println("Your move (forward/left/right/go down or quit): ");
            String move = in.nextLine().trim().toLowerCase();
            if (move.equals("quit")){
                System.out.println("Oh no, you decide to give up the maze right now. Come back if you want...");
                return;
            }
            if(move.equals(pathWays[index])){
                index++;
                System.out.println("You move " + move + ".");
                if (index == pathWays.length){
                    finished = true;
                }
            }else{
                System.out.println("Dead end. Starting over again from entrance. Good luck!");
                index = 0;
            }
        }
        System.out.println("Congratulations, you reached the plant storage area and met your roommate's classmate!");
        revealClue("BotanicGarden_1", clueList, clueBook);
    }

    public void revealClue(String code, ClueList clueList, ClueBook clueBook){
        Clue c = clueList.getClueByCode(code);
        if (c == null){
            System.out.println("[No such clue" + code + "]");
            return;
        }
        if (c.isClueFound()){
            System.out.println("You've already checked this place.");
        } else {
            System.out.println("The classmate tells you: ");
            System.out.println(c.getClueDescription());
            c.markClueFound();
            clueBook.addClue(c);
        }
    }
}