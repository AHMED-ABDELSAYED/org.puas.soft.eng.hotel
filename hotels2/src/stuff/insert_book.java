/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stuff;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Chris
 */
public class insert_book extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement ptst=null;
    ResultSet rs=null;
    /**
     * Creates new form manage_books
     */
    public insert_book() {
        initComponents();
    }
    protected static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
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
        lastname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hotel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cincal = new com.toedter.calendar.JCalendar();
        coutcal = new com.toedter.calendar.JCalendar();
        jLabel6 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Επωνυμο");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ονομα");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Περιοχη");

        hotel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Αθηνα", "Θεσσαλονικη", "Ροδος", "Ηρακλειο", "Κεφαλονια" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Κατηγορια");

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Μονοκλινο", "Δικλινο", "Τρικλινο", "Τετρακλινο", "Προεδρικη" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Check-in");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Check-out");

        submit.setText("ΟΚ");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastname)
                            .addComponent(firstname)
                            .addComponent(hotel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(356, 356, 356)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cincal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(128, 128, 128)
                                        .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(coutcal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(121, 121, 121)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lastname, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(firstname, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hotel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cincal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coutcal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        //KLEISIMO PARATHIROU
        int choise=JOptionPane.showConfirmDialog(null, "Σιγουρα θελετε να ακυρωστε την κρατηση", "", JOptionPane.YES_NO_OPTION);
        if(choise==0){
            this.dispose();
            this.setVisible(false);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        //PERASMA STO BOOK_CONF
        boolean offerflag=false;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        main mn = new main();
        conn=mn.connect(conn);
        book_conf conf = new book_conf();
        conf.lastname.setText(this.lastname.getText());
        conf.firstname.setText(this.firstname.getText());
        conf.region.setText((String) this.hotel.getSelectedItem());
        
        
        Date   frbook=convertUtilToSql(cincal.getDate());
        Date   tobook=convertUtilToSql(coutcal.getDate());
        if(tobook.before(frbook)){
            JOptionPane.showMessageDialog(null, "Η τελικη ημερομηνια δεν μπορει να ειναι πριν την αρχικη","", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String fbd=frbook.toString();
        String tbd=tobook.toString();
        
        conf.chin.setText(fbd);
        conf.chout.setText(tbd);
        
        
        int code=(int)Math.round(Math.random() * 89999) + 10000;
        String scode=Integer.toString(code);
        conf.code.setText(scode);               
        
        String reg=(String)hotel.getSelectedItem();
        String typ=(String)type.getSelectedItem();
        conf.tipos=typ;
        
        try{
            String ofpr="select * from OFFERS where REGION=? and TYPE=? and ? between START and FINISH";
            ptst=conn.prepareStatement(ofpr);
            ptst.setString(1,reg);
            ptst.setString(2,typ);
            ptst.setDate(3,frbook);
            rs=ptst.executeQuery();
            if(rs.next()){
                long charge=rs.getInt("PRICE")*((tobook.getTime()-frbook.getTime())/(1000*60*60*24));
                String charg=Long.toString(charge);
                conf.charge.setText(charg);    
            }else{
                try{
                    String hopr="select PRICE from HOTEL where CATEGORY=?";
                    ptst=conn.prepareStatement(hopr);
                    ptst.setString(1,typ);
                    rs=ptst.executeQuery();
                    if(rs.next()){
                        long charge=rs.getInt("PRICE")*((tobook.getTime()-frbook.getTime())/(1000*60*60*24));
                        String charg=Long.toString(charge);
                        conf.charge.setText(charg);    
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }     
        try{
            String chbook="select * from BOOKS where REGION=? and CATEGORY=?";
            ptst=conn.prepareStatement(chbook);
            ptst.setString(1, reg);
            ptst.setString(2, typ);
            rs=ptst.executeQuery();
            if(rs.next()){
                try{
                    String sql="SELECT * FROM HOTEL WHERE   HOTEL.REGION=? and HOTEL.CATEGORY=? and AVAILABLE=true and HOTEL.ROOM_NO NOT IN(SELECT ROOM_NO FROM BOOKS WHERE ? BETWEEN CHECKIN AND CHECKOUT OR ? BETWEEN CHECKIN AND CHECKOUT)";
                    ptst=conn.prepareStatement(sql);
                    ptst.setString(1,reg);
                    ptst.setString(2,typ);
                    ptst.setDate(3,frbook);
                    ptst.setDate(4,tobook);
                    rs=ptst.executeQuery();
                    if(rs.next()){
                      int irn=rs.getInt("ROOM_NO");
                      String srn=Integer.toString(irn);
                      conf.roomno.setText(srn);
                    }else{
                        JOptionPane.showMessageDialog(null, "Δεν υπαρχουν διαθεσιμα δωματια","", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                 }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e, "", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                 try{
                     String sql="SELECT * FROM HOTEL WHERE   HOTEL.REGION=? and HOTEL.CATEGORY=? and AVAILABLE=true ";
                     ptst=conn.prepareStatement(sql);
                     ptst.setString(1, reg);
                     ptst.setString(2, typ);
                     rs=ptst.executeQuery();                   
                    if(rs.next()){
                      int irn=rs.getInt("ROOM_NO");
                      String srn=Integer.toString(irn);
                      conf.roomno.setText(srn);
                    }else{
                        JOptionPane.showMessageDialog(null, "Δεν υπαρχουν διαθεσιμα δωματια","", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                 }catch(Exception e){
                      JOptionPane.showMessageDialog(null, e, "", JOptionPane.ERROR_MESSAGE);
                 }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        conf.setSize(330, 470);
        conf.setLocationRelativeTo(null);
        conf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        conf.setVisible(true);
       
//           
        
        
//        book_conf bconf = new book_conf();
//        bconf.setSize(320,470);
//        bconf.setLocationRelativeTo(null);
//        bconf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        bconf.setVisible(true);
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
            java.util.logging.Logger.getLogger(insert_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private com.toedter.calendar.JCalendar cincal;
    private com.toedter.calendar.JCalendar coutcal;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> hotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lastname;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
