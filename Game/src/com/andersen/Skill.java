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

import java.util.List;
import java.util.Random;

public class Skill extends GenereteDetachment {
    GenereteDetachment genereteDetachment = new GenereteDetachment();

    Random random = new Random();
    int setRandDetachment = random.nextInt(5-1) + 1;
            //random.nextInt(3-1) + 1;
  // int setdetachment = 1;

   public Hero goalLightSide () {
       if (setRandDetachment == 1) {
           return getNewElves();
       }
       else if (setRandDetachment == 2) {
            return getNewElves();
       } else if (setRandDetachment == 3) {
           return getNewPeople();
       } else if (setRandDetachment == 4) {
           return getNewPeople();
       } else
            return goalLightSide();
   }

    public Hero goalDarkSide () {
        if (setRandDetachment == 1) {
            return getNewOcrs();
        }
        else if (setRandDetachment == 2) {
            return getNewUndead();
        } else if (setRandDetachment == 3) {
            return getNewOcrs();
        } else if (setRandDetachment == 4) {
            return getNewUndead();
        } else
            return goalDarkSide();
    }


    public void generateSquads(){

                //random.nextInt(5-1) + 1;
        System.out.println(setRandDetachment);

            if (setRandDetachment == 1) {
                for (int i = 0; i < 8; i++) {
                    genereteElves();
                    genereteOrcs();
                }
                System.out.println("Начинают игру - Эльфы и Орки");
                while (getNewElves().isLive() && getNewOcrs().isLive()) {
                    retMethodElves();
                    retMethodOrcs();
                }
                if (!getNewElves().isLive()) {
                    System.err.println("Отряд Эльфов проиграл (все умерли)");
                }
                else
                {
                    System.err.println("Отряд Орков проиграл (все умерли)");
                }
            }

            if (setRandDetachment == 2) {
                for (int i = 0; i < 8; i++) {
                    genereteElves();
                    genereteUndead();
                }
                System.out.println("Начинают игру - Эльфы и Нежить");
                while (getNewElves().isLive() && getNewUndead().isLive()) {
                    retMethodElves();
                    retMethodUndead();
                }
                if (!getNewElves().isLive()) {
                    System.err.println("Отряд Эльфов проиграл (все умерли)");
                }
                else
                {
                    System.err.println("Отряд Нежити проиграл (все умерли)");
                }
            }

            if (setRandDetachment == 3) {
                for (int i = 0; i < 8; i++) {
                    generetePeople();
                    genereteOrcs();
                }
                System.out.println("Начинают игру - Люди и Орки");
                while (getNewPeople().isLive() && getNewOcrs().isLive()) {
                    retMethodPeople();
                    retMethodOrcs();
                }
                if (!getNewPeople().isLive()) {
                    System.err.println("Отряд Людей проиграл (все умерли)");
                }
                else
                {
                    System.err.println("Отряд Орков проиграл (все умерли)");
                }
            }


            if (setRandDetachment == 4)
            {
                for (int i = 0; i < 8; i++) {
                    generetePeople();
                    genereteUndead();
                }
                System.out.println("Начинают игру - Люди и Нежить");
                while (getNewPeople().isLive() && getNewUndead().isLive()) {
                    retMethodPeople();
                    retMethodUndead();
                }
                if (!getNewPeople().isLive()) {
                    System.err.println("Отряд Людей проиграл (все умерли)");
                }
                else
                {
                    System.err.println("Отряд Нежити проиграл (все умерли)");
                }
            }
    }

    public double retMethodElves () {
        int setdetachmentElves = random.nextInt(3-1) + 1;
        if (getNewElves() instanceof ElvesArcher) {
            switch (setdetachmentElves) {
                case 1: {
                    return ((ElvesArcher) getNewElves()).attackShotArrow(goalDarkSide());
                }
                case 2: {
                    return ((ElvesArcher) getNewElves()).simpleAttackArcher(goalDarkSide());
                }
            }
        }
        else
        if (getNewElves() instanceof ElvesMagican) {
            switch (setdetachmentElves) {
                case 1: {
                    return ((ElvesMagican) getNewElves()).magicBuf(goalDarkSide());
                }
                case 2: {
                    return ((ElvesMagican) getNewElves()).magicAttack(goalDarkSide());
                }
            }
        }
        if (getNewElves() instanceof ElvesWarrior) {
            return ((ElvesWarrior) getNewElves()).attackWarrior(goalDarkSide());
        }
        else
            return 0;
    }

    public Object retMethodOrcs () {
        int setdetachmentOrcs = random.nextInt(3-1) + 1;
        if (getNewOcrs() instanceof OrcArcher) {
            switch (setdetachmentOrcs) {
                case 1: {
                    return ((OrcArcher) getNewOcrs()).attackShotArrow(goalLightSide()); }
                case 2: {
                    return ((OrcArcher) getNewOcrs()).simpleAttackArcher(goalLightSide());
                }
            }
        }
        else
        if (getNewOcrs() instanceof OrcShaman) {
            switch (setdetachmentOrcs) {
                case 1: {
                    return ((OrcShaman) getNewOcrs()).magicBufDark(goalLightSide());
                }
                case 2: {
                    return ((OrcShaman) getNewOcrs()).magicAttack(goalLightSide());
                }
            }
        }
        if (getNewOcrs() instanceof OrcGoblin) {
            return ((OrcGoblin) getNewOcrs()).attackWarrior(goalLightSide());
        }
        else
            return 0;
    }

    public double retMethodPeople () {
        int setdetachmentPeople = random.nextInt(3-1) + 1;
        if (getNewPeople() instanceof PeopleCrossbowman) {
            switch (setdetachmentPeople) {
                case 1: {
                    return ((PeopleCrossbowman) getNewPeople()).attackShotArrow(goalDarkSide());
                }
                case 2: {
                    return ((PeopleCrossbowman) getNewPeople()).simpleAttackArcher(goalDarkSide());
                }
            }
        }
        else
        if (getNewPeople() instanceof PeopleMagician) {
            switch (setdetachmentPeople) {
                case 1: {
                    return ((PeopleMagician) getNewPeople()).magicBuf(goalDarkSide());
                }
                case 2: {
                    return ((PeopleMagician) getNewPeople()).magicAttack(goalDarkSide());
                }
            }
        }
        if (getNewPeople() instanceof PeopleWarrior) {
            return ((PeopleWarrior) getNewPeople()).attackWarrior(goalDarkSide());
        }
        else
            return 0;
    }

    public Object retMethodUndead () {
        int setdetachmentUndead = random.nextInt(3-1) + 1;
        if (getNewUndead() instanceof UndeadHunter) {
            switch (setdetachmentUndead) {
                case 1: {
                    return ((UndeadHunter) getNewUndead()).attackShotArrow(goalLightSide());
                }
                case 2: {
                    return ((UndeadHunter) getNewUndead()).simpleAttackArcher(goalLightSide());
                }
            }
        }
        else
        if (getNewUndead() instanceof UndeadNecromancer) {
            switch (setdetachmentUndead) {
                case 1: {
                    return ((UndeadNecromancer) getNewUndead()).magicBufDark(goalLightSide());
                }
                case 2: {
                    return ((UndeadNecromancer) getNewUndead()).magicAttack(goalLightSide());
                }
            }
        }
        if (getNewUndead() instanceof UndeadZombie) {
            return ((UndeadZombie) getNewUndead()).attackWarrior(goalLightSide());
        }
        else
            return 0;
    }

}
