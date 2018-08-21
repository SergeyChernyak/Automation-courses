package com.andersen;

import com.andersen.race.elves.ElvesArcher;
import com.andersen.race.elves.ElvesMagican;
import com.andersen.race.elves.ElvesWarrior;
import com.andersen.race.orcs.OrcArcher;
import com.andersen.race.orcs.OrcGoblin;
import com.andersen.race.orcs.OrcShaman;
import com.andersen.race.people.PeopleCrossbowman;
import com.andersen.race.people.PeopleMagician;
import com.andersen.race.people.PeopleWarrior;
import com.andersen.race.undead.UndeadHunter;
import com.andersen.race.undead.UndeadNecromancer;
import com.andersen.race.undead.UndeadZombie;

import java.util.Random;

public class Skill extends GenereteDetachment {
    GenereteDetachment genereteDetachment = new GenereteDetachment();

    Random random = new Random();
   // int setdetachment = random.nextInt(3-1) + 1;

    public void generateSquads(){
        int setRanddetachment = 1;
                //random.nextInt(5-1) + 1;

        System.out.println(setRanddetachment);

            if (setRanddetachment == 1) {
                genereteElves();
                genereteOrcs();
                System.out.println("Начинают игру - Эльфы и Орки");
                while (getNewElves().isLive() && getNewOcrs().isLive()) {
                    retMethodElves();
                    retMethodOrcs();
                }
                if (getNewElves().isLive() == false) {
                    System.err.println("Отряд Эльфов проиграл (все умерли)");
                }
                else
                {
                    System.err.println("Отряд Орков проиграл (все умерли)");
                }
            }
            if (setRanddetachment == 2) {
                genereteElves();
                genereteUndead();
                System.out.println("Начинают игру - Эльфы и Нежить");
                retMethodElves();
                retMethodUndead();
            }
            if (setRanddetachment == 3) {
                generetePeople();
                genereteOrcs();
                System.out.println("Начинают игру - Люди и Орки");
                retMethodPeople();
                retMethodOrcs();
            }
            if (setRanddetachment == 4)
            {
                generetePeople();
                genereteUndead();
                System.out.println("Начинают игру - Люди и Нежить");
                retMethodPeople();
                retMethodUndead();
            }
    }

    public double retMethodElves () {
        int setdetachment = random.nextInt(3-1) + 1;
        if (getNewElves() instanceof ElvesArcher) {
            switch (setdetachment) {
                case 1: {
                    return ((ElvesArcher) getNewElves()).attackShotArrow(getNewOcrs());
                }
                case 2: {
                    return ((ElvesArcher) getNewElves()).simpleAttackArcher(getNewOcrs());
                }
            }
        }
        else
        if (getNewElves() instanceof ElvesMagican) {
            switch (setdetachment) {
                case 1: {
                    return ((ElvesMagican) getNewElves()).magicBuf(getNewElves());
                }
                case 2: {
                    return ((ElvesMagican) getNewElves()).magicAttack(getNewOcrs());
                }
            }
        }
        if (getNewElves() instanceof ElvesWarrior) {
            return ((ElvesWarrior) getNewElves()).attackWarrior(getNewOcrs());
        }
        else
            return 0;
    }

    public Object retMethodOrcs () {
        int setdetachment = random.nextInt(3-1) + 1;
        if (getNewOcrs() instanceof OrcArcher) {
            switch (setdetachment) {
                case 1: {
                    return ((OrcArcher) getNewOcrs()).attackShotArrow(genereteElves()); }
                case 2: {
                    return ((OrcArcher) getNewOcrs()).simpleAttackArcher(genereteElves());
                }
            }
        }
        else
        if (getNewOcrs() instanceof OrcShaman) {
            switch (setdetachment) {
                case 1: {
                    return ((OrcShaman) getNewOcrs()).magicBufDark(genereteOrcs());
                }
                case 2: {
                    return ((OrcShaman) getNewOcrs()).magicAttack(genereteElves());
                }
            }
        }
        if (getNewOcrs() instanceof OrcGoblin) {
            return ((OrcGoblin) getNewOcrs()).attackWarrior(genereteElves());
        }
        else
            return 0;
    }

    public double retMethodPeople () {
        int setdetachment = random.nextInt(3-1) + 1;
        if (getNewPeople() instanceof PeopleCrossbowman) {
            switch (setdetachment) {
                case 1: {
                    return ((PeopleCrossbowman) getNewPeople()).attackShotArrow(genereteOrcs());
                }
                case 2: {
                    return ((PeopleCrossbowman) getNewPeople()).simpleAttackArcher(genereteOrcs());
                }
            }
        }
        else
        if (getNewPeople() instanceof PeopleMagician) {
            switch (setdetachment) {
                case 1: {
                    return ((PeopleMagician) getNewPeople()).magicBuf(generetePeople());
                }
                case 2: {
                    return ((PeopleMagician) getNewPeople()).magicAttack(genereteOrcs());
                }
            }
        }
        if (getNewPeople() instanceof PeopleWarrior) {
            return ((PeopleWarrior) getNewPeople()).attackWarrior(genereteOrcs());
        }
        else
            return 0;
    }

    public Object retMethodUndead () {
        int setdetachment = random.nextInt(3-1) + 1;
        if (getNewUndead() instanceof UndeadHunter) {
            switch (setdetachment) {
                case 1: {
                    return ((UndeadHunter) getNewUndead()).attackShotArrow(genereteElves());
                }
                case 2: {
                    return ((UndeadHunter) getNewUndead()).simpleAttackArcher(genereteElves());
                }
            }
        }
        else
        if (getNewUndead() instanceof UndeadNecromancer) {
            switch (setdetachment) {
                case 1: {
                    return ((UndeadNecromancer) getNewUndead()).magicBufDark(genereteElves());
                }
                case 2: {
                    return ((UndeadNecromancer) getNewUndead()).magicAttack(genereteElves());
                }
            }
        }
        if (getNewUndead() instanceof UndeadZombie) {
            return ((UndeadZombie) getNewUndead()).attackWarrior(genereteElves());
        }
        else
            return 0;
    }

}
