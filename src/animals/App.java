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
        
        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                Bird bird = (Bird) animal; //same casting notion as C/C++
                bird.fly();
            }
        }
    }
    
    void testCollectionOfAnimals() {
        LinkedList<Animal> animals = new LinkedList<Animal>();
        animals.add(new Ferret("slim"));
        animals.add(new Ferret("tim"));
        animals.add(new Raven("poe"));
        animals.add(new Bird("dee"));
        
        try (Close out = outExpect(
                "name: slim", EOL, 
                "name: tim", EOL, 
                "name: poe", EOL,
                "name: dee", EOL)) {
            for (Animal animal : animals) {
                println("name: " + animal.name);
            }
        }
    }
    
    void testOnlyBirdsFly () {
        LinkedList<Animal> animals = new LinkedList<Animal>();
        animals.add(new Ferret("slim"));
        animals.add(new Ferret("tim"));
        animals.add(new Raven("poe"));
        animals.add(new Bird("dee"));
        
        try (Close out = outExpect( 
                "flying...", EOL, 
                "(quietly)", EOL, 
                "flying...", EOL)) {
            for (Animal animal : animals) {
                if (animal instanceof Bird) {
                    Bird bird = (Bird) animal; //same casting notion as C/C++
                    bird.fly();
                }
            }   
        }
    }
    
    void testCastException () {
        LinkedList<Animal> animals = new LinkedList<Animal>();
        animals.add(new Ferret("slim"));
        
        boolean passed = false;
        try {
            Bird bird = (Bird) animals.getFirst();
        } catch (ClassCastException ex) {
            passed = true;
        }
        assert passed;
    }
}
