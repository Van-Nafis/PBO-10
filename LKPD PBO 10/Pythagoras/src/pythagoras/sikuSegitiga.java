/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoras;

/**
 *
 * @author Acer
 */
public class sikuSegitiga {
    
    void sisiSiku(int a, int c){
        int b = (c*c) - (a*a);
        System.out.println("Sisi sikunya adalah "+ Math.sqrt(b));
    }
}
