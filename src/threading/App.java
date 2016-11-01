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
        //clock.run(); would casue the thread to never exit on ConsoleClock thus printing the same thing forever
        pause(4.0);
        clock.stopclock();
        println("Done.");
    }
}
