package Main;

import Entities.*;
import Humans.*;
import Objects.*;
import Objects.Items.*;
import Places.Street;


public class Main{
            public static void main(String[] args) {
        //Объявление объектов
        Luis Luis = new Luis(Names.LUIS);
        Carl Carl = new Carl(Names.CARL);
        Wind wind = new Wind("Wind");
        Trees trees = new Trees("Trees");
        Flashlight flashlight = new Flashlight("flashlight", false);
        Gloves gloves = new Gloves("gloves");
        Pickaxe pickaxe = new Pickaxe("pickaxe");
        Shovel showel = new Shovel("showel");
        Sivik sivik = new Sivik("sivik");
        Iron_Fence ironFence = new Iron_Fence("iron Fence");
        Gates gates = new Gates("Gates");
        Piles_Of_Flowers piles = new Piles_Of_Flowers("Piles of flowers");
        Pit pit = new Pit("Pit");
        piles.putIn(pit);
        People people = new People("People");
        Oz oz = new Oz("Oz");
        Rachel Rachel = new Rachel(Names.RACHEL);
        Exit exit = new Exit("Exit");
        Crypta crypta = new Crypta("Crypta");
        Coffin coffin = new Coffin("Coffin");
        Street street = new Street("street");
        //Сюжет
        System.out.print(wind.toBlow());
        System.out.print(wind.toRustle(trees));
        System.out.print(wind.toForce(Luis));
        Luis.toTie(showel, pickaxe, gloves, flashlight);
        System.out.print(flashlight.beNeeded(Luis));
        System.out.print(Luis.toGo("the same way and five minutes later approached a high ", ironFence));
        System.out.print(sivik.toStay(". So close and so far away."));
        System.out.print(Luis.toLook(sivik, ViewDirections.STRAIGHT));
        System.out.print(Luis.toGo("along the fence to ", gates));
        System.out.print(Luis.toLook(pit, ViewDirections.STRAIGHT));
        System.out.print(piles.toLie(pit));
        System.out.print("\"My God. Not really. These are offerings to a god much more ancient than the Christian one...\"\n");
        System.out.print(people.toName(oz, "by different names "));
        System.out.print(Rachel.toName(oz, " correctly"));
        System.out.print(Rachel.toSay("Oz the Great and Terrifying, god of the dead, remaining dead, god of rotting flowers in the drainage hole, god of Mystery"));
        System.out.print(Luis.toLook(pit, ViewDirections.STRAIGHT));
        System.out.print(Luis.toLook(null, ViewDirections.AWAY));
        System.out.print(Luis.toGo("to the next place"));
        System.out.print(exit.beNeeded(Luis));
        System.out.print(Luis.toHope());
        System.out.print(crypta.toLoom());
        System.out.print(coffin.getName() + "s were placed here in winter, when it was too cold to dig graves,\nand also when there were too many of them.\n");
        System.out.print(Luis.toKnow(people));
        System.out.print(Carl.toSayTo(": \"Everything balances out\"", Luis));
    }
}





