/* The people class that creates people in the game */
public class People{

    // attributes
    String name;
    String location;

    /**
     * Constructor for people
     * @param name the name of people in the game
     * @param location the location of people in the game
     */
    public People(String name, String location){
        this.name = name;
        this.location = location;
    }

    /**
     * the accessor for people's name
     * @return people's name
     */
    public String getPeopleName(){
        return this.name;
    }

    /**
     * The accessor for people's location
     * @return the people's location
     */
    public String getPeopleLocation(){
        return this.location;
    }

}