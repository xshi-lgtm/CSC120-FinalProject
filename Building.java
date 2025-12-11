public class Building{
    
    //attributes 
    protected String name;
    protected String address;
    protected int nFloors;

    public Building(String name, String address, int nFloors){
        this.name = name;
        this.address = address;
        this.nFloors = nFloors;
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
            System.out.println("You find a clue:");
            System.out.println("# " + c.getClueDescription() + " #");
            c.markClueFound();
            clueBook.addClue(c);
            System.out.println("--------------------------------------");
        }
    }

}
