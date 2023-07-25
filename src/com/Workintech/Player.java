package com.Workintech;
import com.Workintech.Weapon;
public class Player {
    private String name;
    private Weapon weapon;
    private int healthPercentage;

    public Player(String name, Weapon weapon, int healthPercentage) {
        this.name = name;
        this.weapon=weapon;
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage <= 0) {
            System.out.println(name + " player has been knocked out of the game");
        }
    }

    public void restoreHealth(int healthPotion) {
        if (healthPotion > 0) {
            this.healthPercentage += healthPotion;
            if (healthPercentage > 100) {
                this.healthPercentage = 100;
            }
        }
    }
}
