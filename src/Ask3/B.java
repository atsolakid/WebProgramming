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
public class B extends Thread {

    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("B:" + j);
        }
        System.out.println("Exit from B:");
    }
}
