package com.andersen.race.people;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.ReadRandomName;
import com.andersen.skills.AttackWarrior;

public class PeopleWarrior extends Hero implements AttackWarrior {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    ReadRandomName rf = new ReadRandomName();

    public PeopleWarrior() {
        super(false, Race.people);
    }

    @Override
    public String setName(String name) {
        return super.setName(ANSI_BLUE + "Воин (Человек) - " + rf.readNameFromFile() + " " + ANSI_RESET);
    }

    @Override
    public double attackWarrior(Hero goal) {
        if (this.isBuffed()) {
            System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 9 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 9);
        }
        else {
            System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 18 HP)");
            return goal.setHealth(goal.getHealht() - 18);
        }
    }
}
