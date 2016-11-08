package animals;

import static kiss.API.*;

/**
 *
 * @author West
 */
public class Ferret extends Animal {
    Ferret (String _name) {
        super(_name);
    }
    
    void scurry() {
        println("scurry!!!");
    }
}
