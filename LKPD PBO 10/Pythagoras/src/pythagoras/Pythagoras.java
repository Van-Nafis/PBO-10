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
import java.util.Scanner;

public class Pythagoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Menu
        System.out.println("Selamat datang, silahkan pilih menu di bawah");
        System.out.println("1. Cek triple pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga");
        System.out.println("3. Menentukan sisi siku-siku segitiga");
        System.out.println("4. Exit");
        System.out.println("-----------------------------------------------");
        
        //Memilih
        System.out.println("Silahkan tentukan plihan anda : ");
        int x = input.nextInt();
        
        //While dan Swicth
        
        switch (x){
            case 1 :
                System.out.println("Silahkan masukan data segitiga ");
                System.out.println("Sisi A : ");
                int a = input.nextInt();
                System.out.println("Sisi B : ");
                int b = input.nextInt();
                System.out.println("Sisi C : ");
                int c = input.nextInt();
                
                triplePythagoras tP = new triplePythagoras();
                tP.luas(a, b, c);
                break;
                
            case 2 :
                System.out.println("Silahkan masukan data segitiga ");
                System.out.println("Sisi depan : ");
                int a2 = input.nextInt();
                System.out.println("Sisi samping : ");
                int b2 = input.nextInt();
                
                sisiMiring sM = new sisiMiring();
                sM.sisiMiring(a2, b2);
                break;
                
            case 3 :
                System.out.println("Silahkan masukan data segitiga ");
                System.out.println("Sisi miring : ");
                int c3 = input.nextInt();
                System.out.println("Sisi samping/depan : ");
                int ab = input.nextInt();
                
                sikuSegitiga sS = new sikuSegitiga();
                sS.sisiSiku(ab, c3);
                break;
                
            case 4 :
                System.out.println("Terimakasih");
                System.exit(0);
                
            default :
                System.out.println("Pilihan yang anda masukan tidak valid,");
                System.out.println("Silahkan pilih antara 1, 2, 3 atau 4");
        
    }
        
        
    }
    
}
