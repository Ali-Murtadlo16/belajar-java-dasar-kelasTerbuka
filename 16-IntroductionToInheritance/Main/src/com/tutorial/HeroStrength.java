package com.tutorial;

public class HeroStrength extends Hero {
    private int strength;

    // Constructor default tanpa parameter
    public HeroStrength() {
    }

    // Constructor dengan parameter
    public HeroStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
}
