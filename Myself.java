/* The Myself class that stores key info and it is inherited from People class */
public class Myself extends People{

    // attributes
    private String currentLocation;
    private boolean gameOver;
    private boolean matchedNewRoommate;
    private boolean calledParent;

    /**
     * The constructor for myself that stores user's current location and user choices
     * @param name the name of user
     * @param location the location user currently is at
     */
    public Myself(String name, String location){
        super(name, location);
        this.currentLocation = location;
        this.gameOver = false;
        this.matchedNewRoommate = false;
        this.calledParent = false;
    }

    /**
     * The accessor for user's current location
     * @return the location the user is currently at
     */
    public String getCurrentLocation(){
        return currentLocation;
    }

    /**
     * The method to set user location
     * @param loc the updated location of user 
     */
    public void setCurrentLocation(String loc){
        this.currentLocation = loc;
    }

    /**
     * The method to set game over
     * @return true if the game is over and false otherwise
     */
    public boolean isGameOver(){
        return gameOver;
    }

    /**
     * the method to mark game as over
     */
    public void endGame(){
        this.gameOver = true;
    }

    /**
     * The method to set matching roommate as true if user chooses the corresponding option
     */
    public void setMatchedNewRoommate(){
        this.matchedNewRoommate = true;
    }

    /**
     * The method that checks if the user already choosed to match a new roommate
     * @return true if there is already a new roommate matched, false otherwise
     */
    public boolean hasMatchedNewRoommate(){
        return matchedNewRoommate;
    }

    /**
     * The method that checks if the user already called the parent
     * @return true if the user already choosed to call the parent
     */
    public boolean hasCalledParent(){
        return calledParent;
    }

    /**
     * the method that sets called parent boolean as true if the user already choosed to call the roommates' parent
     */
    public void setCalledParent(){
        this.calledParent = true;
    }

}