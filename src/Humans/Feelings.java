package Humans;

public enum Feelings {
    ANXIETY("Anxiety"),
    HYPNOTIZED("Hypnotyzed"),
    NORMAL("Normal");
    private final String name;

    Feelings(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
