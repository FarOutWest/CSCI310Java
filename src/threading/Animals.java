package threading;

import java.util.logging.Level;
import java.util.logging.Logger;
import static kiss.API.*;

/**
 * @author West
 */
public class Animals {
    String name;
    Foods foods;
    volatile boolean finishedeating = false;

    class Action extends Thread {
        public void run() {
            while (!finishedeating) {
                pause(random(0,3000) * 0.001);
                println(name, " got ", foods.getFoods());
            }
        }
    }
    
    Action action;
    void finishedeating() { 
        finishedeating = true; 
        try {
            action.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Animals.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    Animals(String _name, Foods _food) {
        name = _name;
        foods = _food;
        action = new Action();
        action.start();
    }
}
