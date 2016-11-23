package threading;

import java.util.logging.Level;
import java.util.logging.Logger;
import static kiss.API.*;

/**
 * @author West
 */
public class Keeper {
    String name;
    Foods foods;
    volatile boolean outoffood = false;

    class Action extends Thread {
        public void run() {
            int count = 0;
            while (!outoffood) {
                pause(random(0,3000)*0.001);
                ++count;
                foods.addFoods(name + "'s great food #" + String.valueOf(count));
            }
        }
    }
    
    Action action;
    void runoutoffood() { 
        outoffood = true; 
        try {
            action.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Animals.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
