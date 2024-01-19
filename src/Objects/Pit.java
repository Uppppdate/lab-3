package Objects;

import Coordinates.Coordinates;
import Coordinates.Map;
import Interfaces.HavingCoordinate;
import Interfaces.Visible;

public class Pit implements HavingCoordinate, Visible {
    private boolean isEmpty;
    private final String name;
    private final Coordinates coordinates;

    public Pit(String name, int x, int y) {
        this.name = name;
        isEmpty = true;
        coordinates = Map.setCoordinatesOfObject(this, x, y);
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
