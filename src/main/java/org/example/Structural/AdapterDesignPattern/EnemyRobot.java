package org.example.Structural.AdapterDesignPattern;

import java.util.Random;

public class EnemyRobot {

    Random random = new Random();

    public void attackWithClaws(){
        int damage = random.nextInt(10)+1;
        System.out.println("Enemy robot causes "+damage+" damage");
    }

    public void walksForward(){
        int movement = random.nextInt(5)+1;
        System.out.println("Enemy robot walks "+movement+" spaces forward");
    }

    public void reactToHuman(String driverName){
        System.out.println("Enemy robot tramps on "+driverName);
    }
}
