package com.andersen;

import com.andersen.skills.AttackShotArrow;

public abstract class Hero {
    private double health = 100;
    private boolean isBuffed;
    private String name = "person";
    protected Race race;

    public Hero (boolean isBuffed, Race race) {
        this.isBuffed = isBuffed;
        this.race = race;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName() {
        return name;
    }

    public double getHealht () {
        return health;
    }

    public double setHealth(double health) {
        this.health = health;
        return health;
    }

    public boolean isBuffed() {
        return isBuffed;
    }

    public boolean setBuffed(boolean buffed) {
        isBuffed = buffed;
        return buffed;
    }

    public boolean isLive () {
        return health > 0;
    }
}
