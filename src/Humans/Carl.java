package Humans;

import Interfaces.Saying;

public class Carl extends Human implements Saying {
    public Carl(Names name){
        super(name);
    }

    @Override
    public String toSay(String description) {
        return description;
    }

    public String toSayTo(String description, Object obj) {
        return name + " said to " + obj + description;
    }
}
