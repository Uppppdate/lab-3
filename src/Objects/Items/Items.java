package Objects.Items;

public class Items {
    public void setIsTied(boolean isTied) {
        this.isTied = isTied;
    }
    private boolean isTied;
    private String name;
    public Items(String name){
        this.name=name;
        isTied=false;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equals(Object object){
        if(object instanceof Items){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
