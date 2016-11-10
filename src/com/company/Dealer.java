package com.company;

/**
 * Created by falyanguzov on 09.11.2016.
 */
public class Dealer extends AIPlayer {

    private Deck deck = new Deck();

    public void deal(APlayer player) {
        Card current = this.deck.pop();
        player.take(current);
    }
}
