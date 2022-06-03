/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author Raditha & Yohanes Ageng
 */
public class Connector {
    public Connection koneksi;
    public Statement statement;
    public Connector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/db_ktp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            System.out.println("Koneksi Berhasil");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
