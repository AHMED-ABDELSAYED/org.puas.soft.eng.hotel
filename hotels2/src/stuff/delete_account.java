/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;
import java.sql.*;
//import stuff.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Chris
 */
public class delete_account extends javax.swing.JFrame {
    protected Connection conn=null;
    protected PreparedStatement pst=null;
    protected ResultSet rs=null;
    /**
     * Creates new form delete_account
     */
    public delete_account() {
        initComponents();
    }
    
//    String tstsubmitActionPerformed(String delus,String apass){
//         main mn = new main();
//        conn=mn.connect(conn);
//        String uname=delus;
//        String pass=apass;
//        
//        try{
//            String asql="select * from ACCOUNT where PASSWD=?";
//            pst=conn.prepareStatement(asql);
//            pst.setString(1, pass);
//            rs=pst.executeQuery();
//            if(rs.next()){              
//                try{
//                   String dsql="select * from ACCOUNT where USERNAME=?";
//                    pst=conn.prepareStatement(dsql);
//                    pst.setString(1, uname);
//                    pst.execute();
//                    rs=pst.executeQuery();
//                    if(rs.next()){
//                        String du=rs.getString("PASSWD");
//                        return du;
//                    }
//                    JOptionPane.showMessageDialog(null, "Επιτυχης διαγραφη λογαριασμου");
//                    this.setVisible(false);
//                }catch(Exception e){
//                    JOptionPane.showMessageDialog(null, e, "", JOptionPane.ERROR_MESSAGE);
//                }
//            }else{
//                JOptionPane.showMessageDialog(null, "Λαθος κωδικος Admin", "", JOptionPane.ERROR_MESSAGE);
//            }
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e, "", JOptionPane.ERROR_MESSAGE);
//        }
//        return "a";
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usrn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apasswd = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Διαγραφη Λογαριασμου");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Admin Password");

        submit.setText("Διαγραφη");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        clear.setText("Καθαρισμος");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        cancel.setText("Ακυρωση");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usrn, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addComponent(apasswd))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clear)
                        .addGap(18, 18, 18)
                        .addComponent(cancel)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usrn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(clear)
                    .addComponent(cancel))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // KLEISIMO PARATHIROU
        int choise=JOptionPane.showConfirmDialog(null, "Σιγουρα θελετε να κλεισετε το παραθυρο", "", JOptionPane.YES_NO_OPTION);
        if(choise==0){
            this.dispose();
            this.setVisible(false);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        //KATHARISMOS FORMAS
        usrn.setText("");
        apasswd.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        //DIAGRAFI LOGARIASMOU
        main mn = new main();
        conn=mn.connect(conn);
        String uname=usrn.getText();
        String apass=apasswd.getText();
        
        try{
            String asql="select * from ACCOUNT where PASSWD=?";
            pst=conn.prepareStatement(asql);
            pst.setString(1, apass);
            rs=pst.executeQuery();
            if(rs.next()){
                try{
                   String dsql="delete from ACCOUNT where USERNAME=?";
                    pst=conn.prepareStatement(dsql);
                    pst.setString(1, uname);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Επιτυχης διαγραφη λογαριασμου");
                    this.setVisible(false);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e, "", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Λαθος κωδικος Admin", "", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(delete_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField apasswd;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton submit;
    private javax.swing.JTextField usrn;
    // End of variables declaration//GEN-END:variables
}