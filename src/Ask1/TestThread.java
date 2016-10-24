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
public class TestThread {
 public static void main(String args[]) {

 RunEx1 first = new RunEx1( "--Thread(1)--");
 first.start();

 RunEx1 second = new RunEx1( "--Thread(2)--");
 second.start();
 }
}
