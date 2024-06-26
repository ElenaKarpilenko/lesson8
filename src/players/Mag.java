package players;

public class Mag extends Hero{

    public Mag(int health, int damage, String name) {
        super(health, damage, name, SuperAbilityEnum.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
