import java.util.ArrayList;
import java.util.List;

public class ClueBook {

    private List<Clue> foundClues;
    
    public ClueBook(){
        this.foundClues = new ArrayList<>();
    }

    public void addClue(Clue clue){
        if(clue != null){
            if(!foundClues.contains(clue)){
                foundClues.add(clue);
                System.out.println("You've got a new clue in your notebook!");
            }

        }
    }

    public void showClues(){
        if(foundClues.isEmpty()){
            System.out.println("Your notebook is empty. You haven't found any clues yet, find clues first! ");
            return;
        }
        System.out.println("=== Your fantastic Clue Notebook ===");
        int i=1;
        for (Clue c: foundClues){
            System.out.println(i + ". " + c.getClueDescription());
            i ++ ;
        }
        System.out.println("====================================");
    }
    
}
