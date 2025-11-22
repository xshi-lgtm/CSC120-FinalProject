public interface BuildingRequirement {
    String getBuildingName();
    String getBuildingAddress();
    int getBuildingFloors();
    Boolean hasElevator();
    int getBuildingCurrentFloor();
    void enterBuilding();
    void exitBuilding();
    void goUp();
    void goDown();
    void goToFloor(int floorNum, Boolean hasElevator);
    void showOptions();
}
