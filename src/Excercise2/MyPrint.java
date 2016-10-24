/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise2;

/**
 *
 * @author atsolakid
 */
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyPrint implements Runnable {

    private int x;
    static int sum = 0;
    static int count = 0;

    public void run() {
        while (true) {
            x = (int) (Math.random() * 9);
            System.out.print(x);
            add(x);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyPrint.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public synchronized void add(int x) {
        if (count == 5) {
            sum = 0;
            sum += x;
            count = 0;
            count++;
        } else {
            sum += x;
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new MyPrint());
        Thread t2 = new Thread(new MyPrint());
        Thread t3 = new Thread(new MyPrint());
        Thread t4 = new Thread(new MyPrint());
        Thread t5 = new Thread(new MyPrint());

        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        t4.setDaemon(true);
        t5.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try {
            System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(MyPrint.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Ending main()");
    }
}
