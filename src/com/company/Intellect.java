package com.company;

/**
 * Created by falyanguzov on 10.11.2016.
 */
public abstract class Intellect {
    public abstract Command decide(int score);
    public Command desideWithOverdraft(int score){
        if(score > 21)
            return Command.STAND;
        else
            return decide(score);
    }
}
