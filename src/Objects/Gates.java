package Objects;

import Coordinates.Coordinates;
import Coordinates.Map;
import Interfaces.HavingCoordinate;
import Interfaces.Visible;

public class Gates implements HavingCoordinate, Visible {
    private final String name;
    private final Coordinates coordinates;

    public Gates(String name, int x, int y) {
        this.name = name;
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
        return this.name;
    }
}
