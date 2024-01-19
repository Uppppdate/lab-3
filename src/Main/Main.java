package Main;

import Coordinates.Coordinates;
import Coordinates.Map;
import Entities.*;
import Coordinates.Rotation;
import Humans.*;
import Moving.Waiting;
import Objects.*;
import Objects.Items.*;
import Places.Street;

public class Main {
    public static void main(String[] args) {

        //Объявление объектов
        Luis Luis = new Luis(Names.LUIS, 0, 0);
        Carl Carl = new Carl(Names.CARL);
        Wind wind = new Wind("Wind");
        Trees trees = new Trees("trees ", Rotation.HORIZONTAL, 1, 0, 2);
        Flashlight flashlight = new Flashlight("flashlight", false);
        Gloves gloves = new Gloves("gloves");
        Pickaxe pickaxe = new Pickaxe("pickaxe");
        Shovel showel = new Shovel("showel");
        Sivik sivik = new Sivik("sivik ", 0, 5);
        IronFence ironFence1 = new IronFence("iron fence", Rotation.VERTICAL, 0, 3, 4);
        IronFence ironFence2 = new IronFence("iron fence2", Rotation.VERTICAL, 5, 3, 2);
        Gates gates = new Gates("gates     ", 4, 3);
        PilesOfFlowers piles = new PilesOfFlowers("Piles of flowers");
        Pit pit = new Pit("pit   ", 2, 1);
        piles.putIn(pit);
        People people = new People("people");
        God oz = new God("Oz", AgesOfGod.ANCIENT, "Oz the Great and Terrifying, god of the dead, remaining dead, god of rotting flowers in the drainage hole, god of Mystery\n");
        God christian = new God("Chrisian", AgesOfGod.MIDDLE, "");
        Rachel Rachel = new Rachel(Names.RACHEL);
        Exit exit = new Exit("exit");
        Crypta crypta = new Crypta("crypta", 4, 1);
        Coffin coffin = new Coffin("coffin");
        Street street = new Street("street", Rotation.VERTICAL, 0, 4, 7);
        Map.DataBaseViewer DataBaseViewer = new Map.DataBaseViewer();

//        Сюжет
        if (Luis.getCoordinates().getX() == 0 & Luis.getCoordinates().getY() == 0) {
            System.out.print(wind.toBlow() + wind.toRustle(trees) + wind.toForce(Luis));
        }
        Waiting.waitInSec(1);
        try {
            Luis.toTie(showel, pickaxe, gloves, flashlight);
        } catch (TieGoneWrong ex) {
            System.err.printf(ex.getMessage());
        }
        System.out.printf(flashlight.beNeeded(Luis));
        Waiting.waitInSec(1);
        Luis.toGo(ironFence1);
        System.out.printf(sivik.toStay(". So close and so far away.", street) + Luis.toLook(sivik, ViewDirections.STRAIGHT));
        Waiting.waitInSec(1);
        Luis.toGo(gates);
        System.out.printf(Luis.toLook(pit, ViewDirections.STRAIGHT) + piles.toLie(pit));
        Waiting.waitInSec(1);
        System.out.printf(Luis.toSay("\"My God. Not really. \n", oz, christian) + people.toName(oz, "by different names ") + Rachel.toName(oz, " correctly") + Rachel.toSayTo("", oz));
        Waiting.waitInSec(1);
        System.out.printf(Luis.toLook(pit, ViewDirections.STRAIGHT) + Luis.toLook(null, ViewDirections.AWAY));
        Waiting.waitInSec(1);
        Luis.toGo(null);
        Luis.toNeed(exit);
        Waiting.waitInSec(1);
        System.out.printf(Luis.toHope() + crypta.toLoom() + coffin.getName() + Luis.toSay(1));
        Waiting.waitInSec(1);
        System.out.printf(Luis.toKnow(people) + Carl.toSayTo(": \"Everything balances out\"\n", Luis));
        DataBaseViewer.viewDataBase();
        System.err.printf(DataBaseViewer.getDataBaseViews() + "\n" + Coordinates.getObjectCoordinates(ironFence2.getCoordinates()) +
                Coordinates.getObjectCoordinates(sivik.getCoordinates()));
    }
}