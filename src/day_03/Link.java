package day_03;

//link the hero

public class Link {

    //i want link to hit on damageable objects
    //this accepts any object that implements the Damagable interface
    public void hit(Damagable d) {
        d.damage(5);
    }



    // link hits on type 
    // public void hit(Monster m) {
    //     m.damage(5);
    // }

    
    // public void hit(Box b) {
    //     b.setIntegrity(b.getIntegrity()-5);
    // }
}
