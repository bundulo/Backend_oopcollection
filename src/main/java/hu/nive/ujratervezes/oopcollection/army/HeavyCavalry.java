package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{
    boolean firstAttack;

    public HeavyCavalry() {
        this.health = 150;
        this.damage = 20;
        this.armor = true;
        this.firstAttack = true;
    }

    @Override
    public int doDamage() {
        if (firstAttack = true){
            firstAttack = false;
            return this.damage * 3;
        }else {
            return super.doDamage();
        }
    }
}