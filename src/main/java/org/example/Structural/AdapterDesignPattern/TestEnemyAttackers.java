package org.example.Structural.AdapterDesignPattern;

public class TestEnemyAttackers {
    public static void main(String[] args) {
        EnemyTank tank = new EnemyTank();

        EnemyRobot robo = new EnemyRobot();

        EnemyAttacker enemyRobotAdapter = new EnemyRobotAdapter(robo);

        System.out.println("The robo");
        robo.reactToHuman("HM");
        robo.attackWithClaws();
        robo.walksForward();

        System.out.println("\n");

        System.out.println("The tank");
        tank.weponAttack();
        tank.driveForward();
        tank.assignDriver("AKS");

        System.out.println("\n");

        System.out.println("The Enemy Robo Adapter");
        enemyRobotAdapter.assignDriver("KM");
        enemyRobotAdapter.weponAttack();
        enemyRobotAdapter.driveForward();
    }
}
