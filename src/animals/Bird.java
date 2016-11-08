package animals;

import static kiss.API.*;
import java.util.*;

/**
 *
 * @author West
 */
public class Bird extends Animal {
    Bird(String _name) {
        super(_name);
        // make the bird part of the animal here
    }
    
    void fly() {
        println("flying...");
    }
}
