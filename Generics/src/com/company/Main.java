package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items);
        FootballPlayer john = new FootballPlayer("John");
        BaseballPlayer tim = new BaseballPlayer("Tim");
        SoccerPlayer ian = new SoccerPlayer("Ian");

        Team<FootballPlayer> wolves = new Team<>("Wolves");
        wolves.addPlayer(john);
//        wolves.addPlayer(tim);
//        wolves.addPlayer(ian);

        System.out.println(wolves.numPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Wild Bats");
        baseballPlayerTeam.addPlayer(tim);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Ballers");
        soccerPlayerTeam.addPlayer(ian);

        Team<FootballPlayer> sheeps = new Team<>("Sheeps");
        Team<FootballPlayer> bulls = new Team<>("Bulls");

        sheeps.matchResult(bulls, 8, 1);
        sheeps.matchResult(wolves, 5, 9);

        wolves.matchResult(bulls, 6, 2);
        wolves.matchResult(sheeps, 3, 3);

        System.out.println("Rankings");
        System.out.println(wolves.getName() + ": " +wolves.ranking());
        System.out.println(sheeps.getName() + ": " +sheeps.ranking());
        System.out.println(bulls.getName() + ": " +bulls.ranking());

        System.out.println(wolves.compareTo(sheeps));
        System.out.println(wolves.compareTo(bulls));
        System.out.println(bulls.compareTo(sheeps));

    }

//    private static void printDoubled (ArrayList<Integer> n) {
//        for (int i : n) {
//            System.out.println((i * 2));
//        }
//    }
}
