package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    int health;
    int damage;
    boolean armor;

    public int doDamage(){return damage;}

    public void sufferDamage(int damage){
        if (armor){
           this.health -= (damage / 2);
        }else {
            this.health -= damage;
        }
    }
    public int getHitPoints(){return this.health;}
}
