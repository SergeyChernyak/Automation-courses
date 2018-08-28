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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenereteDetachment {
        private Hero newElves;
        private Hero newPeople;
        private Hero newOcrs;
        private Hero newUndead;


    public Hero getNewElves() {
        return newElves;
    }

    public Hero getNewPeople() {
        return newPeople;
    }

    public Hero getNewOcrs() {
        return newOcrs;
    }

    public Hero getNewUndead() {
        return newUndead;
    }

    //Skill sk = new Skill();

    public Hero genereteElves () {
        Random randPerson = new Random();
        List<Hero> lightElves = new ArrayList<>();
        lightElves.add(new ElvesMagican());
        lightElves.add(new ElvesArcher());
        lightElves.add(new ElvesArcher());
        lightElves.add(new ElvesArcher());
        lightElves.add(new ElvesWarrior());
        lightElves.add(new ElvesWarrior());
        lightElves.add(new ElvesWarrior());
        lightElves.add(new ElvesWarrior());

        Hero personElves = lightElves.get(randPerson.nextInt(lightElves.size()));

        if (personElves instanceof ElvesArcher) {
            newElves = ((ElvesArcher) personElves);
        }
        if (personElves instanceof ElvesMagican) {
            newElves = ((ElvesMagican) personElves);
        }
        if (personElves instanceof ElvesWarrior) {
            newElves = ((ElvesWarrior) personElves);
        }
        return newElves;
    }



    public Hero genereteOrcs () {
        Random randPerson = new Random();

        List<Hero> darkOrcs = new ArrayList<>();
        darkOrcs.add(new OrcShaman());
        darkOrcs.add(new OrcArcher());
        darkOrcs.add(new OrcArcher());
        darkOrcs.add(new OrcArcher());
        darkOrcs.add(new OrcGoblin());
        darkOrcs.add(new OrcGoblin());
        darkOrcs.add(new OrcGoblin());
        darkOrcs.add(new OrcGoblin());

        Hero personOrc = darkOrcs.get(randPerson.nextInt(darkOrcs.size()));

        if (personOrc instanceof OrcShaman) {
            newOcrs = ((OrcShaman) personOrc);
        }
        if (personOrc instanceof OrcArcher) {
            newOcrs = ((OrcArcher) personOrc);
        }
        if (personOrc instanceof OrcGoblin) {
            newOcrs = ((OrcGoblin) personOrc);
        }
        return newOcrs;
    }


    public Hero generetePeople () {
        Random randPerson = new Random();
        List<Hero> lightPeople = new ArrayList<>();
        lightPeople.add(new PeopleMagician());
        lightPeople.add(new PeopleCrossbowman());
        lightPeople.add(new PeopleCrossbowman());
        lightPeople.add(new PeopleCrossbowman());
        lightPeople.add(new PeopleWarrior());
        lightPeople.add(new PeopleWarrior());
        lightPeople.add(new PeopleWarrior());
        lightPeople.add(new PeopleWarrior());

        Hero personPeople = lightPeople.get(randPerson.nextInt(lightPeople.size()));

        if (personPeople instanceof PeopleMagician) {
            newPeople = ((PeopleMagician) personPeople);
        }
        if (personPeople instanceof PeopleCrossbowman) {
            newPeople = ((PeopleCrossbowman) personPeople);
        }
        if (personPeople instanceof PeopleWarrior) {
            newPeople = ((PeopleWarrior) personPeople);
        }

        return newPeople;
    }

    public Hero genereteUndead () {
        Random randPerson = new Random();
        List<Hero> darkUndead = new ArrayList<>();
        darkUndead.add(new UndeadNecromancer());
        darkUndead.add(new UndeadHunter());
        darkUndead.add(new UndeadHunter());
        darkUndead.add(new UndeadHunter());
        darkUndead.add(new UndeadZombie());
        darkUndead.add(new UndeadZombie());
        darkUndead.add(new UndeadZombie());
        darkUndead.add(new UndeadZombie());

        Hero personUndead = darkUndead.get(randPerson.nextInt(darkUndead.size()));

        if (personUndead instanceof UndeadNecromancer) {
            newUndead = ((UndeadNecromancer) personUndead);
        }
        if (personUndead instanceof UndeadHunter) {
            newUndead = ((UndeadHunter) personUndead);
        }
        if (personUndead instanceof UndeadZombie) {
            newUndead = ((UndeadZombie) personUndead);
        }
        return newUndead;
    }

    public Hero lightSide () {
        Random randPerson = new Random();

        List<Hero> lightSide = new ArrayList<>();
        lightSide.add(genereteElves());
        lightSide.add(generetePeople());

        Hero personOnLightSide = lightSide.get(randPerson.nextInt(lightSide.size()));

        return personOnLightSide;
    }

    public Hero darkSide () {
        Random randPerson = new Random();

        List<Hero> darkSide = new ArrayList<>();
        darkSide.add(genereteOrcs());
        darkSide.add(genereteUndead());

        Hero personOnDarkSide = darkSide.get(randPerson.nextInt(darkSide.size()));

        return personOnDarkSide;
    }

}
