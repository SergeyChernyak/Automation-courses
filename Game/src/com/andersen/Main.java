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
//        ElvesMagican eMagican = new ElvesMagican();
//        ElvesWarrior eWarrior = new ElvesWarrior();
//
//        OrcShaman oMagican = new OrcShaman();
//        OrcArcher oArcher = new OrcArcher();
//        OrcGoblin oGoblin = new OrcGoblin();
//
//        PeopleMagician pMagican = new PeopleMagician();
//        PeopleCrossbowman pCrossBovman = new PeopleCrossbowman();
//        PeopleWarrior pWarrior = new PeopleWarrior();
//
//        UndeadNecromancer uNecromant = new UndeadNecromancer();
//        UndeadHunter uHunter = new UndeadHunter();
//        UndeadZombie uZombie = new UndeadZombie();

        GenereteDetachment detachmentStrart = new GenereteDetachment();

        //System.out.println(detachmentStrart.genereteElves());

        Skill start = new Skill();


        start.retMethodElves();

     //   start.retMethodOrcs();
    //  GenereteDetachment gen = new GenereteDetachment();
//
     //   gen.genereteElves();
     ///   gen.sss();



//        System.out.println(oMagican.magicBufDark(oArcher));
//        System.out.println(oArcher.attackShotArrow(eArcher));
//        System.out.println(oArcher.attackShotArrow(eArcher));
//
//        System.out.println(uNecromant.magicBufDark(eArcher));
//        System.out.println(eArcher.attackShotArrow(oArcher));
//        System.out.println(eArcher.attackShotArrow(oArcher));
//
//        System.out.println(uNecromant.magicBufDark(eArcher));
//
//        System.out.println(oArcher.attackShotArrow(uNecromant));
//
//        System.out.println(eArcher.attackShotArrow(oGoblin));
//        System.out.println(eArcher.attackShotArrow(oGoblin));

    }
}
