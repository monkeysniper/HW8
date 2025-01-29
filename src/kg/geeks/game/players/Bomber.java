package kg.geeks.game.players;

public class Bomber extends Hero implements Fighter{

    public Bomber(int health, int damage, String name) {
        super(health, damage, name,SuperAbility.CHIKIBAMBONI);
    }

    @Override
    protected int setHealth() {
        return 0;
    }


    @Override
    public void attack(GameEntity entity) {entity.setHealth(entity.getHealth() - this.getDamage());

    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int damage = 100;
        boolean isDead = false;
        if (this.getHealth() <= 0) {
            isDead = true;
        }
        if (boss.getHealth() >0 && isDead) {
            boss.setHealth(boss.getHealth() - damage);
            System.out.println("Dead");
        }
    }
}