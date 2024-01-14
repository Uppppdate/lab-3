package Objects;

import Coordinates.Coordinates;
import Coordinates.LongObjectRotation;
import Coordinates.Map;

import java.util.ArrayList;

public class Trees {
    private String name;
    private ArrayList<Coordinates> coordinates = new ArrayList<Coordinates>();
    public Trees(String name, LongObjectRotation rotation, int x, int y, int length) {
        this.name = name;
        if(rotation==LongObjectRotation.VERTICAL){
            for (int a = 0; a<length; a++){
                coordinates.add(Map.setCoordinatesOfObject(this, x+a,y));
            }
        }
        else{
            for (int a = 0; a<length; a++){
                coordinates.add(Map.setCoordinatesOfObject(this, x,y+a));
            }
        }
    }
    @Override
    public String toString(){
        return name;
    }
}
