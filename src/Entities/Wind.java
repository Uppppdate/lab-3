package Entities;

import Actions.Able_To_Force;
import Actions.Blowing;
import Actions.Rustling;
import Humans.Feelings;
import Humans.Human;
import Humans.Luis;
import Objects.Trees;

public class Wind implements Blowing, Rustling, Able_To_Force {
    private String name;
    public Wind(String name){
        this.name=name;
    }
    public String toBlow(){
        return name + " blew harder\n";
    }

    public String toRustle(Trees obj) {
        return name + " rustled among the "+obj+"\n";
    }
    public String toForce(Human human){
        if(human instanceof Luis){
            return name + " forced " + human.getName() + " to" + ((Luis)human).toLookBehind(Feelings.ANXIETY);
        }
        else{
            return null;
        }
    }
}
