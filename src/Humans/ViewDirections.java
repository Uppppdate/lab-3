package Humans;

public enum ViewDirections {
    AWAY("away"),
    BEHIND("behind"),
    STRAIGHT("straight");
    private String name;
    ViewDirections(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}
