package com.andersen.race.undead;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.MagicAttack;
import com.andersen.skills.MagicBuf;

public class UndeadNecromancer extends Hero implements MagicAttack, MagicBuf {
    public UndeadNecromancer() {
        super(false, Race.undead);
    }

    @Override
    public String setName(String name) {
        return super.setName("Некромант (Зомби)");
    }

    @Override
    public double magicAttack(Hero goal) {
        System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 5 HP)");
        return goal.setHealth(goal.getHealht() - 5);
    }

    @Override
    public double magicBuf(Hero goal) {
        return 0;
    }
}
