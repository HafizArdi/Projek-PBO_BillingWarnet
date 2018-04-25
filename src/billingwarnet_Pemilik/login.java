
package billingwarnet_Pemilik;

import billingwarnet_Operator.*;


public class login extends javax.swing.JFrame {

    
    public login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgLogin = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnOpsi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/login.png"))); // NOI18N
        getContentPane().add(bgLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 750));

        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 220, 60));

        btnOpsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpsiActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 320, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new halamanUtama().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnOpsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpsiActionPerformed
        new loginOperator().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnOpsiActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLogin;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnOpsi;
    // End of variables declaration//GEN-END:variables
}
