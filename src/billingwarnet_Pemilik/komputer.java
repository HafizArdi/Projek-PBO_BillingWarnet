
package billingwarnet_Pemilik;

import billingwarnet_Operator.*;

/**
 *
 * @author Hafiz
 */
public class komputer extends javax.swing.JPanel {

  
    public komputer() {
        initComponents();
        bgDetailKomputer.setVisible(false);
        btnKembali.setVisible(false);
        
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgDetailKomputer = new javax.swing.JLabel();
        bgKomputer = new javax.swing.JLabel();
        btnDetail = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgDetailKomputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/detailKomputer.png"))); // NOI18N
        add(bgDetailKomputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 440));

        bgKomputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/home1.png"))); // NOI18N
        add(bgKomputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 650));

        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });
        add(btnDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, 30));

        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 320, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
         bgDetailKomputer.setVisible(true);
         btnKembali.setVisible(true);
        
    }//GEN-LAST:event_btnDetailActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
         bgDetailKomputer.setVisible(false);
         btnKembali.setVisible(false);
        
        
    }//GEN-LAST:event_btnKembaliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgDetailKomputer;
    private javax.swing.JLabel bgKomputer;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnKembali;
    // End of variables declaration//GEN-END:variables
}
