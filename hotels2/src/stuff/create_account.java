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
public class create_account extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst=null;
    /**
     * Creates new form create_account
     */
    public create_account() {
        initComponents();
    }

   void tstsubmit(){
         main mn=new main();
        conn=mn.connect(conn);
        int pr;
        String usr=usrn.getText();
        String pas=passwd.getText();
        String cpas=cpasswd.getText();
        if(ademp.isSelected()){
            pr=0;
        }else{
            pr=1;
        }
        if(usr.isEmpty() || pas.isEmpty() || cpas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Παρακαλω συμπληρωστε την φορμα", "", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            if(pas.equals(cpas)){
                try{
                    String sql="insert into ACCOUNT values(?,?,?)";
                    pst=conn.prepareStatement(sql);
                    pst.setString(1, usr);
                    pst.setString(2, pas);
                    pst.setInt(3, pr);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Επιτυχης δημιουργια λογαριασμου");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e, "", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Οι κωδικοι δεν ταιριαζουν", "", JOptionPane.ERROR_MESSAGE);
            }
        }
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
        jLabel3 = new javax.swing.JLabel();
        passwd = new javax.swing.JPasswordField();
        cpasswd = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        ademp = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Username");
        jLabel1.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Confirm Password");

        submit.setText("Εγγραφη");
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

        ademp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ademp.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addComponent(submit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ademp)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clear)
                        .addGap(36, 36, 36)
                        .addComponent(cancel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usrn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(passwd)
                        .addComponent(cpasswd)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usrn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ademp)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit)
                    .addComponent(clear)
                    .addComponent(cancel))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        //EKSODOS
        int choise=JOptionPane.showConfirmDialog(null, "Σιγουρα θελετε να ακυρωστετε την διαδικασια", "", JOptionPane.YES_NO_OPTION);
        if(choise==0){
            this.dispose();
            this.setVisible(false);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        //KATHARISMOS FORMAS
        usrn.setText("");
        passwd.setText("");
        cpasswd.setText("");
        ademp.setSelected(false);
    }//GEN-LAST:event_clearActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        //EGGRAFI XRISTI SITN VASI DEDOMENWN
        main mn=new main();
        conn=mn.connect(conn);
        int pr;
        String usr=usrn.getText();
        String pas=passwd.getText();
        String cpas=cpasswd.getText();
        if(ademp.isSelected()){
            pr=0;
        }else{
            pr=1;
        }
        if(usr.isEmpty() || pas.isEmpty() || cpas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Παρακαλω συμπληρωστε την φορμα", "", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            if(pas.equals(cpas)){
                try{
                    String sql="insert into ACCOUNT values(?,?,?)";
                    pst=conn.prepareStatement(sql);
                    pst.setString(1, usr);
                    pst.setString(2, pas);
                    pst.setInt(3, pr);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Επιτυχης δημιουργια λογαριασμου");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e, "", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Οι κωδικοι δεν ταιριαζουν", "", JOptionPane.ERROR_MESSAGE);
            }
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
            java.util.logging.Logger.getLogger(create_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(create_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(create_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(create_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new create_account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ademp;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JPasswordField cpasswd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwd;
    private javax.swing.JButton submit;
    private javax.swing.JTextField usrn;
    // End of variables declaration//GEN-END:variables
}
