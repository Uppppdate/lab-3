package Objects;

import Coordinates.Coordinates;
import Coordinates.Map;

public class Gates {
    private String name;
    private Coordinates coordinates;
    public Gates(String name, int x, int y){
        this.name=name;
        coordinates = Map.setCoordinatesOfObject(this, x, y);
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
