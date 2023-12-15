package Humans;

import Actions.Naming;

public class People implements Naming {
    private String name;

    public People(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }

    public String toName(Object obj, String description){
        return name + " called " + obj + " " + description;
    }
}
