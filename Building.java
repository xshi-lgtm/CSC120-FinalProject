/* the parent class of buildings */
public class Building{
    
    //attributes
    protected String name;
    protected String address;
    protected int nFloors;

    /**
     * Constructor for building class
     * @param name the name of the building
     * @param address the address of the building
     * @param nFloors the number of floors in the building
     */
    public Building(String name, String address, int nFloors){
        this.name = name;
        this.address = address;
        this.nFloors = nFloors;
    }

    /**
     * Method to reveal the formatted clues in each building
     * @param code the code to call the responding clue
     * @param clueList the list of all clues
     * @param clueBook the list of clues players already collected
     */
    public void revealClue(String code, ClueList clueList, ClueBook clueBook){
        Clue c = clueList.getClueByCode(code);
        if (c == null){
            System.out.println("[No such clue" + code + "]");
            return;
        }
        if (c.isClueFound()){
            System.out.println("You've already checked this place.");
        } else {
            System.out.println("You find a clue:");
            System.out.println("# " + c.getClueDescription() + " #");
            c.markClueFound();
            clueBook.addClue(c);
            System.out.println("--------------------------------------");
        }
    }

}
