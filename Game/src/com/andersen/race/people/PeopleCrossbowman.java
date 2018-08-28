package com.andersen.race.people;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.ReadFile;
import com.andersen.skills.AttackShotArrow;
import com.andersen.skills.SimpleAttackArcher;

public class PeopleCrossbowman extends Hero implements AttackShotArrow, SimpleAttackArcher {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    ReadFile rf = new ReadFile();

    public PeopleCrossbowman() {
        super(false, Race.people);
    }

    @Override
    public String setName(String name) {
        return super.setName(ANSI_BLUE + "Арбалетчик (Человек) - " + rf.readFile() + " " + ANSI_RESET);
    }

    @Override
    public double attackShotArrow(Hero goal) {
        if (this.isBuffed()) {
            System.out.println("Выстрел из арбалета от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 2.5 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 2.5);
        }
        else {
            System.out.println("Выстрел из арбалета от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 5 HP)");
            return goal.setHealth(goal.getHealht() - 5);
        }
    }

    @Override
    public double simpleAttackArcher(Hero goal) {
        if (this.isBuffed()) {
            System.out.println("Атака от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 1.5 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 1.5);
        }
        else {
            System.out.println("Атака от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 3 HP)");
            return goal.setHealth(goal.getHealht() - 3);
        }
    }
}
