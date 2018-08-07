package com.andersen.race.undead;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.AttackShotArrow;
import com.andersen.skills.SimpleAttackArcher;

public class UndeadHunter extends Hero implements AttackShotArrow, SimpleAttackArcher {
    public UndeadHunter(boolean isBuffed, Race race) {
        super(false, Race.undead);
    }

    @Override
    public String setName(String name) {
        return super.setName("Охотник (Зомби)");
    }

    @Override
    public double attackShotArrow(Hero goal) {
        System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 4 HP)");
        return goal.setHealth(goal.getHealht() - 4);
    }

    @Override
    public double simpleAttackArcher(Hero goal) {
        System.out.println("Атака от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 2 HP)");
        return goal.setHealth(goal.getHealht() - 2);
    }
}
