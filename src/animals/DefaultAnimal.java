package animals;

/**
 *
 * @author West
 */
public class DefaultAnimal implements Animal {
    private String name;
    
    DefaultAnimal(String _name) {
        name = _name;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String _name) {
        name = _name;
    }
}
