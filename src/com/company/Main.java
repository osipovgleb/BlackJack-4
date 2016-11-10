package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<APlayer> players = new LinkedList<APlayer>();
        Dealer dealer = new Dealer();

        players.add(new AIPlayer());
        players.add(new AIPlayer());
        players.add(new HumanPlayer());
        players.add(dealer);

        for(APlayer player: players){
            dealer.deal(player);
            dealer.deal(player);
        }
        for(APlayer player: players) {
            System.out.println(player.hand + " " + player.hand.countScore());
        }
        for(APlayer player: players)
            while(player.decision()!=Command.STAND){
                dealer.deal(player);
            }

        }
}
