/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualankurma;

/**
 *
 * @author ASUS TUF A15
 */
public class Pelanggan extends Data {
  public void setNamapelanggan(String nama){
      super.nama=nama;
}
  public void setNotelp(String noTelp){
      super.noTelp=noTelp;
}
public void setAlamat(String alamat){
      super.alamat=alamat;
}


public void cetak(){
      super.Identitas();
}
}