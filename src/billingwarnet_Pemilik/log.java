
package billingwarnet_Pemilik;

import billingwarnet_Operator.*;

/**
 *
 * @author Hafiz
 */
public class log extends javax.swing.JPanel {

   
    public log() {
        initComponents();
        bgBtnCari.setVisible(false);
        btnPopupCari.setVisible(false);
        
        
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgBtnCari = new javax.swing.JLabel();
        bgLog = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        btnPopupCari = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgBtnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/popupCari.png"))); // NOI18N
        add(bgBtnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, 360));

        bgLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/log.png"))); // NOI18N
        add(bgLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 650));

        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 190, 60));

        btnPopupCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopupCariActionPerformed(evt);
            }
        });
        add(btnPopupCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 290, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        bgBtnCari.setVisible(true);
        btnPopupCari.setVisible(true);
        
        
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnPopupCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopupCariActionPerformed
        bgBtnCari.setVisible(false);
        btnPopupCari.setVisible(false);
        
        
    }//GEN-LAST:event_btnPopupCariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgBtnCari;
    private javax.swing.JLabel bgLog;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnPopupCari;
    // End of variables declaration//GEN-END:variables
}
