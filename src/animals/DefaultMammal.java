package animals;

/**
 *
 * @author West
 */
public class DefaultMammal extends DefaultAnimal implements Mammal{

    public DefaultMammal(String _name) {
        super(_name);
    }

    @Override
    public boolean isFurry() {
        return true;
    }   
}
