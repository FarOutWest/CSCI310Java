package threading;

import static kiss.API.*;

/**
 * @author West
 */
public class App {

    class Worker implements Runnable {
        @Override
        public void run() {
            println("Worker started.");
            pause(3.0);
            println("Worker done.");
        }
    }

    void run() {
        new Thread(() -> {
            pause(2.0);
            println("hi!");
        }).start(); //lambda
        Worker worker = new Worker();
        Thread workerThread = new Thread(worker);
        workerThread.start();
        //new Thread(new Worker()).start(); same as the three lines above so personal choice here
        ConsoleClock clock = new ConsoleClock();
        clock.start();
        //clock.run(); would casue the thread to never exit on ConsoleClock thus printing the same thing forever
        pause(4.0);
        clock.stopclock();
        println("Done.");
    }
}
