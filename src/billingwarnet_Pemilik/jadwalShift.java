
package billingwarnet_Pemilik;

import javax.swing.JOptionPane;


public class jadwalShift extends javax.swing.JPanel {

  
    public jadwalShift() {
        initComponents();
        bgTambahJadwal.setVisible(false);
        btnSimpan.setVisible(false);
        btnKembali.setVisible(false);
        btnTambah.setVisible(true);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTambahJadwal = new javax.swing.JLabel();
        bgJadwalShift = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgTambahJadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/tambahJadwal.png"))); // NOI18N
        add(bgTambahJadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 1000, 630));

        bgJadwalShift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/jadwalShift1.png"))); // NOI18N
        add(bgJadwalShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 650));

        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 210, 50));

        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 290, 70));

        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 290, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        bgTambahJadwal.setVisible(true);
        btnSimpan.setVisible(true);
        btnKembali.setVisible(true);
        btnTambah.setVisible(false);
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        JOptionPane.showMessageDialog(this, "Berhasil ditambahkan");
        bgTambahJadwal.setVisible(false);
        btnSimpan.setVisible(false);
        btnKembali.setVisible(false);
        btnTambah.setVisible(true);
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        bgTambahJadwal.setVisible(false);
        btnSimpan.setVisible(false);
        btnKembali.setVisible(false);
        btnTambah.setVisible(true);
        
        
    }//GEN-LAST:event_btnKembaliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgJadwalShift;
    private javax.swing.JLabel bgTambahJadwal;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    // End of variables declaration//GEN-END:variables
}
