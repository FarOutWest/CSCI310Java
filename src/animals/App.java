package animals;

import static kiss.API.*;
import java.util.*;

/**
 *
 * @author West
 */
public class App {
    void testAnimals() {
        LinkedList<Animal> animals = new LinkedList<Animal>();
        animals.add(new Ferret("slim"));
        animals.add(new Ferret("tim"));
        animals.add(new Raven("poe"));
        animals.add(new Bird("dee"));
        
        for (Animal animal : animals) {
            println("name: " + animal.name);
        }
    }
}
