package Interfaces;

import Humans.TieGoneWrong;
import Objects.Items.Items;

public interface Tieing {
    void toTie(Items... items) throws TieGoneWrong;
}
