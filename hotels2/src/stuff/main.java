/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;
//import stuff.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Chris
 */
public class main {
    public static Connection conn;
    public static Connection fconn;
    
    public static void main(String args[]){
        login log = new login();
        log.setSize(390,220);
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        log.setVisible(true);
//           Selection sel = new Selection();
//           sel.setSize(290, 190);
//           sel.setResizable(false);
//           sel.setLocationRelativeTo(null);
//           sel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//           sel.setVisible(true);
    }
    
    public static Connection connect(Connection conn){
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
