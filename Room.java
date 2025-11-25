public class Room implements RoomRequirement{
    
    //attributes
    String location;
    int floor;
    Boolean locked;
    Boolean hasDoor;
    int activeLocation;

    public Room(String location, int floor, Boolean locked, Boolean hasDoor){
        this.location = location;
        this.floor = floor;
        this.locked = locked;
        this.hasDoor = hasDoor;
        this.activeLocation = -1;
    }

    public String getRoomLocation(){
        return this.location;
    }

    public int getRoomFloor(){
        return this.floor;
    }

    public Boolean getRoomLocked(){
        return this.locked;
    }

    public Boolean getRoomHasDoor(){
        return this.hasDoor;
    }

    public void enterRoom(){
        if (this.activeLocation == -1){
            if (locked = false){
                if (hasDoor = false){
                    this.activeLocation = 1;
                }else{
                    throw new RuntimeException("There is a door! Open it before entering...");
                }
            }else{
            throw new RuntimeException("The door is locked! You can't enter this room.");
            }
        }else{
            throw new RuntimeException("You are already in a room. Exit the room before entering a new room.");
        }
    }

    public void openDoor(){
        if (hasDoor = false){
            throw new RuntimeException("The room does not have a door!");
        }else{
            this.activeLocation = 1;
        }
    }

    public void exitRoom(){
        if (activeLocation == 1){
            this.activeLocation = -1;
        }else{
            throw new RuntimeException("You're not in the room yet.");
        }
    }

}
