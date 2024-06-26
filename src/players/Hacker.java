package players;

import game.RPG_Game;

public class Hacker extends Hero{

    public Hacker(int health, int damage, String name) {
        super(health, damage, name, SuperAbilityEnum.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int damage=boss.getHealth()- RPG_Game.random.nextInt(200);
        for (int i = 0; i < heroes.length; i++) {
            i = RPG_Game.random.nextInt(heroes.length);
            heroes[i].setHealth(heroes[i].getHealth()+damage);
            System.out.println("Хаккер забрал жизнь у босса");
            break;
        }
    }
}
