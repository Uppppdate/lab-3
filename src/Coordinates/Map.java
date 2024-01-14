package Coordinates;

import java.util.ArrayList;

public class Map {
    private static int[][] map = new int[7][7];
    private static ArrayList<Object> objectArrayList = new ArrayList<Object>();
    private static boolean isObject;
    public static Coordinates setCoordinatesOfObject(Object obj, int x, int y) {
        map[x][y] = obj.hashCode();
        if(!objectArrayList.contains(obj)){
            objectArrayList.add(obj);
        }
        return new Coordinates(x, y);
    }

    public static void viewMap() {
        for(int a = 0; a<map.length; a++){
            for(int b = 0; b<map.length; b++){
                for (Object object : objectArrayList) {
                    if (object.hashCode() == map[a][b]) {
                        System.out.print(object.toString() + "   ");
                        isObject = true;
                    }
                }
                if (!isObject) System.out.print("0        ");
                isObject=false;
            }
            System.out.println();
        }
    }
}
