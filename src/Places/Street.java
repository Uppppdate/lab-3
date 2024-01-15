package Places;
import Coordinates.Coordinates;
import Coordinates.Rotation;
import Coordinates.Map;
import java.util.ArrayList;

public class Street {
    private String name;
    private ArrayList<Coordinates> coordinates = new ArrayList<Coordinates>();

    public Street(String name, Rotation rotation, int x, int y, int length) {
        this.name = name;
        if(rotation== Rotation.VERTICAL){
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

    public ArrayList<Coordinates> getCoordinates() {
        return coordinates;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
}
