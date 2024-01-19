package Entities;

import Interfaces.Forcing;
import Interfaces.Blowing;
import Interfaces.Rustling;
import Humans.ViewDirections;
import Humans.Feelings;
import Humans.Luis;
import Objects.Trees;

import java.lang.Math;

public class Wind implements Blowing, Rustling, Forcing {

    private int strength;
    private final String name;

    public Wind(String name) {
        this.name = name;
        setStrength();
    }

    private void setStrength() {
        this.strength = (int) (Math.random() * ((10) + 1));
    }

    public String toBlow() {
        if (strength >= 0 & strength <= 3) {
            return name + " blew lightly\n";
        }
        if (strength > 3 & strength <= 6) {
            return name + " blew normally\n";
        }
        if (strength > 6 & strength <= 10) {

            return name + " blew harder\n";
        }
        return null;
    }

    public String toRustle(Trees obj) {
        return name + " rustled among the " + obj + "\n";
    }

    public String toForce(Luis luis) {

            luis.setFeelings(Feelings.ANXIETY);
            return name + " forced " + luis.getName() + " to" + luis.toLook(null, ViewDirections.BEHIND);
    }
}
