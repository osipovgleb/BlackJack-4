package com.company;

import java.util.LinkedList;

/**
 * Created by falyanguzov on 09.11.2016.
 */
public class Hand extends LinkedList<Card> {
    public int countScore(){
        int sum = 0;
        for(Card c: this)
            sum += c.getScore();
        return sum;
    }
}
