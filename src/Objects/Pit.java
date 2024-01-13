package Objects;

public class Pit {


    private boolean isEmpty;
    private String name;
    public Pit(String name) {
        this.name=name;
        isEmpty=true;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
    public void setEmpty(boolean isEmpty){
        this.isEmpty=isEmpty;
    }
    public boolean isEmpty() {
        return isEmpty;
    }
}
