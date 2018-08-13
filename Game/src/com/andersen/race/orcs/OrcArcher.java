package com.andersen.race.orcs;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.AttackShotArrow;
import com.andersen.skills.SimpleAttackArcher;

public class OrcArcher extends Hero implements AttackShotArrow, SimpleAttackArcher {

    public OrcArcher() {
        super(false, Race.orcs);
    }

    @Override
    public String setName(String name) {
        return super.setName("Лучник (Орк)");
    }

    @Override
    public double attackShotArrow(Hero goal) {
        if (isBuffed() == true) {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 6 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 6);
        }
        else {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 3 HP)");
            return goal.setHealth(goal.getHealht() - 3);
        }
    }

    @Override
    public double simpleAttackArcher(Hero goal) {
        if (isBuffed()) {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 4 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 4);
        }
        else {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 2 HP)");
            return goal.setHealth(goal.getHealht() - 2);
        }
    }
}
