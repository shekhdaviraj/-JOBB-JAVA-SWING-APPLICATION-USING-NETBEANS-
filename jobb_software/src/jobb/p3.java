/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobb;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


/**
 *
 * @author VIRAJ
 */



public class p3 extends javax.swing.JFrame {

    /**
     * Creates new form p3
     */
    public p3() {
        initComponents();
        
        int slip_id= 0;
         try {
             
             
        String sql = "Select * from PKG_SLIP ";
        
        PreparedStatement pst ;
        ResultSet rs ;
            
        Connection conn  ;
        conn = connect();
            pst=conn.prepareStatement(sql);
           
            rs=pst.executeQuery();
           
            while(rs.next())
            {
               slip_id=rs.getInt("BALE_NO");
            } 
        } catch (SQLException ex) {
            Logger.getLogger(p3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(p3.class.getName()).log(Level.SEVERE, null, ex);
        }
         slip_id++;
         jTextField_PKG_SNO.setText(Integer.toString(slip_id));
         //jTextField_PKG_DT.setText(dt);
    }
   /* //public p3(String dt)
    {
        initComponents();
        
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_PKG_LNO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_PKG_DT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_PKG_MS = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jCheckBox_MT55 = new javax.swing.JCheckBox();
        jTextField_PKG_SNO = new javax.swing.JTextField();
        jTextField_PKG_FLD = new javax.swing.JTextField();
        jTextField_PKG_TOTP = new javax.swing.JTextField();
        jTextField_PKG_LD = new javax.swing.JTextField();
        jTextField_PKG_MNO = new javax.swing.JTextField();
        jCheckBox_MT5 = new javax.swing.JCheckBox();
        jTextField_PKG_DNO1 = new javax.swing.JTextField();
        jTextField_PKG_FRESH = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField_PKG_DAMAGE = new javax.swing.JTextField();
        jButton_metermade3 = new javax.swing.JButton();
        jButton_metermade4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_metermade = new javax.swing.JButton();
        jButton_metermade1 = new javax.swing.JButton();
        jButton_metermade2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 524));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("PACKAGING SLIP");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 40, 320, 30);
        jPanel2.add(jTextField_PKG_LNO);
        jTextField_PKG_LNO.setBounds(100, 130, 90, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TOTAL PIECES      -");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(180, 480, 170, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DT -");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(270, 100, 40, 20);
        jPanel2.add(jTextField_PKG_DT);
        jTextField_PKG_DT.setBounds(320, 100, 90, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOT NO -");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 130, 70, 20);
        jPanel2.add(jTextField_PKG_MS);
        jTextField_PKG_MS.setBounds(60, 170, 350, 20);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(10, 210, 400, 10);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(10, 500, 400, 10);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SLIP NO -");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 100, 70, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("M/S -");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 170, 40, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("D. NO");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 230, 40, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MTS-5         -");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(250, 230, 110, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MTS-5.50   - ");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(250, 280, 110, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SAREES");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(300, 330, 60, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LADIES");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 280, 60, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("M. NO");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 330, 60, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("FOLD");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(20, 380, 60, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("FRESH        - ");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(250, 370, 100, 20);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(10, 468, 400, 2);
        jPanel2.add(jCheckBox_MT55);
        jCheckBox_MT55.setBounds(360, 280, 20, 20);

        jTextField_PKG_SNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PKG_SNOActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_PKG_SNO);
        jTextField_PKG_SNO.setBounds(100, 100, 90, 20);
        jPanel2.add(jTextField_PKG_FLD);
        jTextField_PKG_FLD.setBounds(110, 380, 90, 20);
        jPanel2.add(jTextField_PKG_TOTP);
        jTextField_PKG_TOTP.setBounds(330, 470, 60, 30);
        jPanel2.add(jTextField_PKG_LD);
        jTextField_PKG_LD.setBounds(110, 280, 90, 20);
        jPanel2.add(jTextField_PKG_MNO);
        jTextField_PKG_MNO.setBounds(110, 330, 90, 20);
        jPanel2.add(jCheckBox_MT5);
        jCheckBox_MT5.setBounds(360, 230, 20, 20);

        jTextField_PKG_DNO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PKG_DNO1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_PKG_DNO1);
        jTextField_PKG_DNO1.setBounds(110, 230, 90, 20);
        jPanel2.add(jTextField_PKG_FRESH);
        jTextField_PKG_FRESH.setBounds(350, 370, 60, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("DAMAGE     -");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(250, 420, 90, 20);
        jPanel2.add(jTextField_PKG_DAMAGE);
        jTextField_PKG_DAMAGE.setBounds(350, 420, 60, 30);

        jButton_metermade3.setBackground(new java.awt.Color(204, 204, 204));
        jButton_metermade3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButton_metermade3.setText("Calculate");
        jButton_metermade3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButton_metermade3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_metermade3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_metermade3);
        jButton_metermade3.setBounds(40, 420, 160, 40);

        jButton_metermade4.setBackground(new java.awt.Color(204, 204, 204));
        jButton_metermade4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButton_metermade4.setText("s");
        jButton_metermade4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButton_metermade4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_metermade4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_metermade4);
        jButton_metermade4.setBounds(200, 120, 50, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton_metermade.setBackground(new java.awt.Color(204, 204, 204));
        jButton_metermade.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButton_metermade.setText("BACK");
        jButton_metermade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButton_metermade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_metermadeActionPerformed(evt);
            }
        });

        jButton_metermade1.setBackground(new java.awt.Color(204, 204, 204));
        jButton_metermade1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButton_metermade1.setText("PRINT");
        jButton_metermade1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButton_metermade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_metermade1ActionPerformed(evt);
            }
        });

        jButton_metermade2.setBackground(new java.awt.Color(204, 204, 204));
        jButton_metermade2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButton_metermade2.setText("ADD");
        jButton_metermade2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButton_metermade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_metermade2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton_metermade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton_metermade2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_metermade1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_metermade)
                    .addComponent(jButton_metermade1)
                    .addComponent(jButton_metermade2))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked
javaconnect obj1 = new javaconnect();
    private void jButton_metermadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_metermadeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        _P1 sp=new _P1();
        sp.setVisible(true);
        String srch;
        srch = jTextField_PKG_LNO.getText();
        
        
        //ps = con
    }//GEN-LAST:event_jButton_metermadeActionPerformed

    private void jButton_metermade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_metermade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_metermade1ActionPerformed

public int tot;
    private void jButton_metermade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_metermade2ActionPerformed
        // TODO add your handling code here:
        Boolean mtr5,mtr55;
        int dno = Integer.parseInt(jTextField_PKG_TOTP.getText());
        String ladies = jTextField_PKG_LD.getText();
        String mno = jTextField_PKG_MNO.getText();
        String fold = jTextField_PKG_FLD.getText();
        int lotno;
        double fresh,damage;
        fresh = Double.parseDouble(jTextField_PKG_FRESH.getText());
        damage= Double.parseDouble(jTextField_PKG_DAMAGE.getText());
        lotno = Integer.parseInt(jTextField_PKG_LNO.getText());
        mtr5 = jCheckBox_MT5.isSelected();
        mtr55 = jCheckBox_MT55.isSelected();
        obj1.setD_NO(dno);
        obj1.setLotno(lotno);
        obj1.setMtr5((mtr5));
        obj1.setMtr55((mtr55));
        obj1.setLADIES(ladies);
        obj1.setFresh(fresh);
        obj1.setDamage(damage);
        obj1.setM_NO(mno);
        obj1.setFOLD(fold);
        obj1.setTot_pis(tot);
        
        try {
            obj1.insertpkg();
        } catch (Exception ex) {
            Logger.getLogger(p3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton_metermade2ActionPerformed

    private void jTextField_PKG_SNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PKG_SNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PKG_SNOActionPerformed

    private void jButton_metermade3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_metermade3ActionPerformed
        // TODO add your handling code here:
        int fresh =Integer.parseInt(jTextField_PKG_FRESH.getText());
        int damage = Integer.parseInt(jTextField_PKG_DAMAGE.getText());
        tot = fresh + damage;
        jTextField_PKG_TOTP.setText(Integer.toString(tot));
    }//GEN-LAST:event_jButton_metermade3ActionPerformed

    private void jTextField_PKG_DNO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PKG_DNO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PKG_DNO1ActionPerformed
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
    private void jButton_metermade4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_metermade4ActionPerformed
        // TODO add your handling code here:
        
       
        
        try {
             int invo_id = Integer.parseInt(jTextField_PKG_LNO.getText());
             
        String sql = "Select * from PARTY_DETAIL where PARTY_INVO_NO="+invo_id+"";
        
        PreparedStatement pst ;
        ResultSet rs ;
            
        Connection conn  ;
        conn = connect();
            pst=conn.prepareStatement(sql);
           
            rs=pst.executeQuery();
           
            if(rs.next())
            {
                String name = rs.getString("PARTY_NAME");
                java.sql.Date date = rs.getDate("PART_ORDER_DATE");
                jTextField_PKG_MS.setText(name);
                jTextField_PKG_DT.setText(date.toString());
            } 
        } catch (SQLException ex) {
            Logger.getLogger(p3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(p3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButton_metermade4ActionPerformed
  
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
            java.util.logging.Logger.getLogger(p3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(p3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(p3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(p3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new p3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_metermade;
    private javax.swing.JButton jButton_metermade1;
    private javax.swing.JButton jButton_metermade2;
    private javax.swing.JButton jButton_metermade3;
    private javax.swing.JButton jButton_metermade4;
    private javax.swing.JCheckBox jCheckBox_MT5;
    private javax.swing.JCheckBox jCheckBox_MT55;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField_PKG_DAMAGE;
    private javax.swing.JTextField jTextField_PKG_DNO1;
    private javax.swing.JTextField jTextField_PKG_DT;
    private javax.swing.JTextField jTextField_PKG_FLD;
    private javax.swing.JTextField jTextField_PKG_FRESH;
    private javax.swing.JTextField jTextField_PKG_LD;
    private javax.swing.JTextField jTextField_PKG_LNO;
    private javax.swing.JTextField jTextField_PKG_MNO;
    private javax.swing.JTextField jTextField_PKG_MS;
    private javax.swing.JTextField jTextField_PKG_SNO;
    private javax.swing.JTextField jTextField_PKG_TOTP;
    // End of variables declaration//GEN-END:variables
}
