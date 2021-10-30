/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class TebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int randomNum = (int)(Math.random()*101);
        System.out.println("Hai.. nama saya Mr. Java,");
        System.out.println("saya telah memilih sebuah bilangan bulat secara ");
        System.out.println("acak antara 0 s/d 100.");
        System.out.println("Silakan tebak ya!!!”");
        
        //membuat boolean agar bisa melakukan loop
        boolean condition = true;                        
        while (condition == true){
            System.out.println("Masukan tebakan anda : ");
            int x = input.nextInt();
            if (x>randomNum){
                System.out.println("Wkwk.. bilangan terlalu besar");
            }else if (x<randomNum){
                System.out.println("Wkwk.. bilangan terlalu kecil");
            }else if (x==randomNum){
                System.out.println("Nice.. bilangan anda benar");
                break;
            }else {
                System.out.println("Seharusnya anda memasukan bilangan 1 s/d 100 :P");                
            }
        }
        
    }
    
}
