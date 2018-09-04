package com.andersen;

public class Main {

    public static void main(String[] args) {
//        ElvesArcher eArcher = new ElvesArcher();
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

        BattlePreparation start = new BattlePreparation();
        start.generateSquads();
    }

}

