package com.company;

/**
 * Created by falyanguzov on 09.11.2016.
 */
public abstract class Player {
    Hand hand = new Hand();
    private Intellect intellect;
    public String Name;
    public PlayerState state;

    public Player(Intellect intellect, String name) {
        this.intellect = intellect;
        this.Name = name;
    }

    public void take(Card current) {
        hand.add(current);
    }

    public Command decision() {
        return intellect.desideWithOverdraft(hand.countScore());
    }
}
