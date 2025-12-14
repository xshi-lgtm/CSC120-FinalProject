import java.util.ArrayList;
import java.util.List;

/* The clue book that stores all the clues user found */
public class ClueBook {

    // attributes 
    private List<Clue> foundClues;
    
    /**
     * constructor for cluebook that initializes an empty arraylist
     */
    public ClueBook(){
        this.foundClues = new ArrayList<>();
    }

    /**
     * The method that adds clue to the clue book when clues are found
     * @param clue the clue that needs to be added to the clue book
     */
    public void addClue(Clue clue){
        if(clue != null){
            if(!foundClues.contains(clue)){
                foundClues.add(clue);
                System.out.println("You've got a new clue in your notebook!");
            }

        }
    }

    /**
     * the method that shows the clues collected by the user in the console
     */
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
