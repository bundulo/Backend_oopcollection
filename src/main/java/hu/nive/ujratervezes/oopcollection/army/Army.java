package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    List<MilitaryUnit> units = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit){units.add(militaryUnit);}

    public void damageAll(int damage){}

    public int getArmyDamage(){return 0;}

    public int getArmySize(){return units.size();}
}