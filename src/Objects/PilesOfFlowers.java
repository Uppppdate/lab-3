package Objects;

import Interfaces.Lying;
import Interfaces.Visible;

public class PilesOfFlowers implements Lying, Visible {
    private final String name;

    public PilesOfFlowers(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String toLie(Object object) {
        return name + " lied in " + object + "\n";
    }

    public void putIn(Object obj) {
        if (obj instanceof Pit) {
            ((Pit) obj).setEmpty(false);
        }
    }
}
