package com.andersen.race.undead;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.AttackWarrior;

public class UndeadZombie extends Hero implements AttackWarrior {
    public UndeadZombie(boolean isBuffed, Race race) {
        super(false, Race.undead);
    }

    @Override
    public String setName(String name) {
        return super.setName("Зомби (Зомби)");
    }

    @Override
    public double attackWarrior(Hero goal) {
        System.out.println("Удар копьем от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 18 HP)");
        return goal.setHealth(goal.getHealht() - 18);
    }
}
