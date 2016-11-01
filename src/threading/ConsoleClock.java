package threading;

import java.util.logging.Level;
import java.util.logging.Logger;
import static kiss.API.*;

public class ConsoleClock extends Thread {
    volatile boolean running = false;
    double startTime;
    
    public void start() {
        startTime = kiss.API.time();
        super.start();
    }
    
    public void stopclock() {
        running = false;
        try {
            join(); //this join() method blocks the App thread and waits until the ConsoleClock thread exits
        } catch (InterruptedException ex) {
            Logger.getLogger(ConsoleClock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void run() {
        running = true;
        while (running) {
            pause(1.0);
            println("t = " + (time() - startTime));
        }
        /* for (;;) {
            println("t = " + (time() - startTime));
            pause(0.5);
        } */
    }
}
