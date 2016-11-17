package com.company;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by student4 on 17.11.16.
 */
public class Table {
    List<Player> players = new LinkedList<Player>();
    Dealer dealer = new Dealer();

    public void TableInit(){
        System.out.println("Enter your name please:");
        String name = HumanIntellect.in.nextLine();

        players.add(new Computer(new LimitIntellect(14)));
        players.add(new Computer(new LimitIntellect(20)));
        players.add(new Human(name));
        players.add(dealer);
    }

    public void startRound(){
        for (Player player : players) {
            dealer.deal(player);
            dealer.deal(player);
        }
    }

    public void playRound(){
        for (Player player : players) {
            Command command;
            do {
                System.out.println(player.Name + "] " + player.hand.countScore() + ": " + player.hand);
                command = player.decision();
                switch (command) {
                    case HIT:
                        dealer.deal(player);
                        break;
                }
            } while (command != Command.STAND);
        }
    }

    public void decideWinners(){
        for (Player player: players) {
            if(player!=dealer)
            {
                if (player.hand.countScore() > 21)
                    player.state = PlayerState.LOOSE;
                else if (dealer.hand.countScore() > 21)
                    player.state = PlayerState.WIN;
                else if (dealer.hand.countScore() < player.hand.countScore())
                    player.state = PlayerState.WIN;
                else
                    player.state = PlayerState.LOOSE;
                System.out.println(player.Name + " : "  + player.state);
            }

        }
    }
}
