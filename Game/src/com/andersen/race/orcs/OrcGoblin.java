package com.andersen.race.orcs;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.AttackWarrior;

public class OrcGoblin extends Hero implements AttackWarrior {
    public OrcGoblin() {
        super(false, Race.orcs);
    }

    @Override
    public String setName(String name) {
        return super.setName("Гоблин (Орк)");
    }

    @Override
    public double attackWarrior(Hero goal) {
        if (isBuffed()) {
            System.out.println("Атака дубинкой: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 30 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 30);
        }
        else {
            System.out.println("Атака дубинкой от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 20 HP)");
            return goal.setHealth(goal.getHealht() - 20);
        }
    }
}


