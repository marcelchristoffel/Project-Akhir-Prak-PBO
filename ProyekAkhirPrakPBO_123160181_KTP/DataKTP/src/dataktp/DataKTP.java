/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataktp;

import database.Connector;
import view.ViewKTP;


/**
 *
 * @author Raditha & Yohanes Ageng
 */
public class DataKTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connector DB = new Connector();
        ViewKTP viewktp = new ViewKTP(DB);
        viewktp.setVisible(true);
    }
    
}
