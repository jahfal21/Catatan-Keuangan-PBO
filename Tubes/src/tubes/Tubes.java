/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Faris
 */

import java.util.Scanner;
import tubes.Fitur;
public class Tubes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pengguna = new Scanner(System.in);
        Fitur fiturs = new Fitur();
        int fitur;


        fiturs.tampilMenu();
        fitur = pengguna.nextInt();
        
        while (fitur != 0) {
            switch (fitur) {
                case 1:
                    fiturs.fitur1();
                    break;
                case 2:
                    fiturs.fitur2();
                    break;
                case 3:
                    fiturs.fitur3();
                    break;
                case 4:
                    fiturs.fitur4();
                    break;
                default:
                    break;
            }
            System.out.println(" ");
            fiturs.tampilMenu();
            fitur = pengguna.nextInt();
            
        }
        
        System.out.println(" ");
	System.out.println("                   BERHASIL KELUAR DARI PROGRAM SKY WALLET             ");
	System.out.println(" ");
        
    }
}

