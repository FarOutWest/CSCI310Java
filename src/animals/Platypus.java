package animals;

/**
 *
 * @author West
 */
public class Platypus extends DefaultMammal implements Bird {
    private DefaultBird birdness;
    
    public Platypus(String _name) {
        super(_name);
        birdness = new DefaultBird(_name);
    }

    @Override
    public void fly() {
        birdness.fly();
        birdness.getName();
        getName();
    }
    
    @Override 
    public void setName(String name) {
        birdness.setName(name);
        super.setName(name);
    }

    @Override
    public void layEgg() {
        birdness.layEgg();
    }
    
}
