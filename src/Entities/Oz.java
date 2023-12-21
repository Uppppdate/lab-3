package Entities;

public class Oz {
    private String name;

    public Oz(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
