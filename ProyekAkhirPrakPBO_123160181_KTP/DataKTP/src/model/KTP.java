/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.Connector;
import java.sql.ResultSet;
/**
 *
 * @author Raditha & Yohanes Ageng
 */
public class KTP {
    public Connector DB;
    public KTP(Connector DB){
        this.DB = DB;
    }
    
    public Object[][] getKTP(){
        Object[][] ktp = new Object[100][13];
        try{
            DB.statement = DB.koneksi.createStatement();
            ResultSet result = DB.statement.executeQuery("SELECT * FROM `ktp`");
            
            int i = 0;
            while(result.next()){
                ktp[i][0] = result.getString("nik");
                ktp[i][1] = result.getString("nama");
                ktp[i][2] = result.getString("ttl");
                ktp[i][3] = result.getString("jk");
                ktp[i][4] = result.getString("alamat");
                ktp[i][5] = result.getString("rt");
                ktp[i][6] = result.getString("rw");
                ktp[i][7] = result.getString("kecamatan");
                ktp[i][8] = result.getString("agama");
                ktp[i][9] = result.getString("status");
                ktp[i][10] = result.getString("pekerjaan");
                ktp[i][11] = result.getString("kewarganegaraan");
                ktp[i][12] = result.getString("masaberlaku");
                i++;
            }
            DB.statement.close();
        } catch(Exception err){
            System.out.println(err);
        }
        return ktp;
    }
    
    public void tambah(String nik, String nama, String ttl,String jk,String alamat, String rt, String rw, String kecamatan, String agama, String status, String pekerjaan, String kewarganegaraan, String masaberlaku){
        try{
            DB.statement = DB.koneksi.createStatement(); 
            String query = "INSERT INTO `ktp` (`nik`, `nama`, `ttl`, `jk`, `alamat`, `rt`, `rw`, `kecamatan`, `agama`, `status`, `pekerjaan`, `kewarganegaraan`, `masaberlaku`) VALUES ('"+nik+"', '"+nama+"', '"+ttl+"','"+jk+"','"+alamat+"', '"+rt+"', '"+rw+"', '"+kecamatan+"', '"+agama+"', '"+status+"', '"+pekerjaan+"', '"+kewarganegaraan+"', '"+masaberlaku+"')";
            DB.statement.execute(query);
        }catch(Exception err){
            System.out.println(err);
        }
    }
    
    public void update(String nik, String nama, String ttl,String jk,String alamat, String rt, String rw, String kecamatan, String agama, String status, String pekerjaan, String kewarganegaraan, String masaberlaku){
        try{
            DB.statement = DB.koneksi.createStatement(); 
            String query = "UPDATE `ktp` SET `nama` = '"+nama+"', `ttl` = '"+ttl+"',`jk` = '"+jk+"', `alamat` = '"+alamat+"', `rt` = '"+rt+"', `rw` = '"+rw+"', `kecamatan` = '"+kecamatan+"', `agama` = '"+agama+"', `status` = '"+status+"', `pekerjaan` = '"+pekerjaan+"', `kewarganegaraan` = '"+kewarganegaraan+"', `masaberlaku` = '"+masaberlaku+"' WHERE `ktp`.`nik` = '" +nik+ "'";
            DB.statement.execute(query);
        }catch(Exception err){
            System.out.println(err);
        }
    }
    
    public void hapus(String nik){
        try{
            DB.statement = DB.koneksi.createStatement(); 
            String query = "DELETE FROM `ktp` WHERE `ktp`.`nik` = \'"+nik+"\'";
            DB.statement.execute(query);
        }catch(Exception err){
            System.out.println(err);
        }
    }

}
