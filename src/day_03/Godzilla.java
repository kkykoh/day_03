package day_03;

public class Godzilla extends Monster {


    //constructor
    public Godzilla() {
        setName("Godzilla");
        setHitPoints(1000); //remove the quotation marks, integers don't 
    }

    @Override
    public void damage(int damage) {
        int hitPoints = getHitPoints();
        setHitPoints(hitPoints-damage + 1);

    }
    
}
