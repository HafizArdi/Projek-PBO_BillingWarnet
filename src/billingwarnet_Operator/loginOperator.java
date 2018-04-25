
package billingwarnet_Operator;


public class loginOperator extends javax.swing.JFrame {

 
    public loginOperator() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgUser = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnGanti = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/loginOperator.png"))); // NOI18N
        getContentPane().add(bgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 750));

        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 220, 60));

        btnGanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGantiActionPerformed(evt);
            }
        });
        getContentPane().add(btnGanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 300, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new halamanUtama().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnGantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGantiActionPerformed
        new login().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnGantiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginOperator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgUser;
    private javax.swing.JButton btnGanti;
    private javax.swing.JButton btnLogin;
    // End of variables declaration//GEN-END:variables
}
