public class People implements PeopleRequirement{

    // attributes
    String name;
    int age; 
    String major;
    int classYear;
    String location;

    public People(String name, int age, String major, int classYear, String location){
        this.name = name;
        this.age = age;
        this.major = major;
        this.classYear = classYear;
        this.location = location;
    }

    public String getPeopleName(){
        return this.name;
    }

    public int getPeopleAge(){
        return this.age;
    }

    public String getPeopleMajor(){
        return this.major;
    }

    public int getPeopleClassYear(){
        return this.classYear;
    }

    public String getPeopleLocation(){
        return this.location;
    }

}