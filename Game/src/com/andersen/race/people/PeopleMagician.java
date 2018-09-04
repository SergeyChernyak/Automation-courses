package com.andersen.race.people;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.ReadRandomName;
import com.andersen.skills.MagicAttack;
import com.andersen.skills.MagicBuf;

public class PeopleMagician extends Hero implements MagicBuf,MagicAttack {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    ReadRandomName rf = new ReadRandomName();

    public PeopleMagician() {
        super(false, Race.people);
    }

    @Override
    public String setName(String name) {
        return super.setName(ANSI_BLUE + "Маг (Человек) - " + rf.readNameFromFile() + " " + ANSI_RESET);
    }

    @Override
    public double magicAttack(Hero goal) {
        if (this.isBuffed()) {
            System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 2 HP)");
            setBuffed(false);
            return goal.setHealth(goal.getHealht() - 2);
        }
        else {
            System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 4 HP)");
            return goal.setHealth(goal.getHealht() - 4);
        }
    }

    @Override
    public double magicBuf(Hero goal) {
        System.out.println("Наложение улучшения от " + setName(getName()) + "на персонажа: " + goal.setName(getName()) + " - (+10% HP)");
        return goal.setHealth((goal.getHealht()) + (goal.getHealht() * 0.10));
    }

}
