package Objects;

import Coordinates.Coordinates;
import Coordinates.Rotation;
import Coordinates.Map;
import Interfaces.HavingCoordinate;
import Interfaces.Visible;

import java.util.ArrayList;

public class Trees implements HavingCoordinate, Visible {
    private final String name;
    private final ArrayList<Coordinates> coordinates = new ArrayList<>();

    public Trees(String name, Rotation rotation, int x, int y, int length) {
        this.name = name;
        if (rotation == Rotation.VERTICAL) {
            for (int a = 0; a < length; a++) {
                coordinates.add(Map.setCoordinatesOfObject(this, x + a, y));
            }
        } else {
            for (int a = 0; a < length; a++) {
                coordinates.add(Map.setCoordinatesOfObject(this, x, y + a));
            }
        }
    }

    public ArrayList<Coordinates> getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return name;
    }
}
