package day_03;

public interface Damagable {

    //no implementation means no body {}
    public void damage(int damage);
    public int getDamage();// add the return damage
    
    //an interface gives stronger guarantee that certain attributes/traits will be present
    
}
