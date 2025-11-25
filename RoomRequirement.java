public interface RoomRequirement {
    String getRoomLocation();
    int getRoomFloor();
    Boolean getRoomLocked();
    Boolean getRoomHasDoor();
    void enterRoom();
    void openDoor();
    void exitRoom();
}
