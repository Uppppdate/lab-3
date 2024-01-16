package Entities;

import Interfaces.Able_To_Force;
import Interfaces.Blowing;
import Interfaces.Rustling;
import Humans.ViewDirections;
import Humans.Feelings;
import Humans.Human;
import Humans.Luis;
import Objects.Trees;
import java.lang.Math;

public class Wind implements Blowing, Rustling, Able_To_Force {

    private int strength;
    private String name;
    public Wind(String name){
        this.name=name;
        setStrength();
    }
    private void setStrength() {
        this.strength=(int)(Math.random() * ((10) + 1));
    }
    public String toBlow(){
        if(strength>=0&strength<=3){
            return name + " blew lightly\n";
        }
        if (strength>3&strength<=6){
            return name + " blew normally\n";
        }
        if (strength>6&strength<=10) {

            return name + " blew harder\n";
        }
        return null;
    }

    public String toRustle(Trees obj) {
        return name + " rustled among the "+obj+"\n";
    }
    public String toForce(Human human){
        if(human instanceof Luis){
            ((Luis)human).setFeelings(Feelings.ANXIETY);
            return name + " forced " + human.getName() + " to" + ((Luis)human).toLook(null, ViewDirections.BEHIND);
        }
        else{
            return null;
        }
    }
}
