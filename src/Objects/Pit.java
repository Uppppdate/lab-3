package Objects;

public class Pit {
    private String name;
    public Pit(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
}
