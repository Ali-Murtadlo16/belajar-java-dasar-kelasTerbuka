package com.tutorial;

public class HeroIntelligent extends Hero {
    private int intelligence;

    // Constructor default tanpa parameter
    public HeroIntelligent() {
    }

    // Constructor dengan parameter
    public HeroIntelligent(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
