package Objects;

import Coordinates.Coordinates;
import Coordinates.Map;

public class Pit {


    private boolean isEmpty;
    private String name;
    private Coordinates coordinates;
    public Pit(String name, int x, int y) {
        this.name=name;
        isEmpty=true;
        coordinates = Map.setCoordinatesOfObject(this, x, y);
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
    public void setEmpty(boolean isEmpty){
        this.isEmpty=isEmpty;
    }
    public boolean isEmpty() {
        return isEmpty;
    }
}
