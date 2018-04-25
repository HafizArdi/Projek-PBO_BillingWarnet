
package billingwarnet_Operator;

import javax.swing.JOptionPane;


public class daftar extends javax.swing.JFrame {

   
    public daftar() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgdaftar = new javax.swing.JLabel();
        btnDaftar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgdaftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/daftar.png"))); // NOI18N
        bgdaftar.setText("   gb   ");
        getContentPane().add(bgdaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 750));

        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, 230, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
       JOptionPane.showMessageDialog(this, "Berhasil didaftarkan !!");
       new login().setVisible(true);
       this.dispose();
        
        
    }//GEN-LAST:event_btnDaftarActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdaftar;
    private javax.swing.JButton btnDaftar;
    // End of variables declaration//GEN-END:variables
}
