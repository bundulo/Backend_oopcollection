package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    List<MilitaryUnit> units = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit){units.add(militaryUnit);}

    public void damageAll(int damage){
        for (int i = 0; i < units.size(); i++) {
            units.get(i).sufferDamage(damage);
            if (units.get(i).getHitPoints() < 25){
                units.remove(i);
                i--;
            }
        }
    }

    public int getArmyDamage(){
        int count = 0;
        for (int i = 0; i < units.size(); i++) {
            count += units.get(i).doDamage();
        }
        return count;
    }

    public int getArmySize(){return units.size();}
}