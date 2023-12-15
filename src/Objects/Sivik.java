package Objects;

import Actions.Able_To_Stay;

public class Sivik implements Able_To_Stay{
    private String name;

    public Sivik(String name) {
        this.name = name;
    }

    @Override
    public String toStay(String place) {
        return "On the other side of the street stood his " + name + place + "\n";
    }

    @Override
    public String toString(){
        return this.name;
    }
}
