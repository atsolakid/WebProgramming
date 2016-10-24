/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



//The most common difference is:
//
//When you extend Thread class, you can’t extend any other class which you require. 
//(As you know, Java does not allow inheriting more than one class). When you implement Runnable,
//you can save a space for your class to extend any other class in future or now.
//
//However, the significant difference is.
//
//When you extends Thread class, each of your thread creates unique object and associate with it. 
//When you implements Runnable, it shares the same object to multiple threads.


package Ask2;

/**
 *
 * @author atsolakid
 */
class RunEx1 extends Thread {

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

    public void execute() {
        System.out.println("Starting " + threadName);
        if (thr == null) {
            thr = new Thread(this, threadName);
            thr.start();
        }
    }
}


