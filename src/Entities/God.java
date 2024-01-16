package Entities;

public class God {
    private String name;
    private AgesOfGod age;
    public God(String name, AgesOfGod age) {
        this.name = name;
        this.age = age;
    }

    public AgesOfGod getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return this.name;
    }

}
