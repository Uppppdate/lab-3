package Humans;

import Interfaces.Naming;

public class People implements Naming {
    private final String name;

    public People(String name) {
        this.name = name;
    }

    public String toDie() {
        return "die";
    }

    @Override
    public String toString() {
        return name;
    }

    public String toName(Object obj, String description) {
        return "\n" + name + " called " + obj + " " + description;
    }
}
