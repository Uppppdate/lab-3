package Actions;

public interface Saying {
    String toSay(String description);
    String toSayTo(String description, Object obj);
}
