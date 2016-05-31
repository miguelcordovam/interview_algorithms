package concurrency.philosophers;

import java.util.Random;

public class Philosopher implements Runnable{

    private int id;
    private ChopStick leftChopstick;
    private ChopStick rightChopstick;

    volatile boolean isFull = false;
    private Random randomGenerator = new Random();
    private int numberOfEatTurns = 0;

    public Philosopher(int id, ChopStick leftChopstick, ChopStick rightChopstick) {
        this.id = id;
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;
    }

    @Override
    public void run() {

        try {
            while (!isFull) {
                think();

                if (leftChopstick.pickUp(this, "left")) {
                    if (rightChopstick.pickUp(this, "right")){
                        eat();
                        rightChopstick.putDown(this, "right");
                    }
                    leftChopstick.putDown(this, "left");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    private void think() throws InterruptedException{
        System.out.println(this + " is thinking");
        Thread.sleep(randomGenerator.nextInt(1000));
    }

    private void eat() throws InterruptedException {
        System.out.println(this + " is eating");
        numberOfEatTurns++;
        Thread.sleep(randomGenerator.nextInt(1000));
    }

    public int getNumberOfEatTurns() {
        return numberOfEatTurns;
    }

    @Override
    public String toString() {
        return "Philosopher-" + id;
    }
}
