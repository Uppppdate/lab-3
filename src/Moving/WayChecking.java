package Moving;

import Objects.Gates;
import Objects.Iron_Fence;


public class WayChecking {
    public static short checkWay(Object obj){
        if (obj instanceof Iron_Fence){
            return 1;
        }
        if (obj instanceof Gates){
            return 2;
        }
        if (obj==null){
            return 3;
        }
        return 0;
    }
}
