package com.andersen.race.elves;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.ReadFile;
import com.andersen.skills.AttackWarrior;

public class ElvesWarrior extends Hero implements AttackWarrior {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    ReadFile rf = new ReadFile();

    public ElvesWarrior() {
        super(false, Race.elves);
    }

    @Override
    public String setName(String name) {
        return super.setName(ANSI_GREEN + "Воин (Эльф) - " + rf.readFile() + " " + ANSI_RESET);
    }

    @Override
    public double attackWarrior(Hero goal) {
        if (this.isBuffed()) {
            System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 7.5 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 7.5);
        }
        else {
            System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 15 HP)");
            return goal.setHealth(goal.getHealht() - 15);
        }
    }
}
