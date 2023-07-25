package com.Workintech;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = new Point(133,355);
        System.out.println( point1.distance(point2));
        System.out.println( point1.distance(34,98));
        System.out.println( point2.distance());

        Player player = new Player("Tolga",Weapon.AXE,5060);
        System.out.println(player.healthRemaining());
        player.loseHealth(30);
       player.loseHealth(70);
        System.out.println(player.healthRemaining());
        player.restoreHealth(67);
        player.restoreHealth(7888);
        System.out.println(player.healthRemaining());
    }
}