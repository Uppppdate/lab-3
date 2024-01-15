package Main;

import Entities.*;
import Coordinates.Rotation;
import Coordinates.Map;
import Humans.*;
import Moving.Waiting;
import Objects.*;
import Objects.Items.*;
import Places.Street;

public class Main{
            public static void main(String[] args) {
        //Объявление объектов
        Luis Luis = new Luis(Names.LUIS, 0, 0);
        Carl Carl = new Carl(Names.CARL);
        Wind wind = new Wind("Wind");
        Trees trees = new Trees("trees ", Rotation.HORIZONTAL, 1, 0, 2);
        Flashlight flashlight = new Flashlight("flashlight", false);
        Gloves gloves = new Gloves("gloves");
//        Gloves gloves2 = new Gloves("gloves");
        Pickaxe pickaxe = new Pickaxe("pickaxe");
        Shovel showel = new Shovel("showel");
        Sivik sivik = new Sivik("sivik ", 0, 5);
        Iron_Fence ironFence1 = new Iron_Fence("iron fence", Rotation.VERTICAL, 0, 3, 4);
        Iron_Fence ironFence2 = new Iron_Fence("iron fence", Rotation.VERTICAL, 5, 3, 2);
        Gates gates = new Gates("gates     ", 4, 3);
        Piles_Of_Flowers piles = new Piles_Of_Flowers("Piles of flowers");
        Pit pit = new Pit("pit   ", 2, 1);
        piles.putIn(pit);
        People people = new People("People");
        Oz oz = new Oz("Oz");
        Rachel Rachel = new Rachel(Names.RACHEL);
        Exit exit = new Exit("Exit");
        Crypta crypta = new Crypta("crypta", 4, 1);
        Coffin coffin = new Coffin("coffin");
        Street street = new Street("street", Rotation.VERTICAL, 0, 4, 7);
        //Сюжет
        if(Luis.getCoordinates().getX()==0&Luis.getCoordinates().getY()==0){
                System.out.print(wind.toBlow() + wind.toRustle(trees) + wind.toForce(Luis));
        }
        Waiting.waitInSec(1);
        Luis.toTie(showel, pickaxe, gloves, flashlight);
        System.out.println(flashlight.beNeeded(Luis));
        Waiting.waitInSec(1);
        Luis.toGo(ironFence1);
        System.out.print(sivik.toStay(". So close and so far away.", street) + Luis.toLook(sivik, ViewDirections.STRAIGHT));
        Waiting.waitInSec(1);
        Luis.toGo(gates);
        System.out.print(Luis.toLook(pit, ViewDirections.STRAIGHT) +
        piles.toLie(pit));
        Waiting.waitInSec(1);
        System.out.print("\"My God. Not really. These are offerings to a god much more ancient than the Christian one...\"\n");
        System.out.print(people.toName(oz, "by different names "));
        System.out.print(Rachel.toName(oz, " correctly"));
        System.out.print(Rachel.toSay("Oz the Great and Terrifying, god of the dead, remaining dead, god of rotting flowers in the drainage hole, god of Mystery"));
        Waiting.waitInSec(1);
        System.out.print(Luis.toLook(pit, ViewDirections.STRAIGHT));
        System.out.print(Luis.toLook(null, ViewDirections.AWAY));
        Waiting.waitInSec(1);
        System.out.print(Luis.toGo(null));
        System.out.print(exit.beNeeded(Luis));
        System.out.print(Luis.toHope());
        Waiting.waitInSec(1);
        System.out.print(crypta.toLoom());
        System.out.print(coffin.getName() + "s were placed here in winter, when it was too cold to dig graves,\nand also when there were too many of them.\n");
        Waiting.waitInSec(1);
        System.out.print(Luis.toKnow(people));
        System.out.print(Carl.toSayTo(": \"Everything balances out\"\n", Luis));
//      System.out.println(gloves.equals(gloves2));

    }
}





