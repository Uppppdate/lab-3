package Entities;

import Actions.Able_To_Force;
import Actions.Blowing;
import Actions.Rustling;
import Humans.Human;

public class Wind implements Blowing, Rustling, Able_To_Force {
    private String name;
    public Wind(String name){
        this.name=name;
    }
    public String toBlow(){
        return name + " blew harder\n";
    }

    public String toRustle() {
        return name + " rustled among the trees\n";
    }
    public String toForce(Human human){
        return name + " forced " + human.getName() + " to do next action\n";
    }
}
