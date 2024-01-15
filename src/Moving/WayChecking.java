package Moving;

import Objects.Gates;
import Objects.Iron_Fence;


public class WayChecking {
    private static int count=0;
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
