package Entities.Concrete;

public class PersonalUser  {

    private String name;
    private String lasName;

    public PersonalUser()  {

    }

    public PersonalUser(String name, String lasName) {
        this.name = name;
        this.lasName = lasName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lasName;
    }

    public void setLastName(String lasName) {
        this.lasName = lasName;
    }
}
