/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author VIRAJ
 */
public class p2 extends javax.swing.JFrame {

    /**
     * Creates new form p2 
     */
    public p2() {
        initComponents();
        int invo_id = 0,temp=-1;
         try {
             
             
        String sql = "Select * from PARTY_DETAIL ";
        
        PreparedStatement pst ;
        ResultSet rs ;
            
        Connection conn  ;
        conn = connect();
            pst=conn.prepareStatement(sql);
           
            rs=pst.executeQuery();
           
            while(rs.next())
            {
               temp=rs.getInt("PARTY_INVO_NO");
               if(temp > invo_id)
               {
                    invo_id = temp;
                    temp = invo_id;
                    
               }
            } 
        } catch (SQLException ex) {
            Logger.getLogger(p3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(p3.class.getName()).log(Level.SEVERE, null, ex);
        }
         invo_id++;
         TINVO.setText(Integer.toString(invo_id));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Tmeter = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser_dt = new com.toedter.calendar.JDateChooser();
        jButton_metermade = new javax.swing.JButton();
        jButton_metermade1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TINVO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_MS1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_GSTIN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_ADD = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 524));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 0, 25, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("ADD NEW LOT ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 300, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADD TOTAL METER  -");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 370, 200, 30);
        jPanel1.add(jTextField_Tmeter);
        jTextField_Tmeter.setBounds(220, 370, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GSTIN -");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 170, 80, 20);
        jPanel1.add(jDateChooser_dt);
        jDateChooser_dt.setBounds(70, 70, 140, 30);

        jButton_metermade.setBackground(new java.awt.Color(204, 204, 204));
        jButton_metermade.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButton_metermade.setText("BACK");
        jButton_metermade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_metermadeActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_metermade);
        jButton_metermade.setBounds(40, 440, 110, 39);

        jButton_metermade1.setBackground(new java.awt.Color(204, 204, 204));
        jButton_metermade1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButton_metermade1.setText("ADD");
        jButton_metermade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_metermade1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_metermade1);
        jButton_metermade1.setBounds(250, 440, 110, 39);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADDRESS - ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 260, 110, 20);

        TINVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TINVOActionPerformed(evt);
            }
        });
        jPanel1.add(TINVO);
        TINVO.setBounds(210, 220, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DT:-");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 70, 50, 20);
        jPanel1.add(jTextField_MS1);
        jTextField_MS1.setBounds(70, 110, 310, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("M/S.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 120, 50, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("INVOICE NUMBER - ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 220, 183, 20);
        jPanel1.add(jTextField_GSTIN);
        jTextField_GSTIN.setBounds(100, 160, 280, 30);

        jTextArea1_ADD.setColumns(20);
        jTextArea1_ADD.setRows(5);
        jScrollPane1.setViewportView(jTextArea1_ADD);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 260, 250, 80);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    javaconnect obj= new javaconnect();
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked
public  Connection connect() throws Exception
    {  
        Connection con;
        con = null;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url="jdbc:derby://localhost:1527/job_db";
        con = DriverManager.getConnection(url,"root","root");
        if(con!=null)
        {
            System.out.println("connected");
        }
        return con;
    }
    private void jButton_metermadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_metermadeActionPerformed
        // TODO add your handling code here:
   this.dispose();
        _P1 sp;
        sp = new _P1();
        sp.setVisible(true);
        
       
        
    }//GEN-LAST:event_jButton_metermadeActionPerformed

    private void jButton_metermade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_metermade1ActionPerformed
      // try {
            // TODO add your handling code here:
            
            
            String date = ((JTextField)jDateChooser_dt.getDateEditor().getUiComponent()).getText();
            String ms = jTextField_MS1.getText();
            String gstin = jTextField_GSTIN.getText();
            //int invo = Integer.parseInt( TINVO.getText());
            String add = jTextArea1_ADD.getText();
            double tmts = Double.parseDouble(jTextField_Tmeter.getText());
            
        
            obj.setParty_name(jTextField_MS1.getText());
            obj.setParty_add(add);
            System.out.println(add);
            obj.setParty_gstin(gstin);
            System.out.println(gstin);
            obj.setParty_dt(date);
            System.out.println(date);
            obj.setPARTY_REC_MTR(tmts);
            System.out.println(tmts);
            
            try {
                obj.insert();
            } catch (Exception ex) {
                Logger.getLogger(p2.class.getName()).log(Level.SEVERE, null, ex);
            }
      // this.dispose();
       // p3 sp=new p3();
        //sp.setVisible(true);
          
    }//GEN-LAST:event_jButton_metermade1ActionPerformed

    private void TINVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TINVOActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TINVOActionPerformed

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
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new p2().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TINVO;
    private javax.swing.JButton jButton_metermade;
    private javax.swing.JButton jButton_metermade1;
    private com.toedter.calendar.JDateChooser jDateChooser_dt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1_ADD;
    private javax.swing.JTextField jTextField_GSTIN;
    private javax.swing.JTextField jTextField_MS1;
    private javax.swing.JTextField jTextField_Tmeter;
    // End of variables declaration//GEN-END:variables

    
}
