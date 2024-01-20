package Objects;

import Interfaces.HavingCoordinate;
import Interfaces.Looming;
import Coordinates.Coordinates;
import Coordinates.Map;
import Interfaces.Visible;

public class Crypta implements Looming, HavingCoordinate, Visible {
    private final String name;
    private final Coordinates coordinates;
    private int lightLevel = 0;

    public Crypta(String name, int x, int y) {
        this.name = name;
        coordinates = Map.setCoordinatesOfObject(this, x, y);
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String toLoom() {
        class lightLevelSetter {
            lightLevelSetter(int level) {
                setLightLevel(level);
            }
            private void setLightLevel(int level) {
                Crypta.this.lightLevel = level;
            }
        }
        lightLevelSetter light = new lightLevelSetter(3);
        return "Outline of the " + name + " was looming\n";
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}
