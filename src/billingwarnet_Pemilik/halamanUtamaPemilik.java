
package billingwarnet_Pemilik;

import java.awt.GridBagLayout;


public class halamanUtamaPemilik extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();
    operator p1;
    komputer p2;
    harga p3;
    log p4;
    editProfile p5;
    jadwalShift p6;
    memo p7;
    
    public halamanUtamaPemilik() {
        initComponents();
        p1 = new operator();
        p2 = new komputer();
        p3 = new harga();
        p4 = new log();
        p5 = new editProfile();
        p6 = new jadwalShift();
        p7 = new memo();
        jPanel1.setLayout(layout);
        jPanel1.add(p1);
        jPanel1.add(p2);
        jPanel1.add(p3);
        jPanel1.add(p4);
        jPanel1.add(p5);
        jPanel1.add(p6);
        jPanel1.add(p7);
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgHalamanUtama = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnOperator = new javax.swing.JButton();
        btnKomputer = new javax.swing.JButton();
        btnHarga = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnJadwalShifting = new javax.swing.JButton();
        btnMemo = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgHalamanUtama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/homePemilik.png"))); // NOI18N
        getContentPane().add(bgHalamanUtama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 750));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 1090, 650));

        btnOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperatorActionPerformed(evt);
            }
        });
        getContentPane().add(btnOperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 210, 70));

        btnKomputer.setText("jButton1");
        btnKomputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomputerActionPerformed(evt);
            }
        });
        getContentPane().add(btnKomputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 210, 60));

        btnHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHargaActionPerformed(evt);
            }
        });
        getContentPane().add(btnHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 150, 50));

        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        getContentPane().add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 33, 120, 50));

        btnEdit.setText("jButton1");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 260, 60));

        btnJadwalShifting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJadwalShiftingActionPerformed(evt);
            }
        });
        getContentPane().add(btnJadwalShifting, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 260, 60));

        btnMemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMemo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 250, 60));

        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 620, 250, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperatorActionPerformed
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        
    }//GEN-LAST:event_btnOperatorActionPerformed

    private void btnKomputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomputerActionPerformed
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        
    }//GEN-LAST:event_btnKomputerActionPerformed

    private void btnHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHargaActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        
    }//GEN-LAST:event_btnHargaActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(true);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        
        
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(true);
        p6.setVisible(false);
        p7.setVisible(false);
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnJadwalShiftingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJadwalShiftingActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(true);
        p7.setVisible(false);
        
    }//GEN-LAST:event_btnJadwalShiftingActionPerformed

    private void btnMemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(true);
        
        
    }//GEN-LAST:event_btnMemoActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       new login().setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamanUtamaPemilik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgHalamanUtama;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHarga;
    private javax.swing.JButton btnJadwalShifting;
    private javax.swing.JButton btnKomputer;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMemo;
    private javax.swing.JButton btnOperator;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
