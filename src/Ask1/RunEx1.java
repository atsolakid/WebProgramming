/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ask1;

/**
 *
 * @author atsolakid
 */
class RunEx1 implements Runnable {

    private Thread thr;
    private String threadName;

    RunEx1(String name) {
        threadName = name;
        System.out.println("1.Create" + threadName);
    }

    @Override
    public void run() {
        System.out.println("2.Run " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // To thread σταματάει (sleep) για 500 milliseconds.
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thr == null) {
            thr = new Thread(this, threadName);
            thr.start();
        }
    }
}
