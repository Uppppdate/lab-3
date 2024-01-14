package Objects;

import Actions.Able_To_Stay;
import Coordinates.Map;
import Coordinates.Coordinates;


public class Sivik implements Able_To_Stay{
    private String name;
    private Coordinates coordinates;

    public Sivik(String name, int x, int y) {
        this.name = name;
        coordinates = Map.setCoordinatesOfObject(this, x, y);
    }

    @Override
    public String toStay(String place) {
        return "On the other side of the street stood his " + name + place + "\n";
        //OTHER OR THIS SIDE MUST BE ANALYSED BY USING THE COORDINATES
        //AND THEN THERE MUST BE LOCATION DEPENDENT OUTPUT
    }

    @Override
    public String toString(){
        return this.name;
    }
}
