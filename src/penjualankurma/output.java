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
public class output {
    public static void main(String[] args){
   
PenjualanKurma u =new PenjualanKurma();
   u.menu();

   Pelanggan t = new Pelanggan();
   t.setNamapelanggan("Ryu");
   t.setNotelp("082343241424");
   t.setAlamat("Jl.Ban No.51,Malang");
   t.cetak();
}
}