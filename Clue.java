public class Clue {
    private String code;
    private String description;
    private boolean found;

    public Clue(String code, String description) {
        this.code = code;
        this.description = description;
        this.found = false;
    }

    public String getClueCode(){
        return code; 
    }

    public String getClueDescription(){
        return description; 
    }

    public boolean isClueFound(){ 
        return found; 
    }

    public void markClueFound(){
        this.found = true; 
    }
}