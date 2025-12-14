/* The Clue class that constructs all the clues */
public class Clue {

    // attributes
    private String code;
    private String description;
    private boolean found;

    /**
     * Constructs the clues
     * @param code the code for the clues
     * @param description the description of the clues
     */
    public Clue(String code, String description) {
        this.code = code;
        this.description = description;
        this.found = false;
    }

    /**
     * the accessor for the clue by code
     * @return the code of the clue in string
     */
    public String getClueCode(){
        return code; 
    }

    /**
     * the accessor for the clue's description
     * @return the description of the clue
     */
    public String getClueDescription(){
        return description; 
    }

    /**
     * the accessor for whether the clue is found
     * @return whether the clue is found or not
     */
    public boolean isClueFound(){ 
        return found; 
    }

    /**
     * the manipulator to mark the clue as found once the clue is found
     */
    public void markClueFound(){
        this.found = true; 
    }
}