package Moving;

import Coordinates.*;


public class Moving {
        public static Coordinates makeStep(Coordinates coordinates, int x, int y){
                                coordinates.setY(y);
                                coordinates.setX(x);
                return coordinates;
        }
}
