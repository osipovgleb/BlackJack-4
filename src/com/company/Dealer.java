package com.company;

/**
 * Created by falyanguzov on 09.11.2016.
 */
public class Dealer extends Computer {

    private Deck deck = new Deck();

    public Dealer() {
        super(new DealerIntellect());
    }

    public void deal(Player player) {
        Card current = this.deck.pop();
        player.take(current);
    }
}
