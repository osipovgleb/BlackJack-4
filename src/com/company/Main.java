package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Table t = new Table();
        t.TableInit();
        t.startRound();
        t.playRound();
        t.decideWinners();


    }
}
