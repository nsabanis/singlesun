/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlesun.SingleSun;

/**
 *
 * @author nick.sabanis
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1. Calling Sun for the first time");
        Sun s = Sun.getUniqueSun();
        System.out.println("2. Calling Sun for the second time");
        Sun s2 = Sun.getUniqueSun();

        System.out.println("3. s == s2?");
        System.out.println(s == s2);
    }

}
