package Humans;

import Entities.God;
import Interfaces.Naming;
import Interfaces.Saying;

public class Rachel extends Human implements Naming, Saying {
    public Rachel(Names name) {
        super(name);
    }

    @Override
    public String toName(Object obj, String description) {
        return "but only sister " + name + " called " + obj + description + "\n";
    }

    @Override
    public String toSay(String description) {
        return description + "\n";
    }

    @Override
    public String toSayTo(String description, Object obj) {
        if(obj instanceof God){
            return ((God)obj).getDescription();
        }

        return description;
    }
}

