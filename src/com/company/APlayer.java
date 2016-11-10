package com.company;

/**
 * Created by falyanguzov on 09.11.2016.
 */
public abstract class APlayer {
    Hand hand = new Hand();
    private Intellect intellect;

    public APlayer(Intellect intellect) {
        this.intellect = intellect;
    }

    public void take(Card current) {
        hand.add(current);
    }

    public Command decision() {
        return intellect.decide();
    }
}
