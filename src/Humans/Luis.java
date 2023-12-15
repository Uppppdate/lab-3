package Humans;

import Actions.*;
import Objects.Items.Items;
import Objects.Piles_Of_Flowers;
import Objects.Pit;

public class Luis extends Human implements Tieing, Going, Looking, Trembling, Able_To_Hope, Able_To_Know, Able_To_Look_Behind, Able_To_Look_Away{

    private Feelings feelings = Feelings.NORMAL;
    public Memory memory;
    public Luis(Names name){
        super(name);
        memory = new Memory("Memory");
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

    public String toLook(Object obj){
        if(feelings==Feelings.HYPNOTIZED){
            return name + " looked at " + obj + " as if " + feelings.getName() + "\n";
        }
        if(obj instanceof Pit){
            this.feelings = Feelings.HYPNOTIZED;
            return name + " looked at " + obj + toTremble();
        }
        return name + " looked at " + obj + "\n";
    }

    @Override
    public String lookAway() {
        feelings=Feelings.NORMAL;
        return "finally " + name + " looked away with a slight sigh\n";
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
    public String toLookBehind(Feelings feelings){
        if (feelings == Feelings.NORMAL)
            return name + " looked back \n";
        if (feelings == Feelings.HYPNOTIZED)
            return name + " looked back as if he was " + feelings.getName() + "\n";
        if (feelings == Feelings.ANXIETY)
            return name + " looked back with " + feelings.getName() + "\n";
        return null;
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
