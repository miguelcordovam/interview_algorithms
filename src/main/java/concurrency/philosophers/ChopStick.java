package concurrency.philosophers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ChopStick {

    private int id;
    Lock up = new ReentrantLock();

    public ChopStick(int id) {
        this.id = id;
    }

    public boolean pickUp(Philosopher philosopher, String where) throws InterruptedException {
        if (up.tryLock(10, TimeUnit.MILLISECONDS)) {
            System.out.println(philosopher + " picked up " + where + " " + this);
            return true;
        }
        return false;
    }

    public void putDown(Philosopher philosopher, String name) {
        up.unlock();
        System.out.println(philosopher + " put down " + name + " " + this);
    }

    @Override
    public String toString() {
        return "Chopstick-" + id;
    }

}
