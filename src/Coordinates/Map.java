package Coordinates;

import Humans.Luis;
import Interfaces.HavingCoordinate;

import java.util.ArrayList;

public class Map {
    private static final int[][] map = new int[7][7];
    private static final ArrayList<HavingCoordinate> objectArrayList = new ArrayList<>();
    private static boolean isObject;

    public static Coordinates setCoordinatesOfObject(HavingCoordinate obj, int x, int y) {
        map[x][y] = obj.hashCode();
        if (!objectArrayList.contains(obj)) {
            objectArrayList.add(obj);
        }
        return new Coordinates(x, y);
    }

    public static void viewMap() {
        for (int[] ints : map) {
            for (int b = 0; b < map.length; b++) {
                for (HavingCoordinate object : objectArrayList) {
                    if (object.hashCode() == ints[b]) {
                        System.out.print(object + "   ");
                        isObject = true;
                    }
                }
                if (!isObject) System.out.print("0        ");
                isObject = false;
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void mapUpdate(HavingCoordinate object, MapOptions option) {
        if (object == null) {
            return;
        }
        if (option == MapOptions.DELETE) {
            deleteData(object);
        }
        if (option == MapOptions.UPDATE) {
            if (object instanceof Luis)
                setCoordinatesOfObject(object, ((Luis) object).getCoordinates().getX(), ((Luis) object).getCoordinates().getY());
        }
    }

    private static void deleteData(HavingCoordinate object) {
        if (object instanceof Luis) {
            //px - previous x, py - previous y, previous coordinates deletes from the map here.
            int px, py;
            px = ((Luis) object).getCoordinates().getX();
            py = ((Luis) object).getCoordinates().getY();
            map[px][py] = 0;
        }
    }

    public static class DataBaseViewer {
        private int dataBaseViews;

        public void viewDataBase() {
            dataBaseViews++;
            for (HavingCoordinate i : objectArrayList) {
                System.out.println(i + "\n");
            }
        }

        public int getDataBaseViews() {
            return dataBaseViews;
        }
    }
}
