package com.andersen.race.orcs;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.MagicAttack;
import com.andersen.skills.MagicBuf;

public class OrcShaman extends Hero implements MagicAttack, MagicBuf {
    public OrcShaman() {
        super(false, Race.orcs);
    }

    @Override
    public String setName(String name) {
        return super.setName("Шаман (Орк)");
    }

    @Override
    public double magicBuf(Hero goal) {
        return setHealth(+5);
    }

    @Override
    public double magicAttack(Hero goal) {
        System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 6 HP)");
        return goal.setHealth(goal.getHealht() - 6);
    }
}
