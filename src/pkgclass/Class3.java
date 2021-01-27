/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;
import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
// Class : Class3
public class Class3 {
    // Method : Method Static
    static void judulsewa(){
    System.out.println(" ");
    System.out.println("Penyewaan Pelampung Kusuma Agrowisata");
        
    }
    
    
     static void sewa() {
        // Input
        Scanner yo = new Scanner (System.in);
        System.out.println("Nama Penyewa : ");
        String nama = yo.nextLine();
        System.out.println("Banyak barang : ");
        int jumlah = yo.nextInt();
        int total = jumlah * 10000;
        System.out.println("Total : "+total);
     
    }
    
}
