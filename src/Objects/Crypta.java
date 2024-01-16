package Objects;

import Interfaces.Looming;
import Coordinates.Coordinates;
import Coordinates.Map;

public class Crypta implements Looming{
    private String name;
    private Coordinates coordinates;

    public Crypta(String name, int x, int y) {
        this.name = name;
        coordinates = Map.setCoordinatesOfObject(this, x, y);
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
