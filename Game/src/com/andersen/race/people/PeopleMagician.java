package com.andersen.race.people;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.MagicAttack;
import com.andersen.skills.MagicBuf;

public class PeopleMagician extends Hero implements MagicBuf,MagicAttack {
    public PeopleMagician() {
        super(false, Race.people);
    }

    @Override
    public String setName(String name) {
        return super.setName("Маг (Человек)");
    }

    @Override
    public double magicAttack(Hero goal) {
        System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 4 HP)");
        return goal.setHealth(goal.getHealht() - 4);
    }

    @Override
    public double magicBuf(Hero goal) {
        System.out.println("Наложение улучшения от " + setName(getName()) + "на персонажа: " + goal.setName(getName()) + " - (+10% HP)");
        return goal.setHealth((goal.getHealht()) + (goal.getHealht() * 0.10));
    }
}
