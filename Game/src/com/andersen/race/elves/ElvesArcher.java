package com.andersen.race.elves;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.AttackShotArrow;
import com.andersen.skills.SimpleAttackArcher;

public class ElvesArcher extends Hero implements AttackShotArrow, SimpleAttackArcher {

    public ElvesArcher() {
        super(false, Race.elves);
    }

    @Override
    public String setName(String name) {
        return super.setName("Лучник (Эльф)");
    }

    @Override
    public double attackShotArrow(Hero goal) {
        System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 7 HP)");
        return goal.setHealth(goal.getHealht() - 7);
    }

    @Override
    public double simpleAttackArcher(Hero goal) {
        System.out.println("Атака противника от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 3 HP)");
        return goal.setHealth(goal.getHealht() - 3);
    }
}
