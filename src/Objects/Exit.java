package Objects;

import Interfaces.BeNeeded;
import Humans.Human;

public class Exit implements BeNeeded{
    private String name;

    public Exit(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public String beNeeded(Human human) {
        return human.getName() + " needed to find " + name + "\n";
    }
}
