package com.andersen.race.undead;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.ReadFile;
import com.andersen.skills.AttackShotArrow;
import com.andersen.skills.SimpleAttackArcher;

public class UndeadHunter extends Hero implements AttackShotArrow, SimpleAttackArcher {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    ReadFile rf = new ReadFile();

    public UndeadHunter() {
        super(false, Race.undead);
    }

    @Override
    public String setName(String name) {
        return super.setName(ANSI_PURPLE + "Охотник (Зомби) - " + rf.readFile() + " " + ANSI_RESET);
    }

    @Override
    public double attackShotArrow(Hero goal) {
        if (isBuffed() == true) {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 8 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 8);
        }
        else {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 4 HP)");
            return goal.setHealth(goal.getHealht() - 4);
        }
    }

    @Override
    public double simpleAttackArcher(Hero goal) {
        if (isBuffed()) {
            System.out.println("Атака от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 4 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 4);
        }
        else {
            System.out.println("Атака от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 2 HP)");
            return goal.setHealth(goal.getHealht() - 2);
        }
    }
}
