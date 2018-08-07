package com.andersen.race.elves;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.AttackWarrior;

public class ElvesWarrior extends Hero implements AttackWarrior {
    public ElvesWarrior() {
        super(false, Race.elves);
    }

    @Override
    public String setName(String name) {
        return super.setName("Воин (Эльф)");
    }

    @Override
    public double attackWarrior(Hero goal) {
        System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 15 HP)");
        return goal.setHealth(goal.getHealht() - 15);
    }
}
