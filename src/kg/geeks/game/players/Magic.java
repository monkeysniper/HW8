package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Magic extends Hero implements Fighter {
    private final int boost;

    public Magic(int health, int damage, String name, int boost) {
        super(health, damage, name, SuperAbility.BOOST);

        this.boost = boost;
    }


    @Override
    public void attack(GameEntity entity) {
        entity.setHealth(entity.getHealth() - this.getDamage());
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0 && hero != this && RPG_Game.roundNumber < 5) {
                hero.setDamage(hero.getDamage() + boost);

            }
        }   System.out.println("Magic добав силу всех на  " + boost );
    }

    @Override
    protected int setHealth() {
        return 0;
    }
}
