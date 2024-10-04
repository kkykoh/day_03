package day_03;

public class Main {

    public static void main(String[] args) {

        Monster m = new Monster();
        m.setName("blahblah");
        m.setHitPoints(100);

        //System.out.printf("Name: %s. Hit points: %d", name, hitPoints));
        System.out.println(m);

        Link link = new Link();
        link.hit(m);

        System.out.println(m);

        Godzilla g = new Godzilla();
        System.out.println(g);

        link.hit(g);
        System.out.println(g);

        Box b = new Box();
        link.hit(b);

        Dog dog = new Dog();
        link.hit(dog);

        
        //why duplicate here
        Damagable d = b;

        // an interface in not a class, so you cannot instantiate it 
        // not possible to have an instant of a 
        // Damagable dd = new Damagable ();
    }
    
}
