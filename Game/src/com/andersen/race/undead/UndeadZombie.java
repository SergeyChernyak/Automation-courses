package com.andersen.race.undead;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.AttackWarrior;

public class UndeadZombie extends Hero implements AttackWarrior {
    public UndeadZombie() {
        super(false, Race.undead);
    }

    @Override
    public String setName(String name) {
        return super.setName("Зомби (Зомби)");
    }

    @Override
    public double attackWarrior(Hero goal) {
        if (isBuffed() == true) {
            System.out.println("Удар копьем от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 36 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 36);
        }
        else {
            System.out.println("Удар копьем от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 18 HP)");
            return goal.setHealth(goal.getHealht() - 18);
        }
    }
}
