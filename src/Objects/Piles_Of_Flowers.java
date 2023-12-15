package Objects;

import Actions.Lying;

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
}
