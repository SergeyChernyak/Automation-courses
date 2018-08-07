package com.andersen;

import com.andersen.race.elves.ElvesArcher;
import com.andersen.race.elves.ElvesMagican;
import com.andersen.race.orcs.OrcArcher;
import com.andersen.race.undead.UndeadNecromancer;

public class Main {
    public static void main(String[] args) {

        ElvesArcher eArcher = new ElvesArcher();
        OrcArcher oArcher = new OrcArcher();

           while (oArcher.isLive() == true && eArcher.isLive() == true) {
               System.out.println(eArcher.attackShotArrow(oArcher));
               System.out.println(oArcher.attackShotArrow(eArcher));
            }
            if (oArcher.getHealht() <= 0) {
                System.err.println("Умер - " + oArcher.getName());
            }
            else {
               System.err.println("Умер - " + eArcher.getName());
           }
    }
}
