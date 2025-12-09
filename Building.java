public class Building implements BuildingRequirement{
    
    //attributes 
    protected String name;
    protected String address;
    protected int nFloors;
    protected Boolean hasElevator;
    protected int activeFloor; 

    public Building(String name, String address, int nFloors, Boolean hasElevator){
        this.name = name;
        this.address = address;
        this.nFloors = nFloors;
        this.hasElevator = hasElevator;
        this.activeFloor = -1;
    }

    public String getBuildingName(){
        return this.name;
    }

    public String getBuildingAddress(){
        return this.address;
    }

    public int getBuildingFloors(){
        return this.nFloors;
    }

    public Boolean hasElevator(){
        return this.hasElevator;
    }

    public int getBuildingCurrentFloor(){
        return this.activeFloor;
    }

    public void enterBuilding(){
        if(this.activeFloor == 1){
            throw new RuntimeException("You're already in the building.");
        }else{
            this.activeFloor = 1;
        }
    }

    public void exitBuilding(){
        if(this.activeFloor == 1){
            this.activeFloor = -1;
        }else{
            throw new RuntimeException("You've fallen out of the window!");
        }
    }

    public void goUp(){
        if (this.activeFloor != -1 ){
            if(this.activeFloor == this.nFloors){
                throw new RuntimeException("You're already on the highest floor.");
            }else{
                this.activeFloor += 1;
            }
        }else{
            throw new RuntimeException("You're not in the building yet! Enter the building first...");
        }
    }

    public void goDown(){
        if (this.activeFloor != -1){
            if(this.activeFloor == 1){
                throw new RuntimeException("You are on the ground floor now. Can't go down!");
            }else{
                this.activeFloor -= 1;
            }
        }else{
            throw new RuntimeException("You're not in the building yet! Enter the building first...");
        }
    }

    public void goToFloor(int floorNum, Boolean hasElevator){
        if (activeFloor == -1){
            throw new RuntimeException("You're not in the building yet! Enter the building first...");
        }
        if (floorNum <= nFloors && floorNum > 0){
            if (hasElevator){
                this.activeFloor = floorNum;
            }else{
                if (Math.abs(floorNum - this.activeFloor) == 1){
                    this.activeFloor = floorNum;
                }else{
                    throw new RuntimeException("You can not jump");
                }
            }
        }else{
        throw new RuntimeException("You can't go outside the building.");
        }
    }

    public void showOptions(){
        System.out.println("Available options at" + this.name + ":\n + enterBuilding \n + exitBuilding \n + goUp \n + goDown \n + goToFloor \n + showOptions");
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
            System.out.println(c.getClueDescription());
            c.markClueFound();
            clueBook.addClue(c);
        }
    }

}
