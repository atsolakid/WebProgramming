/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

/**
 *
 * @author atsolakid
 */
import java.io.IOException;
import java.util.Random;

class Diktyakos_1 extends Thread {

    int[] num = new int[5];

    public Diktyakos_1() {
        setDaemon(true);
    }

    public static void main(String[] args) {
        Thread t1 = new Diktyakos_1();
        t1.start();
        System.out.println("Press Enter when you have had enough...\n");
        try {
            System.in.read(); // Wait until Enter key pressed
            t1.interrupt();
            System.out.println("Enter pressed...\n");
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Ending main()");
        return;
    }

    public int[] getArray() {
        return num;
    }

    public void run() {
        try {
            while (true) {
                Random random = new Random();
                for (int i = 0; i < 5; i++) {
                    num[i] = random.nextInt(9);
                    System.out.print(num[i] + " ");
                }
                System.out.println();
                sleep(300L);
            }
        } catch (InterruptedException e) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += num[i];
                System.out.println(num[i] + " ");
            }
            
            System.out.print("= " + sum);
            System.out.println();
        }
    }
}
