package Objects;

public class Coffin {
    public String getName() {
        return name;
    }

    private final String name;

    public Coffin(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
