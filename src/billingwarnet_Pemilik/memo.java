
package billingwarnet_Pemilik;

import billingwarnet_Operator.*;
import java.awt.GridBagLayout;


public class memo extends javax.swing.JPanel {

    GridBagLayout layout = new GridBagLayout();
    detailMemo p1;
    
    public memo() {
        initComponents();
        p1 = new detailMemo();
        jPanel1.add(p1);
        p1.setVisible(false);
        bgMemo.setVisible(true);
        btnLihatDetail.setVisible(true);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMemo = new javax.swing.JLabel();
        btnLihatDetail = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgMemo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/memo1.png"))); // NOI18N
        add(bgMemo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        btnLihatDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatDetailActionPerformed(evt);
            }
        });
        add(btnLihatDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 270, 50));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLihatDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatDetailActionPerformed
       p1.setVisible(true); 
       bgMemo.setVisible(false);
       btnLihatDetail.setVisible(false);
    }//GEN-LAST:event_btnLihatDetailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgMemo;
    private javax.swing.JButton btnLihatDetail;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
