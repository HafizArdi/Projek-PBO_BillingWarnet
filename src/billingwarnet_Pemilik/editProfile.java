
package billingwarnet_Pemilik;

import billingwarnet_Operator.*;
import javax.swing.JOptionPane;


public class editProfile extends javax.swing.JPanel {

   
    public editProfile() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEditProfile = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgEditProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/editPofil.png"))); // NOI18N
        add(bgEditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 650));

        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 180, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        JOptionPane.showMessageDialog(this, "Berhasil Disimpan !!");
        
        
    }//GEN-LAST:event_btnSimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgEditProfile;
    private javax.swing.JButton btnSimpan;
    // End of variables declaration//GEN-END:variables
}
