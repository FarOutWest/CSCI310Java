package threading;

import static kiss.API.*;

public class ConsoleClock extends Thread {
    double startTime;
    public void start() {
        startTime=kiss.API.time();
        super.start();
    }
    
    public void run() {
        for (;;) {
            println("t=" + (time()-startTime));
            pause(1.0);
        }
    }
}
