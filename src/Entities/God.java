package Entities;

public class God {
    private String name;
    private AgesOfGod age;
    private String description;
    public God(String name, AgesOfGod age, String description) {
        this.name = name;
        this.age = age;
        this.description=description;
    }

    public String getDescription() {
        return description;
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
