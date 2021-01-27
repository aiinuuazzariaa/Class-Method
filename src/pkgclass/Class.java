/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author MOKLET-2
 */
// Class : Class
public class Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Output
        Class1 hai = new Class1();
        hai.judulmakan();
        hai.menumakan();
        
        Class2 halo = new Class2();
        System.out.println(halo.KOSONG());
        System.out.println(halo.JUDUL());
        System.out.println(halo.NAMA());
        System.out.println(halo.TTL());
        System.out.println(halo.ALAMAT());
        System.out.println(halo.SEKOLAH());
        System.out.println(halo.KELAS());
        System.out.println(halo.ORTU());
        
        Class3 hy = new Class3();
        hy.judulsewa();
        hy.sewa();
    
    }
    
}
