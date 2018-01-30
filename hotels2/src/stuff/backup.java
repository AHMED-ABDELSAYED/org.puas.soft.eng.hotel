/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import static stuff.main.conn;

/**
 *
 * @author Chris
 */
public class backup {
   public static void main(String args[]){
       Connection conn=null;
       conn=main.connect(conn);
       try{
            backUpDatabase(conn);
       }catch(Exception e){
           e.printStackTrace();
       }
        
   }
   public static void backUpDatabase(Connection conn)throws SQLException
        {
            String backupdirectory ="C:\\Users\\Chris\\Desktop\\PROJECT AND CODE BACK-UP";
            CallableStatement cs = conn.prepareCall("CALL SYSCS_UTIL.SYSCS_BACKUP_DATABASE(?)"); 
            cs.setString(1, backupdirectory);
            cs.execute(); 
            cs.close();
            System.out.println("backed up database to "+backupdirectory);
        }
}
