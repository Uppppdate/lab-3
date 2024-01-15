package Entities;

import Actions.Able_To_Force;
import Actions.Blowing;
import Actions.Rustling;
import Humans.ViewDirections;
import Humans.Feelings;
import Humans.Human;
import Humans.Luis;
import Objects.Trees;
import java.lang.Math;

public class Wind implements Blowing, Rustling, Able_To_Force {

    private int strenght;
    private String name;
    public Wind(String name){
        this.name=name;
        setStrenght();
    }
    private void setStrenght() {
        this.strenght=(int)(Math.random() * ((10) + 1));
    }
    public String toBlow(){
        if(strenght>=0&strenght<=3){
            return name + " blew lightly\n";
        }
        if (strenght>3&strenght<=6){
            return name + " blew normally\n";
        }
        if (strenght>6&strenght<=10) {

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
