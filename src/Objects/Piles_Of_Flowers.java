package Objects;

import Actions.Lying;
import Objects.Pit;
public class Piles_Of_Flowers implements Lying {
    private String name;
    public Piles_Of_Flowers(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
    public String toLie(Object object){
        return name + " lied in " + object + "\n";
    }
    public boolean putIn(Object obj){
        if(obj instanceof Pit){
            ((Pit)obj).setEmpty(false);
            return true;
        }
        return false;
    }
}
