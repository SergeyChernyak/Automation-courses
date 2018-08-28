package com.andersen.race.orcs;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.ReadFile;
import com.andersen.skills.MagicAttack;
import com.andersen.skills.MagicBuffDark;

public class OrcShaman extends Hero implements MagicAttack, MagicBuffDark {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    ReadFile rf = new ReadFile();

    public OrcShaman() {
        super(false, Race.orcs);
    }

    @Override
    public String setName(String name) {
        return super.setName(ANSI_YELLOW + "Шаман (Орк) - " + rf.readFile() + " " + ANSI_RESET);
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
