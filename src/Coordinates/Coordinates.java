package Coordinates;

import java.util.ArrayList;

public class Coordinates {
    private int x;
    private int y;
    public Coordinates(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public static String getObjectCoordinates(Coordinates coordinates){
        return "x = " + coordinates.getX() + " y = " + coordinates.getY();
    }
    public static String getObjectCoordinates(ArrayList<Coordinates> coordinates){
        String result;
        for (int a = 0; a<coordinates.size(); a++){
            result = "x = " + coordinates.get(a).getX() + " y = " + coordinates.get(a).getY();
            return result;
        }
        return null;
    }
}
