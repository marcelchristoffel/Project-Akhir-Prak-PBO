/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.KTP;

/**
 *
 * @author Raditha & Yohanes Ageng
 */
public class Controller extends ControllerKTP {
   KTP ktp;
   Object[][] dktp = new Object[100][12];
    public Controller(KTP ktp){
       this.ktp = ktp;
    }
    
    public Object[][] index(){
       dktp = ktp.getKTP();
       return dktp;
   } 
    
    public void tambah(String nik, String nama, String ttl, String jk,String alamat, String rt, String rw, String kecamatan, String agama, String status, String pekerjaan, String kewarganegaraan, String masaberlaku){
        
        boolean found = false;
        for (int i = 0; dktp[i][0] != null; i++) {
            if(dktp[i][0].toString().equals(nik)){
                found = true;
                break;
            }
        }
        if(found){
            JOptionPane.showMessageDialog(null,"Data Sudah ada!!");
        } else {
            ktp.tambah(nik, nama, ttl, jk, alamat, rt, rw, kecamatan, agama, status, pekerjaan, kewarganegaraan, masaberlaku);
            JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan!!");
        }
    }
    
    public void update(String nik, String nama, String ttl, String jk,String alamat, String rt, String rw, String kecamatan, String agama, String status, String pekerjaan, String kewarganegaraan, String masaberlaku){
        boolean found = false;
        int index = -1;
        for (int i = 0; dktp[i][0] != null; i++) {
            if(dktp[i][0].toString().equals(nik)){
                index = i;
                found = true;
                break;
            }
        }
        if (found){
            ktp.update(dktp[index][0].toString(), nama, ttl, jk,alamat,rt, rw, kecamatan, agama, status, pekerjaan, kewarganegaraan, masaberlaku);
            JOptionPane.showMessageDialog(null,"Data KTP Berhasil Diupdate!!");
        } else {
           JOptionPane.showMessageDialog(null,"Data Tidak Ada!"); 
        }
    }
    public void hapus(String nik){
        boolean found = false;
        int index = -1;
        for (int i = 0; dktp[i][0] != null; i++) {
            if(dktp[i][0].toString().equals(nik)){
                index = i;
                found = true;
                break;
            }
        }
        if (found){
            ktp.hapus(dktp[index][0].toString());
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus!!");
        } else {
           JOptionPane.showMessageDialog(null,"Data Tidak Ada!"); 
        }
    }
}