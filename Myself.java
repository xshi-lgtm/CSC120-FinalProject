public class Myself extends People{

    private String currentLocation;
    private boolean gameOver;
    private boolean matchedNewRoommate;
    private boolean calledParent;

    public Myself(String name, String location){
        super(name, location);
        this.currentLocation = location;
        this.gameOver = false;
        this.matchedNewRoommate = false;
        this.calledParent = false;
    }

    public String getCurrentLocation(){
        return currentLocation;
    }

    public void setCurrentLocation(String loc){
        this.currentLocation = loc;
    }

    public boolean isGameOver(){
        return gameOver;
    }

    public void endGame(){
        this.gameOver = true;
    }

    public void setMatchedNewRoommate(){
        this.matchedNewRoommate = true;
    }

    public boolean hasMatchedNewRoommate(){
        return matchedNewRoommate;
    }

    public boolean hasCalledParent(){
        return calledParent;
    }

    public void setCalledParent(){
        this.calledParent = true;
    }

}