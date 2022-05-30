package pojos;

import javax.persistence.*;

public class Target {

    private int id;
    private String name;
    private String birth;
    private String bountry;
    private String nationality;
    private String wanted_for;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getBountry() {
        return bountry;
    }

    public void setBountry(String bountry) {
        this.bountry = bountry;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getWanted_for() {
        return wanted_for;
    }

    public void setWanted_for(String wanted_for) {
        this.wanted_for = wanted_for;
    }
}
