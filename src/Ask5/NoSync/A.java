/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ask5.NoSync;

import Ask5.Sync.*;

/**
 *
 * @author atsolakid
 */
public class A extends Thread {

    Update u = new Update();

    public void run() {
        u.updatesum(12);
    }
}
