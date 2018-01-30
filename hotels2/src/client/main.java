/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class main {
    Connection conn=null;
    public Connection fconn=null;
    
     public static void main(String args[]){
         booking bkng = new booking();
         bkng.setSize(530,690);
         bkng.setLocationRelativeTo(null);
         bkng.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         bkng.setVisible(true);
     }
     
     public static Connection hotconnect(Connection conn){
        try{
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/hotels2","root", "hotels");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e,"",JOptionPane.ERROR_MESSAGE);
            System.exit(0); 
        } 
        return conn;
    }
     
}
