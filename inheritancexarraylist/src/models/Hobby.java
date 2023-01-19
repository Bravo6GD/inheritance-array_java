package models;

public class Hobby extends Parent {
    String hobbies;

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hobby(String hobbies, String type) {
        this.hobbies = hobbies;
        this.type = type;
    }

    String type;
}

