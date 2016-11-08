package threading;

import static kiss.API.*;

/**
 * @author West
 */
public class App {
    
    void testCourses() {
        Courses courses = new Courses();
        courses.addCourse("Web 1");
        courses.addCourse("Java");
        courses.addCourse("Fitness Walking");
        courses.addCourse("Star Wars Appreciation");
        courses.addCourse("Software Engineering");

        Student Alice = new Student("Alice", courses);
        Student Bob = new Student("Bob", courses);
        Student Charlie = new Student("Charlie", courses);
        
        Chair Morgan = new Chair();
        Chair Payne = new Chair();
        
        pause(3);
        
        Alice.graduate();
        Bob.graduate();
        Charlie.graduate();
        //Morgan.retire(); these are mad broken 
        //Payne.retire();
    }

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
