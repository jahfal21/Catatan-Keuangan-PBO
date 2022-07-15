/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Faris Izzi Asrori
 */
import java.util.Scanner;

public class Fitur {
    
    public void tampilMenu(){
        
        System.out.println("=== PROGRAM SKY WALLET ===");
        System.out.println();
        System.out.println("Fitur dalam aplikasi sky wallet : ");
        System.out.println();
        System.out.println("1. Catat pemasukan dan pengeluaran");
        System.out.println("2. Budgeting");
        System.out.println("3. Artikel");
        System.out.println("4. Catatan Bersama");
        System.out.println("0. Exit");
        System.out.println();
        System.out.print("Fitur apa yang ingin anda gunakan dalam aplikasi sky wallet : ");
        
    }
    
    public void fitur1(){
        
        int pemasukan,pengeluaran,masuk;
        pemasukan = 0;
        
        System.out.println();
        System.out.println("=== CATAT PEMASUKAN DAN PENGELUARAN ANDA ===");
        System.out.println();
        System.out.print("Pemasukan : ");
        
        Scanner inputan = new Scanner(System.in);
        masuk = inputan.nextInt();
        
        System.out.print("Pengeluaran : ");
        pengeluaran = inputan.nextInt();
        pemasukan = pemasukan + masuk;
        
        int hasil = pemasukan - pengeluaran;
        System.out.println("Total uang anda sekarang : " + hasil);
        
    }
    
    public void fitur2(){
        System.out.println();
        System.out.println("=== BUDGETING ===");
        System.out.println();
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Tuliskan jumlah uang yang anda miliki sekarang : ");
        int TotalUang = inputan.nextInt();
        
        System.out.println("Tuliskan berapa persen yang ingin anda gunakan untuk : ");
        System.out.println();
        System.out.print("Pendidikan: ");
        int SPPSekolah = inputan.nextInt();
        
        System.out.print("Sedekah: ");
        int Sedekah = inputan.nextInt();
        
        System.out.print("Jajan: ");
        int jajan = inputan.nextInt();
        
        System.out.print("Menabung: ");
        int menabung = inputan.nextInt();
        
        System.out.print("Biaya kost/rumah: ");
        int kost = inputan.nextInt();
        
        
        int uangpendidikan = (((TotalUang*SPPSekolah)/100));
        
        int uangsedekah = (((TotalUang*Sedekah)/100));
        
        int uangjajan = (((TotalUang*jajan)/100));
        
        int uangmenabung = (((TotalUang*menabung)/100));
        
        int uangkost = (((TotalUang*kost)/100));
        
        
        System.out.println();
        System.out.println("Biaya pendidikan yang harus dikeluarkan: " + uangpendidikan);
        System.out.println("Biaya sedekah yang harus dikeluarkan: " + uangsedekah);
        System.out.println("Biaya jajan yang harus dikeluarkan: " + uangjajan);
        System.out.println("Biaya menabung yang harus dikeluarkan: " + uangmenabung);
        System.out.println("Biaya kost/rumah yang harus dikeluarkan: " + uangkost);
        
    }
    
    
    public void fitur3(){
        System.out.println();
        System.out.println("=== ARTIKEL ===");
        System.out.println();
        System.out.println("Berikut ini adalah artikel yang dapat membantu anda dalam mengelola keuangan : ");
        System.out.println();
        System.out.println("judul : 5 cara mengelola keuangan engan baik an optimal");
        System.out.println("https://www.cimbniaga.co.id/id/inspirasi/perencanaan/5-cara-mengelola-keuangan-secara-baik-dan-optimal");
        System.out.println();
        System.out.println("judul : cara mengelola keuangan");
        System.out.println("https://www.jurnal.id/id/blog/mengelola-keuangan/");
    }
    
    
    public void fitur4(){
        System.out.println();
        int anggota,pemasukan,pengeluaran,total,n;
        
        Scanner scan= new Scanner(System.in);
        System.out.println("=== CATATAN BERSAMA ===");
        System.out.println();
        System.out.print("Jumlah anggota catatan bersama : ");
        n = scan.nextInt();
        anggota=1;pemasukan = 0;pengeluaran = 0;total = 0;
   
        while (anggota <= n){
            System.out.println();
            System.out.println("Anggota ke "+ anggota +" = ");
            System.out.print("Jumlah Pemasukan : ");
            int masukan = scan.nextInt();
            pemasukan = pemasukan + masukan;
            
            System.out.print("Jumlah Pengeluaran : ");
            int keluar = scan.nextInt();
            pengeluaran = pengeluaran + keluar;
            
            anggota++;
        }
        
        total = pemasukan - pengeluaran;
        
        System.out.println();
        System.out.println("Total Pemasukan : " + pemasukan);
        System.out.println("Total Pengeluaran : " + pengeluaran);
        System.out.println("Total Uang : " + total);
    }
}
