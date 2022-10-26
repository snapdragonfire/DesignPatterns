package org.example.Structural.AdapterDesignPattern;

public class EnemyRobotAdapter implements EnemyAttacker{

    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot){
        enemyRobot = newRobot;
    }

    @Override
    public void weponAttack() {
        enemyRobot.attackWithClaws();
    }

    @Override
    public void driveForward() {
        enemyRobot.walksForward();
    }

    @Override
    public void assignDriver(String driverName) {
        enemyRobot.reactToHuman(driverName);
    }
}
