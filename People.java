public class People{

    // attributes
    String name;
    int age; 
    String major;
    int classYear;
    String location;

    public People(String name, String location){
        this.name = name;
        this.location = location;
    }

    public String getPeopleName(){
        return this.name;
    }

    public String getPeopleLocation(){
        return this.location;
    }

}