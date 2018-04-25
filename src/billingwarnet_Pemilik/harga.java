
package billingwarnet_Pemilik;

import billingwarnet_Operator.*;
import javax.swing.JOptionPane;


public class harga extends javax.swing.JPanel {

   
    public harga() {
        initComponents();
        tambah.setVisible(false);
        btnSimpan.setVisible(false);
        btnKembali.setVisible(false);
        btnTambah.setVisible(true);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tambah = new javax.swing.JLabel();
        bgHarga = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/tambahPemilik.png"))); // NOI18N
        add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 1000, 620));

        bgHarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/hargaPemilik1.png"))); // NOI18N
        add(bgHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 650));

        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 200, 60));

        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 290, 70));

        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 280, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        tambah.setVisible(true);
        btnSimpan.setVisible(true);
        btnKembali.setVisible(true);
        btnTambah.setVisible(false);
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
       JOptionPane.showMessageDialog(this, "Berhasil di simpan");
       tambah.setVisible(false);
       btnSimpan.setVisible(false);
       btnKembali.setVisible(false);
       btnTambah.setVisible(true);
       
       
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
       tambah.setVisible(false);
       btnSimpan.setVisible(false);
       btnKembali.setVisible(false);
       btnTambah.setVisible(true);
        
        
    }//GEN-LAST:event_btnKembaliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgHarga;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel tambah;
    // End of variables declaration//GEN-END:variables
}
