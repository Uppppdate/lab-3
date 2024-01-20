package Objects;

import Coordinates.Map;
import Coordinates.Coordinates;
import Interfaces.HavingCoordinate;
import Interfaces.Visible;
import Places.Street;


public class Sivik implements HavingCoordinate, Visible {
    private final String name;
    private final Coordinates coordinates;

    public Sivik(String name, int x, int y) {
        this.name = name;
        coordinates = Map.setCoordinatesOfObject(this, x, y);
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String toStay(String description, Street street) {
        return "On the other side of the " + street + " stood his " + name + description + "\n";
        //OTHER OR THIS SIDE MUST BE ANALYSED BY USING THE COORDINATES
        //AND THEN THERE MUST BE LOCATION DEPENDENT OUTPUT
    }

    @Override
    public String toString() {
        return this.name;
    }
}
