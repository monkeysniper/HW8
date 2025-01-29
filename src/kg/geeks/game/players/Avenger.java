package kg.geeks.game.players;

import java.util.Random;

public class Avenger extends Hero implements Fighter{
    public Avenger(int health, int damage, String name) {
        super(health, damage, name,SuperAbility .GAG);
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
        int chance = new Random().nextInt(1,6);

        if (chance == 3) {
            System.out.println("Avenger use shield");
            for (Hero hero : heroes) {
                hero.setHealth(hero.getHealth() + boss.getDamage());
            }
        }
    }
}