/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JFrame;
//import stuff.*;
/**
 *
 * @author Chris
 */
public class login extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public login() {
        initComponents();
    }
   
    int tstloginActionPerformed(){
        main mn = new main();
        conn=mn.connect(conn);
        String usr=usrn.getText();
        String pas=passwd.getText();
        try{
            String sql="select * from ACCOUNT where USERNAME=? and PASSWD=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,usr);
            pst.setString(2,pas);
            rs=pst.executeQuery();
            if(rs.next()){
                int pr=rs.getInt("PROPERTY");
                return pr;
//                if(pr==0){
//                    //LOAD ADMIN GUI
//                    admin ad = new admin();
//                    ad.setSize(750,440);
//                    ad.setLocationRelativeTo(null);
//                    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                    this.setVisible(false);
//                    ad.setVisible(true);
//                }else{
//                    //LOAD EMPLOYEE GUI
//                    employee emp = new employee();
//                    emp.setSize(750, 380);
//                    emp.setLocationRelativeTo(null);
//                    emp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                    this.setVisible(false);
//                    emp.setVisible(true);
//                }
            }else{
                JOptionPane.showMessageDialog(null, "Λαθος username η password", "", JOptionPane.ERROR_MESSAGE);
                passwd.setText("");
            }    
            }catch(Exception e){
                e.printStackTrace();
            }
        return 0;
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usrn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwd = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("PASSWORD");

        login.setText("Συνδεση");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        clear.setText("Καθαρισμος");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setText("Εξοδος");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(login)
                        .addGap(18, 18, 18)
                        .addComponent(clear)
                        .addGap(18, 18, 18)
                        .addComponent(exit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usrn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usrn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(clear)
                    .addComponent(exit))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        //EKSODOS META APO CONFIRM
        int choise=JOptionPane.showConfirmDialog(null, "Σιγουρα θελετε να τερματησετε την εφαρμογη", "", JOptionPane.YES_NO_OPTION);
        if(choise==0){
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        //KATHARISMOS FORMAS
        usrn.setText("");
        passwd.setText("");
       
        
    }//GEN-LAST:event_clearActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        //EISODOS META APO VALIDATION
        main mn = new main();
        conn=mn.connect(conn);
        String usr=usrn.getText();
        String pas=passwd.getText();
        try{
            String sql="select * from ACCOUNT where USERNAME=? and PASSWD=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,usr);
            pst.setString(2,pas);
            rs=pst.executeQuery();
            if(rs.next()){
                int pr=rs.getInt("PROPERTY");
                if(pr==0){
                    //LOAD ADMIN GUI
                    admin ad = new admin();
                    ad.setSize(750,440);
                    ad.setLocationRelativeTo(null);
                    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.setVisible(false);
                    ad.setVisible(true);
                }else{
                    //LOAD EMPLOYEE GUI
                    employee emp = new employee();
                    emp.setSize(750, 380);
                    emp.setLocationRelativeTo(null);
                    emp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.setVisible(false);
                    emp.setVisible(true);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Λαθος username η password", "", JOptionPane.ERROR_MESSAGE);
                passwd.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login;
    protected javax.swing.JPasswordField passwd;
    protected javax.swing.JTextField usrn;
    // End of variables declaration//GEN-END:variables
}
