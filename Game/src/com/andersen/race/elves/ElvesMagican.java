package com.andersen.race.elves;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.MagicAttack;
import com.andersen.skills.MagicBuf;

public class ElvesMagican extends Hero implements MagicBuf, MagicAttack{

    public ElvesMagican() {
        super(false, Race.elves);
    }

    @Override
    public String setName(String name) {
        return super.setName("Маг (Эльф)");
    }

    @Override
    public double magicBuf(Hero goal) {
        System.out.println("Наложение улучшения от " + setName(getName()) + "на персонажа: " + goal.setName(getName()) + " - (+25% HP)");
        return goal.setHealth((goal.getHealht()) + (goal.getHealht() * 0.25));
        }

    @Override
    public double magicAttack(Hero goal) {
        System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 10 HP)");
        return goal.setHealth(goal.getHealht() - 10);
    }
}
