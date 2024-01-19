package Humans;

public enum Names {
    RACHEL("Rachel"),
    LUIS("Luis  "),
    CARL("Carl");

    public String getName() {
        return name;
    }

    private final String name;

    Names(String name) {
        this.name = name;
    }

}
