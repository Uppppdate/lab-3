package Objects.Items;

import Actions.BeNeeded;
import Humans.Human;

public class Flashlight extends Items implements BeNeeded{
    private boolean isNeeded;
    public Flashlight(String name){
        super(name);
    }
    public Flashlight(String name, boolean isNeeded){
        super(name);
        this.isNeeded=isNeeded;
    }
    public String beNeeded(Human human){
        if(isNeeded){
            return getName() + " might need and " + human.getName() + " decided to use it\n";
        }
        else return getName() + " might need but "+human.getName()+" out of caution decided to do without it\n";
    }


}
