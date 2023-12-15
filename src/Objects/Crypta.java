package Objects;

import Actions.Looming;

public class Crypta implements Looming{
    private String name;

    public Crypta(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public String toLoom() {
        return "Outline of the " + name + " was looming\n";
    }
}
