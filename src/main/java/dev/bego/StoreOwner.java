package dev.bego;

public class StoreOwner {

    private String name;
    private int birthYear;
    private String id;

    public StoreOwner(String name, int birthYear, String id) {
        this.name = name;
        this.birthYear = birthYear;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
