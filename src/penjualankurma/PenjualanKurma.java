/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualankurma;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF A15
 */
public class PenjualanKurma {


        public void menu () {
String[] kurma ={"Kurma Date Crown","Kurma Golden Valley","Kurma Palm Fruit"};
int[] harga ={80000,55000,100000};
    System.out.println ("=========================================");
    System.out.println ("=            Selamat Datang             =");
    System.out.println ("= Silahkan pilih Kurma yang di inginkan =");
    System.out.println ("|=======================================|");
    for (int i=0; i<kurma.length;i++){
        System.out.println (i+". "+kurma[i]+ " Harga = " +harga[i]);
    }
    Scanner input =new Scanner(System.in);
    System.out.println("");
    System.out.println("Masukkan nominal pembayaran anda : ");
int pembayaran;
            
            pembayaran = input.nextInt();
    System.out.println("Pilih Nomor Kurma sesuai keinginan anda");
int pilihan = input.nextInt();
    System.out.println("");
int kembalian;
    System.out.println("==========================");        
    System.out.println("" +kurma[pilihan]+" " +harga[pilihan]);
    kembalian = pembayaran-harga[pilihan];
    System.out.println("Kembalian anda adalah : "+kembalian);
    }

    }
    

