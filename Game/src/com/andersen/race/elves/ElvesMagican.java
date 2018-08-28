package com.andersen.race.elves;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.ReadFile;
import com.andersen.skills.MagicAttack;
import com.andersen.skills.MagicBuf;

public class ElvesMagican extends Hero implements MagicBuf, MagicAttack {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    ReadFile rf = new ReadFile();

    public ElvesMagican() {
        super(false, Race.elves);
    }

    @Override
    public String setName(String name) {
        return super.setName(ANSI_GREEN + "Маг (Эльф) - " + rf.readFile() + " " + ANSI_RESET);
    }

    @Override
    public double magicBuf(Hero goal) {
        System.out.println("Наложение улучшения от " + setName(getName()) + "на персонажа: " + goal.setName(getName()) + " - (+25% HP)");
        return goal.setHealth((goal.getHealht()) + (goal.getHealht() * 0.25));
    }

    @Override
    public double magicAttack(Hero goal) {
        if (this.isBuffed()) {
            System.out.println("Атака магией от : " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 5 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 5);
        } else {
            System.out.println("Атака магией от : " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 10 HP)");
            return goal.setHealth(goal.getHealht() - 10);
        }
    }
}
