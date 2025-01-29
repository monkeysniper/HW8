package kg.geeks.game.players;

import java.util.Random;

public class Samurai extends Hero implements Fighter{
    public Samurai(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.HARAK);
    }

    @Override
    protected int setHealth() {
        return 0;
    }

    @Override
    public void attack(GameEntity entity) {
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int virus = new Random().nextInt(10,21);
        int healBoss = new Random().nextInt(20,41);
        int throwingStar = new Random().nextInt(2);
        if (throwingStar == 0) {
            boss.setHealth(boss.getHealth() - virus);
            System.out.println("Throwing star was with virus and damage was " + virus);
        }
        if (throwingStar == 1) {
            boss.setHealth(boss.getHealth() + healBoss);
            System.out.println("Throwing star was with heal and healed " + healBoss);
        }
    }
}
