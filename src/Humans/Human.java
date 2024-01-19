package Humans;

public abstract class Human {
    protected String name;

    public Human(Names name) {
        this.name = name.getName();
    }

    public String getName() {
        return this.name;
    }
}
