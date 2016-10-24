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
public class Syntest {
    public static void main(String args[])
 {
 A a=new A();
 Thread t1=new Thread(a);
 Thread t2=new Thread(a);
 t1.setName("First");
 t2.setName("Second");
 t1.start();
 t2.start();
 }
}
