/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ask5.Sync;

/**
 *
 * @author atsolakid
 */
class Update {

    synchronized void updatesum(int i) {
        Thread t = Thread.currentThread();
        for (int n = 0; n < 5; n++) {
            System.out.println(t.getName() + ":" + (i + n));
        }
    }
}
