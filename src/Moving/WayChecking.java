package Moving;

import Interfaces.HavingCoordinate;
import Objects.Gates;
import Objects.IronFence;


public class WayChecking {
    public static short checkWay(HavingCoordinate obj) {
        if (obj instanceof IronFence) {
            return 1;
        }
        if (obj instanceof Gates) {
            return 2;
        }
        if (obj == null) {
            return 3;
        }
        return 0;
    }
}
