package Humans;

import Actions.*;
import Coordinates.Coordinates;
import Coordinates.Map;
import Objects.Items.Items;
import Objects.Pit;

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
    public void toTie(Items... items){
        System.out.printf("%s tied ", name);
        for (Items i: items){
            System.out.print(i+", ");
            i.setIsTied(true);
        }
        System.out.println();
    }
    public String toGo(String description){
        return name + " went " + description + "\n";
    }
    public String toGo(String description, Object object){
        return name + " went " + description + object + "\n";
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
            else return name + " looked at " + obj + "\n";
        }
        if (directions== ViewDirections.BEHIND){
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
            return "finally " + name + " looked away with a slight sigh\n";
        }
        return null;
    }

    @Override
    public String toTremble(){
        return " and then " + name + " trembled\n";
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
