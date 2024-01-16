package Coordinates;

import Humans.Luis;

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
        System.out.println("\n");
    }
    public static void mapUpdate(Object object, MapOptions option){
        if(object==null){
            return;
        }
        if(option==MapOptions.DELETE){
            deleteData(object);
        }
        if (option==MapOptions.UPDATE){
            if(object instanceof Luis)
            setCoordinatesOfObject(object, ((Luis)object).getCoordinates().getX(), ((Luis)object).getCoordinates().getY());
        }
    }
    private static void deleteData(Object object){
        if (object instanceof Luis){
            //px - previous x, py - previous y, previous coordinates deletes from the map here.
            int px, py;
            px = ((Luis)object).getCoordinates().getX();
            py = ((Luis)object).getCoordinates().getY();
            map[px][py]=0;
        }
    }

}
