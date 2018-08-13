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

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ElvesArcher eArcher = new ElvesArcher();
        ElvesMagican eMagican = new ElvesMagican();
        ElvesWarrior eWarrior = new ElvesWarrior();

        OrcShaman oMagican = new OrcShaman();
        OrcArcher oArcher = new OrcArcher();
        OrcGoblin oGoblin = new OrcGoblin();

        PeopleMagician pMagican = new PeopleMagician();
        PeopleCrossbowman pCrossBovman = new PeopleCrossbowman();
        PeopleWarrior pWarrior = new PeopleWarrior();

        UndeadNecromancer uNecromant = new UndeadNecromancer();
        UndeadHunter uHunter = new UndeadHunter();
        UndeadZombie uZombie = new UndeadZombie();

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

        List<Hero> lightPeople = new ArrayList<>();
        lightPeople.add(new PeopleMagician());
        lightPeople.add(new PeopleCrossbowman());
        lightPeople.add(new PeopleCrossbowman());
        lightPeople.add(new PeopleCrossbowman());
        lightPeople.add(new PeopleWarrior());
        lightPeople.add(new PeopleWarrior());
        lightPeople.add(new PeopleWarrior());
        lightPeople.add(new PeopleWarrior());

        List<Hero> darkOrcs = new ArrayList<>();
        darkOrcs.add(new OrcShaman());
        darkOrcs.add(new OrcArcher());
        darkOrcs.add(new OrcArcher());
        darkOrcs.add(new OrcArcher());
        darkOrcs.add(new OrcGoblin());
        darkOrcs.add(new OrcGoblin());
        darkOrcs.add(new OrcGoblin());
        darkOrcs.add(new OrcGoblin());

        List<Hero> darkUndead = new ArrayList<>();
        darkUndead.add(new UndeadNecromancer());
        darkUndead.add(new UndeadHunter());
        darkUndead.add(new UndeadHunter());
        darkUndead.add(new UndeadHunter());
        darkUndead.add(new UndeadZombie());
        darkUndead.add(new UndeadZombie());
        darkUndead.add(new UndeadZombie());
        darkUndead.add(new UndeadZombie());

        Hero personElves = lightElves.get(randPerson.nextInt(lightElves.size()));
        Hero personPeople = lightPeople.get(randPerson.nextInt(lightPeople.size()));

        Hero personOrc = darkOrcs.get(randPerson.nextInt(darkOrcs.size()));
        Hero personUndead = darkUndead.get(randPerson.nextInt(darkUndead.size()));

        List<Hero> lightSide = new ArrayList<>();
        lightSide.add(personElves);
        lightSide.add(personPeople);

        List<Hero> darkSide = new ArrayList<>();
        darkSide.add(personOrc);
        darkSide.add(personUndead);

        Hero lightToStartGame = lightSide.get(randPerson.nextInt(lightSide.size()));
        Hero darkToSrartGame = darkSide.get(randPerson.nextInt(darkSide.size()));

        System.out.println(oMagican.magicBufDark(oArcher));
        System.out.println(oArcher.attackShotArrow(eArcher));
        System.out.println(oArcher.attackShotArrow(eArcher));

        System.out.println(uNecromant.magicBufDark(eArcher));
        System.out.println(eArcher.attackShotArrow(oArcher));
        System.out.println(eArcher.attackShotArrow(oArcher));
    }
}
