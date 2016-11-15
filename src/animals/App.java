package animals;

import static kiss.API.*;
import java.util.*;

/**
 * @author West
 */
public class App {
    void testAnimals() {
        LinkedList<Animal> animals = new LinkedList<Animal>();
        animals.add(new Ferret("slim"));
        animals.add(new Ferret("tim"));
        animals.add(new Raven("poe"));
        animals.add(new DefaultBird("dee"));
        
        
        for (Animal animal : animals) {
            println("name: " + animal.getName());
        }
        
        for (Animal animal : animals) {
            if (animal instanceof DefaultBird) {
                DefaultBird bird = (DefaultBird) animal; //same casting notion as C/C++
                bird.fly();
                bird.layEgg();
            }
        }
    }
    
    void testPlatypus() {
        Platypus pete = new Platypus("pete");
        assert pete.isFurry() == true;
        pete.layEgg();
        println("and so does pete");
    }
    
    void testCollectionOfAnimals() {
        LinkedList<Animal> animals = new LinkedList<Animal>();
        animals.add(new Ferret("slim"));
        animals.add(new Ferret("tim"));
        animals.add(new Raven("poe"));
        animals.add(new DefaultBird("dee"));
        
        try (Close out = outExpect(
                "name: slim", EOL, 
                "name: tim", EOL, 
                "name: poe", EOL,
                "name: dee", EOL)) {
            for (Animal animal : animals) {
                println("name: " + animal.getName());
            }
        }
    }
    
    void testOnlyBirdsFly () {
        LinkedList<Animal> animals = new LinkedList<Animal>();
        animals.add(new Ferret("slim"));
        animals.add(new Ferret("tim"));
        animals.add(new Raven("poe"));
        animals.add(new DefaultBird("dee"));
        
        try (Close out = outExpect( 
                "flying...", EOL, 
                "(quietly)", EOL, 
                "flying...", EOL)) {
            for (Animal animal : animals) {
                if (animal instanceof DefaultBird) {
                    DefaultBird bird = (DefaultBird) animal; //same casting notion as C/C++
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
            DefaultBird bird = (DefaultBird) animals.getFirst();
        } catch (ClassCastException ex) {
            passed = true;
        }
        assert passed;
    }
}
