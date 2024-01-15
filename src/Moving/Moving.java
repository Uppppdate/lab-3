package Moving;

import Coordinates.*;


public class Moving {
        public static Coordinates makeStep(Coordinates coordinates, int x, int y) throws IncorrectCoordinates{
//                if(Math.abs(x - coordinates.getX())==1 | Math.abs(y - coordinates.getY())==1){
                                coordinates.setY(y);
                                coordinates.setX(x);
//                }
//                else throw new IncorrectCoordinates("incorrect coordinates");
                return coordinates;
        }
}
