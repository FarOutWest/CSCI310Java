package animals;

import static kiss.API.*;
import java.util.*;

/**
 *
 * @author West
 */
public class DefaultBird extends DefaultAnimal implements Bird {
    DefaultBird(String _name) {
        super(_name);
        // make the bird part of the animal here
    }
    
    @Override
    public void fly() {
        println("flying...");
    }
    
    @Override
    public void layEgg() {
        println("birds lay eggs");
    }
}
