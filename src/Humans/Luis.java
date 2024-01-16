package Humans;

import Interfaces.*;
import Coordinates.*;
import Entities.AgesOfGod;
import Entities.God;
import Moving.Moving;
import Moving.WayChecking;
import Objects.Exit;
import Objects.Items.Items;
import Objects.Pit;
import Moving.Waiting;

public class Luis extends Human implements Tieing, Going, Looking, Trembling, Able_To_Hope, Able_To_Know {
    private Feelings feelings = Feelings.NORMAL;
    private Coordinates coordinates;
    public Memory memory;
    public Luis(Names name, int x, int y){
        super(name);
        memory = new Memory("Memory");
        coordinates = Map.setCoordinatesOfObject(this, x, y);
    }
    public void setFeelings(Feelings feelings) {
        this.feelings = feelings;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void toTie(Items... items){
        System.out.printf("%s tied ", name);
        for (Items i: items){
            System.out.print(i+", ");
            i.setIsTied(true);
        }
        System.out.println();
    }
    public String toGo(Object object){
        switch (WayChecking.checkWay(object)){
            case 1:
                Map.viewMap();
                Waiting.waitInSec(1);
                for (int steps = 0; steps<2; steps++) {
                    Map.mapUpdate(this, MapOptions.DELETE);
                    Moving.makeStep(this.getCoordinates(), 0, 1 + steps);
                    Map.mapUpdate(this, MapOptions.UPDATE);
                    Map.viewMap();
                    Waiting.waitInSec(1);
                }
                break;
            case 2:
                Map.viewMap();
                Waiting.waitInSec(1);
                for (int steps = 0; steps<2; steps++) {
                    Map.mapUpdate(this, MapOptions.DELETE);
                    Moving.makeStep(this.getCoordinates(), 1 + steps, 2);
                    Map.mapUpdate(this, MapOptions.UPDATE);
                    Map.viewMap();
                    Waiting.waitInSec(1);
                }
                break;
            case 3:
                    Map.viewMap();
                    Waiting.waitInSec(1);
                for (int steps = 0; steps<2; steps++) {
                    Map.mapUpdate(this, MapOptions.DELETE);
                    Moving.makeStep(this.getCoordinates(), 3 + steps, 2);
                    Map.mapUpdate(this, MapOptions.UPDATE);
                    Map.viewMap();
                    Waiting.waitInSec(1);
                }
                break;
        }
        return "";
    }

    public String toLook(Object obj, ViewDirections directions) {
        if (directions == ViewDirections.STRAIGHT) {
            if (feelings == Feelings.HYPNOTIZED) {
                return name + " looked at " + obj + " as if " + feelings.getName() + "\n";
            }
            if (obj instanceof Pit){
                if (!((Pit)obj).isEmpty()) {
                this.feelings = Feelings.HYPNOTIZED;
                return name + " looked at " + obj + toTremble();
                }
                else {
                    this.feelings = Feelings.NORMAL;
                    return name + " looked at " + obj;
                }
            }
            else return name + " looked at " + obj + "\n\n";
        }
        if (directions == ViewDirections.BEHIND){
            if (feelings == Feelings.NORMAL)
                return " look back \n";
            if (feelings == Feelings.HYPNOTIZED)
                return " look back as if he was " + feelings.getName() + "\n";
            if (feelings == Feelings.ANXIETY)
                return " look back with " + feelings.getName() + "\n";
            return null;
        }
        if (directions== ViewDirections.AWAY){
            feelings=Feelings.NORMAL;
            return "finally " + name + " looked away with a slight sigh\n\n";
        }
        return null;
    }
    public String toSay(String description, God god1, God god2){
        if (god1.getAge()==AgesOfGod.ANCIENT){
            if (god1.getAge()!=god2.getAge()) {
                return description + "These are offerings to a god much more ancient than the " + god2.getName() + " ";
            }
            else {
                return description + "These are offerings to a god as ancient as the " + god2.getName()+ " ";
            }
        }
        if (god1.getAge()==AgesOfGod.MIDDLE){
            if (god2.getAge()==AgesOfGod.MODERN){
                return description + "These are offerings to a god much more ancient than the " + god1.getName()+ " ";
            }
            if(god2.getAge()==AgesOfGod.ANCIENT){
                return description + "These are offerings to a god much less ancient than the " + god2.getName()+" ";
            }
            if (god2.getAge()==god1.getAge()){
                return description + "These are offerings to a god as ancient as the " + god2.getName()+" ";
            }
        }
        if (god1.getAge()==AgesOfGod.MODERN){
            if (god2.getAge()==god1.getAge()){
                return description + "These are offerings to a god much less ancient than the " + god2.getName()+ " ";
            }
            return description + "These are offerings to a god as ancient as the " + god2.getName()+" ";
        }
        return null;
    }
    @Override
    public String toTremble(){
        return " and then " + name + " trembled\n";
    }
    public void toNeed(Exit exit){
        exit.setBeNeeded(true);
        try {
            System.out.printf(toFindExit(exit));
            exit.setBeNeeded(false);
        }
        catch (ExitNotFound exitNotFound){
            System.err.printf(exitNotFound.getMessage());
        }
    }
    private String toFindExit(Exit exit) throws ExitNotFound {
        if (Math.random()<0.5){
            exit.setFound(true);
            return "exit found \n";
        }
        else{
            throw new ExitNotFound("exit not found \n");
        }
    }
    @Override
    public String toHope(){
        return name + " hoped that " + memory.name + " will suggest some data preserved from the day of the funeral\n";
    }
    @Override
    public String toKnow(Object obj) {
        return name + " knew that always be a periods when too many " + obj + " have die\n";
    }
    @Override
    public String toString(){
        return name;
    }

    public class Memory {
        private String name;
        Memory(String name) {
            this.name = name;
        }
    }

}
