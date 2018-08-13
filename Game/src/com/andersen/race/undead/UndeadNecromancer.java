package com.andersen.race.undead;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.MagicAttack;
import com.andersen.skills.MagicBuffDark;

public class UndeadNecromancer extends Hero implements MagicAttack, MagicBuffDark {
    public UndeadNecromancer() {
        super(false, Race.undead);
    }

    @Override
    public String setName(String name) {
        return super.setName("Некромант (Зомби)");
    }

    @Override
    public double magicAttack(Hero goal) {
        if (this.isBuffed()) {
            System.out.println("Атака магией от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 5 HP)");
            return goal.setHealth(goal.getHealht() - 5);
        } else {
            System.out.println("Атака магией от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 10 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 10);
        }
    }

    @Override
    public boolean magicBufDark(Hero goal) {
        System.out.println("Нанесение недуга от: " + setName(getName()) + "на персонажа: " + goal.setName(getName()) + " -50% от урона");
        return goal.setBuffed(true);
    }

}
