package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {
    boolean isHavingShield;

    public Swordsman(boolean armor){
        this.health = 100;
        this.damage = 10;
        this.armor = armor;
        this.isHavingShield = true;

    }

    @Override
    public void sufferDamage(int damage) {
        if (isHavingShield = true){
            isHavingShield = false;
        }else {
            super.sufferDamage(damage);
        }
    }
}