package com.andersen.race.people;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.AttackWarrior;

public class PeopleWarrior extends Hero implements AttackWarrior {
    public PeopleWarrior(boolean isBuffed, Race race) {
        super(false, Race.people);
    }

    @Override
    public String setName(String name) {
        return super.setName("Воин (Человек)");
    }

    @Override
    public double attackWarrior(Hero goal) {
        System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 18 HP)");
        return goal.setHealth(goal.getHealht() - 18);
    }
}
