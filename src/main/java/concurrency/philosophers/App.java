package concurrency.philosophers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Philosopher[] philosophers = new Philosopher[5];

        try {

            ChopStick[] chopSticks = new ChopStick[5];

            for (int i = 0; i < 5; i++) {
                chopSticks[i] = new ChopStick(i);
            }

            for (int i = 0; i < 5; i++) {
                philosophers[i] = new Philosopher(i, chopSticks[i], chopSticks[(i + 1) % 5]);
                executorService.execute(philosophers[i]);
            }

            Thread.sleep(5000);

            for (Philosopher p : philosophers) {
                p.isFull = true;
            }

        } finally {
            executorService.shutdown();

            while (!executorService.isTerminated()) {
                Thread.sleep(1000);
            }

            for (Philosopher p : philosophers) {
                System.out.println(p + " => No of Turns to Eat = " + p.getNumberOfEatTurns());

            }
        }
    }
}
