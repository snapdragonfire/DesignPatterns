package org.example.Structural.AdapterDesignPattern;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{
    @Override
    public void weponAttack() {
        Random random = new Random();
        int damage = random.nextInt(10)+1;
        System.out.println("Enemy tank attack damage="+damage);
    }

    @Override
    public void driveForward() {
        Random random = new Random();
        int movement = random.nextInt(5)+1;
        System.out.println("Enemy tank moves "+movement+" steps forward");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName+" is driving the tank");
    }
}
