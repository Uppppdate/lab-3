package Humans;

import Interfaces.*;
import Coordinates.*;
import Entities.AgesOfGod;
import Entities.God;
import Moving.Moving;
import Moving.WayChecking;
import Objects.Exit;
import Objects.Items.Items;
import Objects.Pit;
import Moving.Waiting;

import java.util.ArrayList;

public class Luis extends Human implements Tieing, Going, Looking, Trembling, Hoping, Knowing, HavingCoordinate, Visible {
    private Feelings feelings = Feelings.NORMAL;
    private final Coordinates coordinates;
    private final Memory memory;
    private final Head head;

    public Luis(Names name, int x, int y) {
        super(name);
        memory = new Memory("Memory");
        coordinates = Map.setCoordinatesOfObject(this, x, y);
        head = new Head();
    }

    public void setFeelings(Feelings feelings) {
        this.feelings = feelings;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void toTie(Items... items) throws TieGoneWrong {
        if (Math.random() < 0.6) {
            throw new TieGoneWrong("Luis falsed to tie items\n");
        }
        System.out.printf("%s tied ", name);
        for (Items i : items) {
            System.out.print(i + ", ");
            i.setIsTied(true);
        }
        System.out.println();
    }

    public void toGo(HavingCoordinate object) {
        switch (WayChecking.checkWay(object)) {
            case 1:
                Map.viewMap();
                Waiting.waitInSec(1);
                for (int steps = 0; steps < 2; steps++) {
                    Map.mapUpdate(this, MapOptions.DELETE);
                    Moving.makeStep(this.getCoordinates(), 0, 1 + steps);
                    Map.mapUpdate(this, MapOptions.UPDATE);
                    Map.viewMap();
                    Waiting.waitInSec(1);
                }
                break;
            case 2:
                Map.viewMap();
                Waiting.waitInSec(1);
                for (int steps = 0; steps < 2; steps++) {
                    Map.mapUpdate(this, MapOptions.DELETE);
                    Moving.makeStep(this.getCoordinates(), 1 + steps, 2);
                    Map.mapUpdate(this, MapOptions.UPDATE);
                    Map.viewMap();
                    Waiting.waitInSec(1);
                }
                break;
            case 3:
                Map.viewMap();
                Waiting.waitInSec(1);
                for (int steps = 0; steps < 2; steps++) {
                    Map.mapUpdate(this, MapOptions.DELETE);
                    Moving.makeStep(this.getCoordinates(), 3 + steps, 2);
                    Map.mapUpdate(this, MapOptions.UPDATE);
                    Map.viewMap();
                    Waiting.waitInSec(1);
                }
                break;
        }
    }

    public String toLook(Visible obj, ViewDirections directions) {
        if (directions == ViewDirections.STRAIGHT) {
            if (feelings == Feelings.HYPNOTIZED) {
                return name + " looked at " + obj + " as if " + feelings.getName() + "\n";
            }
            if (obj instanceof Pit) {
                if (!((Pit) obj).isEmpty()) {
                    this.feelings = Feelings.HYPNOTIZED;
                    return name + " looked at " + obj + toTremble();
                } else {
                    this.feelings = Feelings.NORMAL;
                    return name + " looked at " + obj;
                }
            } else return name + " looked at " + obj + "\n\n";
        }
        if (directions == ViewDirections.BEHIND) {
            if (feelings == Feelings.NORMAL) {
                head.toTurn(true);
                head.toTurn(false);
                return " look back \n";
            }
            if (feelings == Feelings.HYPNOTIZED) {
                head.toTurn(true);
                head.toTurn(false);
                return " look back as if he was " + feelings.getName() + "\n";
            }
            if (feelings == Feelings.ANXIETY) {
                head.toTurn(true);
                head.toTurn(false);
                return " look back with " + feelings.getName() + "\n";
            }
            return null;
        }
        if (directions == ViewDirections.AWAY) {
            feelings = Feelings.NORMAL;
            return "finally " + name + " looked away with a slight sigh\n\n";
        }
        return null;
    }
    public String toSay(int count){
        return memory.toSuggest(count);
    }
    public String toSay(String description, God god1, God god2) {
        if (god1.getAge() == AgesOfGod.ANCIENT) {
            if (god1.getAge() != god2.getAge()) {
                return description + "These are offerings to a god much more ancient than the " + god2.getName() + " ";
            } else {
                return description + "These are offerings to a god as ancient as the " + god2.getName() + " ";
            }
        }
        if (god1.getAge() == AgesOfGod.MIDDLE) {
            if (god2.getAge() == AgesOfGod.MODERN) {
                return description + "These are offerings to a god much more ancient than the " + god1.getName() + " ";
            }
            if (god2.getAge() == AgesOfGod.ANCIENT) {
                return description + "These are offerings to a god much less ancient than the " + god2.getName() + " ";
            }
            if (god2.getAge() == god1.getAge()) {
                return description + "These are offerings to a god as ancient as the " + god2.getName() + " ";
            }
        }
        if (god1.getAge() == AgesOfGod.MODERN) {
            if (god2.getAge() == god1.getAge()) {
                return description + "These are offerings to a god much less ancient than the " + god2.getName() + " ";
            }
            return description + "These are offerings to a god as ancient as the " + god2.getName() + " ";
        }
        return null;
    }

    @Override
    public String toTremble() {
        return " and then " + name + " trembled\n";
    }

    public void toNeed(Exit exit) {
        exit.setBeNeeded(true);
        System.out.printf(toFindExit(exit));
        exit.setBeNeeded(false);
    }

    private String toFindExit(Exit exit) {
        if (Math.random() < 0.6) {
            exit.setFound(true);
            return "exit found \n";
        } else {
            throw new ExitNotFound("exit not found \n");
        }
    }

    @Override
    public String toHope() {
        return name + " hoped that " + memory.name + " will suggest " + memory.toSuggest(0) + "\n";
    }

    @Override
    public String toKnow(People people) {
        return name + " knew that always be a periods when too many " + people + " have " + people.toDie() + "\n";
    }

    @Override
    public String toString() {
        return name;
    }

    private class Memory {
        private final String name;
        private final ArrayList<String> data = new ArrayList<>();

        Memory(String name) {
            this.name = name;
            data.add("something preserved from the day of the funeral");
            data.add("s were placed here in winter, when it was too cold to dig graves,\nand also when there were too many of them.\n");
        }

        public String toSuggest(int count) {
            return data.get(count);
        }
    }

    private class Head {
        private boolean isTurned;

        Head() {

        }

        public void toTurn(boolean isTurned) {
            this.isTurned = isTurned;
        }
    }
}
