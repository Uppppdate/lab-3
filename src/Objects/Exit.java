package Objects;

public class Exit {
    private final String name;
    private boolean beNeeded;
    private boolean isFound;

    public Exit(String name) {
        this.name = name;
    }

    public void setBeNeeded(boolean beNeeded) {
        this.beNeeded = beNeeded;
        if (beNeeded) {
            System.out.printf("we had to find a way out \n");
        }
        if (!beNeeded) {
            System.out.printf("no need to look for a way out anymore \n");
        }
    }

    public void setFound(boolean found) {
        isFound = found;
    }

    public boolean isBeNeeded() {
        return beNeeded;
    }

    @Override
    public String toString() {
        return this.name;
    }


}
