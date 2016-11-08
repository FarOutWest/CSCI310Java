package threading;

import java.util.logging.Level;
import java.util.logging.Logger;
import static kiss.API.*;

/**
 * @author West
 */
public class Chair {
    String name;
    Courses courses;
    volatile boolean retired = false;

    class Action extends Thread {
        public void run() {
            int count = 0;
            while (!retired) {
                pause(random(0,3000)*0.001);
                ++count;
                courses.addCourse(name + "'s great class # " + String.valueOf(count));
            }
        }
    }
    
    Action action;
    void retire() { 
        retired = true; 
        try {
            action.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
