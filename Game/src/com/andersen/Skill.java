package com.andersen;

import com.andersen.race.elves.ElvesArcher;
import com.andersen.race.elves.ElvesMagican;
import com.andersen.race.elves.ElvesWarrior;
import com.andersen.race.orcs.OrcArcher;
import com.andersen.race.orcs.OrcGoblin;
import com.andersen.race.orcs.OrcShaman;

import java.util.Random;

public class Skill extends GenereteDetachment {
    GenereteDetachment genereteDetachment = new GenereteDetachment();

    Random random = new Random();
    int setdetachment = random.nextInt(3-1) + 1;


    public double retMethodElves () {
        genereteElves();
        if (getNewElves() instanceof ElvesArcher) {
            switch (setdetachment) {
                case 1: {
                    return ((ElvesArcher) getNewElves()).attackShotArrow(genereteDetachment.genereteOrcs());
                }
                case 2: {
                    return ((ElvesArcher) getNewElves()).simpleAttackArcher(genereteDetachment.genereteOrcs());
                }
            }
        }
        else
        if (getNewElves() instanceof ElvesMagican) {
            switch (setdetachment) {
                case 1: {
                    return ((ElvesMagican) getNewElves()).magicBuf(genereteDetachment.genereteElves());
                }
                case 2: {
                    return ((ElvesMagican) getNewElves()).magicAttack(genereteDetachment.genereteOrcs());
                }
            }
        }
        if (getNewElves() instanceof ElvesWarrior) {
            return ((ElvesWarrior) getNewElves()).attackWarrior(genereteDetachment.genereteOrcs());
        }
        else
            return 0;
    }


    public double retMethodOrcs () {
        if (genereteDetachment.genereteOrcs() instanceof OrcShaman) {
            switch (setdetachment) {
                case 1: {
                    return ((OrcShaman) genereteDetachment.genereteOrcs()).magicAttack(genereteDetachment.genereteElves());
                }
                case 2: {
                    return 0; ////// тут орк шаман вертает булеан, а метод весь вертает дабл, нужно подумать
                }
            }
        } else
            if (genereteDetachment.genereteOrcs() instanceof OrcArcher) {
            switch (setdetachment) {
                case 1: {
                    return ((OrcArcher) genereteDetachment.genereteOrcs()).attackShotArrow(genereteDetachment.genereteElves());
                }
                case 2: {
                    Hero orcArcher = ((OrcArcher) genereteDetachment.genereteOrcs());
                    return ((OrcArcher) orcArcher).simpleAttackArcher(genereteDetachment.genereteElves());
                    //return ((OrcArcher) genereteDetachment.genereteOrcs()).simpleAttackArcher(genereteDetachment.genereteElves());
                }
            }
        }
            if (genereteDetachment.genereteOrcs() instanceof OrcGoblin) {
            return ((OrcGoblin) genereteDetachment.genereteOrcs()).attackWarrior(genereteDetachment.genereteElves());
        }
            return 0;
    }



}
