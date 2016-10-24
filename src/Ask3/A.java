/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ask3;

/**
 *
 * @author atsolakid
 */
public class A extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                yield();
            }
            System.out.println("A:" + i);
        }
        System.out.println("Exit from A:");
    }
}
