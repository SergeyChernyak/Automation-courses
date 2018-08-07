package com.andersen.race.people;

import com.andersen.Hero;
import com.andersen.Race;
import com.andersen.skills.AttackShotArrow;
import com.andersen.skills.SimpleAttackArcher;

public class PeopleCrossbowman extends Hero implements AttackShotArrow, SimpleAttackArcher {

    public PeopleCrossbowman(boolean isBuffed, Race race) {
        super(isBuffed, Race.people);
    }

    @Override
    public String setName(String name) {
        return super.setName("Арбалетчик (Человек)");
    }

    @Override
    public double attackShotArrow(Hero goal) {
        System.out.println("Выстрел из арбалета от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 5 HP)");
        return goal.setHealth(goal.getHealht() - 5);
    }

    @Override
    public double simpleAttackArcher(Hero goal) {
        System.out.println("Атака от: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 3 HP)");
        return goal.setHealth(goal.getHealht() - 3);
    }
}
