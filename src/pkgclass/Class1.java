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
// Class : Class1
public class Class1 {
// Variabel : Variabel Instance
   String nama;
   int pesan;
   int hargamakan;
   int bayar;
   int kembali;
  
    void judulmakan(){
    System.out.println("E-MALANG CITY FRIED CHICKEN"); 
    System.out.println(" ");
    }
   
   
    void menumakan (){
    Scanner io = new Scanner (System.in);
    System.out.println("Masukkan Nama Anda : ");
    nama = io.nextLine();
    System.out.println("Pilihan : ");
    System.out.println("1.Paket Ayam Duk-Duk");
    System.out.println("2.Minuman");
    System.out.println("Masukkan Pilihan Menu Anda: ");
    pesan = io.nextInt();
    System.out.println(" ");
    
    switch (pesan) {
        case 1:
        System.out.println("Paket Duk-Duk");
        String[]menumakan = {"","Paket 1","Paket 2","Paket 3","Paket 4 (Tanpa nasi)","Paket 5 (Tanpa nasi)"};
        int[]hargamakan = {0,65000,55000,45000,35000,25000};
        for(int a=1;a<menumakan.length;a++)
        System.out.println(a+". "+menumakan[a]+" > "+hargamakan[a]);
        {
        System.out.println("Pilihan Anda : ");
        int pilih = io.nextInt();
        
        System.out.println("Uang yang dibayarkan : ");
        bayar = io.nextInt();
        if (bayar==hargamakan[pesan]){
            System.out.println("Uang Anda Pas");
        }else if (bayar > hargamakan[pesan]){
            kembali = bayar-hargamakan[pesan];
            System.out.println("Kembalian Anda Sebesar Rp. "+kembali);
        }else if (bayar < hargamakan[pesan]){
            int kurang = hargamakan[pesan]-bayar;
            System.out.println("Uang Anda Kurang Sebesar Rp. "+kurang);
        System.out.println(" ");
        }
        
        break;
        }
        
        case 2:
            
           System.out.println("Minuman");
        String[]menuminum = {"","Coca-Cola","Milo","Ovaltine","Friut Tea","Teh Botol Sosro"};
        int[]hargaminum = {0,15000,25000,20000,10000,10000};
        for(int a=1;a<menuminum.length;a++)
        System.out.println(a+". "+menuminum[a]+" > "+hargaminum[a]);
        {
        System.out.println("Pilihan Anda : ");
        int pilih = io.nextInt();
        
        System.out.println("Uang yang dibayarkan : ");
        bayar = io.nextInt();
        if (bayar==hargaminum[pesan]){
            System.out.println("Uang Anda Pas");
        }else if (bayar > hargaminum[pesan]){
            kembali = bayar-hargaminum[pesan];
            System.out.println("Kembalian Anda Sebesar Rp. "+kembali);
        }else if (bayar < hargaminum[pesan]){
            int kurang = hargaminum[pesan]-bayar;
            System.out.println("Uang Anda Kurang Sebesar Rp. "+kurang);
        System.out.println(" ");
        } 
            
            break;
    }
    }
    }
}