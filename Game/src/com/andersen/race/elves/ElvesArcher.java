package com.andersen.race.elves;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.ReadFile;
import com.andersen.skills.AttackShotArrow;
import com.andersen.skills.SimpleAttackArcher;

public class ElvesArcher extends Hero implements AttackShotArrow, SimpleAttackArcher {

    ReadFile rf = new ReadFile();
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public ElvesArcher() {
        super(false, Race.elves);
    }

    @Override
    public String setName(String name) {
        return super.setName(ANSI_GREEN + "Лучник (Эльф) - " + rf.readFile() + " " + ANSI_RESET);
    }

    @Override
    public double attackShotArrow(Hero goal) {
        if (this.isBuffed()) {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) +" - (урон 3.5 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 3.5);
        }
        else {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 7 HP)");
            return goal.setHealth(goal.getHealht() - 7);
        }
    }

    @Override
    public double simpleAttackArcher(Hero goal) {
        if (this.isBuffed()) {
            System.out.println("Атака противника от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 1.5 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 1.5);
        }
        else {
            System.out.println("Атака противника от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 3 HP)");
            return goal.setHealth(goal.getHealht() - 3);
            }
    }

}
