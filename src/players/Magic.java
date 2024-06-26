package players;

public class Magic extends Hero{

    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbilityEnum.HEAL);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage()+30);
        }
    }
}
