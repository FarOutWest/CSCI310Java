package threading;

import java.util.logging.Level;
import java.util.logging.Logger;
import static kiss.API.*;

/**
 * @author West
 */
public class Student {
    String name;
    Courses courses;
    volatile boolean matriculated = false;

    class Action extends Thread {
        public void run() {
            while (!matriculated) {
                pause(random(0,3000) * 0.001);
                println(name, " got ", courses.getCourses());
            }
        }
    }
    
    Action action;
    void graduate() { 
        matriculated = true; 
        try {
            action.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    Student(String _name, Courses _courses) {
        name = _name;
        courses = _courses;
        action = new Action();
        action.start();
    }
}
