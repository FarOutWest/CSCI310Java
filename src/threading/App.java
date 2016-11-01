package threading;

import static kiss.API.*;

/**
 *
 * @author West
 */
public class App {
    void run() {
        ConsoleClock clock = new ConsoleClock();
        clock.start();
        pause(10.0);
        println("Done.");
    }
    
    
}
