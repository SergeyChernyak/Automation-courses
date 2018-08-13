package com.andersen.race.orcs;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.MagicAttack;
import com.andersen.skills.MagicBuffDark;

public class OrcShaman extends Hero implements MagicAttack, MagicBuffDark {
    public OrcShaman() {
        super(false, Race.orcs);
    }

    @Override
    public String setName(String name) {
        return super.setName("Шаман (Орк)");
    }

    @Override
    public boolean magicBufDark(Hero goal) {
        System.out.println("Наложение баффа от: " + setName(getName()) + "на персонажа: " + goal.setName(getName()) + "+50% к урону");
        return goal.setBuffed(true);
    }

    @Override
    public double magicAttack(Hero goal) {
        if (isBuffed()) {
        System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 9 HP)");
        setBuffed(false);
        return goal.setHealth(goal.getHealht() - 9);
        }
        else {
            System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 6 HP)");
            return goal.setHealth(goal.getHealht() - 6);
            }
    }

}
