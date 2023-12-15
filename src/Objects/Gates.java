package Objects;

public class Gates {
    private String name;
    public Gates(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
