/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingwarnet_User;

/**
 *
 * @author Hafiz
 */
public class start extends javax.swing.JFrame {

    /**
     * Creates new form start
     */
    public start() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgStart = new javax.swing.JLabel();
        btnMulai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/start.png"))); // NOI18N
        getContentPane().add(bgStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 460));

        btnMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnMulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 180, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulaiActionPerformed
        new stop().setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnMulaiActionPerformed

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
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgStart;
    private javax.swing.JButton btnMulai;
    // End of variables declaration//GEN-END:variables
}
