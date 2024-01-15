package Objects;

import Coordinates.Map;
import Coordinates.Coordinates;
import Places.Street;


public class Sivik {
    private String name;
    private Coordinates coordinates;

    public Sivik(String name, int x, int y) {
        this.name = name;
        coordinates = Map.setCoordinatesOfObject(this, x, y);
    }

    public String toStay(String description, Street street) {
//        for (int count = 0; count<street.getCoordinates().size(); count++) {
//            if (street.getCoordinates().get(count).getX()==
//        }
        return "On the other side of the " + street + " stood his " + name + description + "\n";
        //OTHER OR THIS SIDE MUST BE ANALYSED BY USING THE COORDINATES
        //AND THEN THERE MUST BE LOCATION DEPENDENT OUTPUT
    }

    @Override
    public String toString(){
        return this.name;
    }
}
