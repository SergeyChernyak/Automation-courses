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

//        List<Hero> lightSide = new ArrayList<>();
//        lightSide.add(personElves);
//        lightSide.add(personPeople);
//
//        List<Hero> darkSide = new ArrayList<>();
//        darkSide.add(personOrc);
//        darkSide.add(personUndead);
//
//        Hero lightToStartGame = lightSide.get(randPerson.nextInt(lightSide.size()));
//        Hero darkToSrartGame = darkSide.get(randPerson.nextInt(darkSide.size()));
        private Hero newElves;

    public Hero getNewElves() {
        return newElves;
    }

    public Hero genereteElves () {
        Random randPerson = new Random();
        ArrayList<Hero> lightElves = new ArrayList<>();
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
        System.out.println("Person from generete - " + newElves);
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
            personOrc = ((OrcShaman) personOrc);
        }
        if (personOrc instanceof OrcArcher) {
            personOrc = ((OrcArcher) personOrc);
        }
            if (personOrc instanceof OrcGoblin) {
                personOrc = ((OrcGoblin) personOrc);
            }
        return personOrc;
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

        if (personPeople instanceof ElvesArcher) {
            personPeople = ((PeopleMagician) personPeople);
        }
        if (personPeople instanceof ElvesMagican){
            personPeople = ((PeopleCrossbowman) personPeople);
            if (personPeople instanceof ElvesWarrior) {
                personPeople = ((PeopleWarrior) personPeople);
            }
        }
        return personPeople;
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

        if (personUndead instanceof ElvesArcher) {
            personUndead = ((UndeadNecromancer) personUndead);
        }
        if (personUndead instanceof ElvesMagican){
            personUndead = ((UndeadHunter) personUndead);
            if (personUndead instanceof ElvesWarrior) {
                personUndead = ((UndeadZombie) personUndead);
            }
        }
        return personUndead;
    }

    public Hero rr () {
        Random randPerson = new Random();

        List<Hero> lightSide = new ArrayList<>();
        lightSide.add(genereteElves());
        lightSide.add(generetePeople());

        Hero personOnLightSide = lightSide.get(randPerson.nextInt(lightSide.size()));

        return personOnLightSide;
    }

}
