package animals;

import static kiss.API.*;
import java.util.*;

/**
 *
 * @author West
 */
public class Raven extends Bird {
    Raven (String _name) {
        super(_name);
        // make the raven part of the bird here
    }
    
    void quoth() {
        println("nevermore...");
    }
    
    @Override //not a requirement for redefinition but it is a good habbit
    void fly() {
        super.fly();
        println("(quietly)");
    }
}
