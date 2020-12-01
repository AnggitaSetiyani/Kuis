/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import java.util.Scanner;
import Daftar.Pendaftaran;


/**
 *
 * @author Anggita
 */
public class Main {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       int pilih,pil,jawab;
       
       
        
           System.out.println("FORM PENDAFTARAN PT. UDIN");
           System.out.println("1. Android Development");
           System.out.println("2. Web Development");
           System.out.print("Pilih Jenis Form : ");
           pilih = input.nextInt();
           
           switch(pilih)
           {
               case 1 :
                    System.out.println(" ");
                    System.out.println("FORM PENDAFTARAN");
                    System.out.println(" ");
                    System.out.print("Input NIK : ");
                    int nik = input.nextInt();
                    System.out.print("Input Nama : ");
                    input.nextLine();
                    String nama = input.nextLine();
                    System.out.print("Input Nilai Tes Tulis : ");
                    int tulis = input.nextInt();
                    System.out.print("Input Nilai Tes Coding : ");
                    int coding = input.nextInt();
                    System.out.print("Input Nilai Tes Wawancara : ");
                    int wawancara = input.nextInt();
                    Pendaftaran daf = new Pendaftaran(tulis, coding, wawancara);
                    
                    while(true)
                    {

                         System.out.println(" ");
                         System.out.println("Menu");
                         System.out.println("1. Edit");
                         System.out.println("2. Tampil");
                         System.out.println("3. Exit");
                         System.out.print("Pilih : ");
                         jawab = input.nextInt();

                         switch (jawab)
                         {
                             case 1 :
                                input = new Scanner(System.in);
                                
                                System.out.print("Input Nilai Tes Tulis : ");
                                daf.tulis = input.nextInt();
                                System.out.print("Input Nilai Tes Coding : ");
                                daf.coding = input.nextInt();
                                System.out.print("Input Nilai Tes Wawancara : ");
                                daf.wawancara = input.nextInt();
                                
                             break;

                             case 2 :
                                 System.out.println("Nilai Akhir " +daf.hasilAndro());
                                 if(daf.hasilAndro() >= 85){
                                     System.out.println("KETERANGAN : LOLOS ");
                                     System.out.println("Selamat kepada "+nama+" telah diterima sebagai Android");
                                 }
                                 else{
                                     System.out.println("KETERANGAN : GAGAL ");
                                     System.out.println("Mohon maaf kepada "+nama+" telah ditolak sebagai Android"); 
                                 }
                         
                             break;

                             case 3 :
                                 System.exit(0);
                         }
                    }
                    
                    
               
               case 2 :
                    System.out.println(" ");
                    System.out.println("FORM PENDAFTARAN");
                    System.out.println(" ");
                    System.out.print("Input NIK : ");
                    nik = input.nextInt();
                    System.out.print("Input Nama : ");
                    input.nextLine();
                    nama = input.nextLine();
                    System.out.print("Input Nilai Tes Tulis : ");
                    tulis = input.nextInt();
                    System.out.print("Input Nilai Tes Coding : ");
                    coding = input.nextInt();
                    System.out.print("Input Nilai Tes Wawancara : ");
                    wawancara = input.nextInt();
                    Pendaftaran tar = new Pendaftaran(tulis, coding, wawancara);
                    
                    
                    while(true)
                    {
                         System.out.println(" ");
                         System.out.println("Menu");
                         System.out.println("1. Edit");
                         System.out.println("2. Tampil");
                         System.out.println("3. Exit");
                         System.out.print("Pilih : ");
                         jawab = input.nextInt();

                         switch (jawab)
                         {
                             case 1 :
                                input = new Scanner(System.in);
                                
                                System.out.print("Input Nilai Tes Tulis : ");
                                tar.tulis = input.nextInt();
                                System.out.print("Input Nilai Tes Coding : ");
                                tar.coding = input.nextInt();
                                System.out.print("Input Nilai Tes Wawancara : ");
                                tar.wawancara = input.nextInt();
                             break;

                             case 2 :
                                 System.out.println("Nilai Akhir " +tar.hasilWeb());
                                 if(tar.hasilAndro() >= 85){
                                     System.out.println("KETERANGAN : LOLOS ");
                                     System.out.println("Selamat kepada "+nama+" telah diterima sebagai Web");
                                 }
                                 else{
                                     System.out.println("KETERANGAN : GAGAL ");
                                     System.out.println("Mohon maaf kepada "+nama+" telah ditolak sebagai Web"); 
                                 }
                         
                             break;

                             case 3 :
                                 System.exit(0);
                         }
                    }
                
           }
           
           
          
           
    }
}
