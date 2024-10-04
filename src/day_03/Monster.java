package day_03;

public class Monster implements Damagable {

    private String name;
    private int hitPoints;
    
    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void damage(int damage){
        this.hitPoints -= damage;
    }

    public int getDamage() {
        return this.hitPoints;
    }

    @Override
    public String toString() {
        return "{NAME : %s. HITPOINTS: %d.}". formatted(name, hitPoints);
    }
}
