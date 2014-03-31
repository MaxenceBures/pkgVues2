/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgVues;

import java.awt.Container;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import pkgEntites.HibernateUtil;

/**
 *
 * @author Maxence
 */
public class jfPrincipal extends javax.swing.JFrame {
   private  static Session session = HibernateUtil.getSessionFactory().openSession();
   protected jpEtablissementAjout pnlEtablissementAjout = new jpEtablissementAjout();
   protected jpEtablissementConsult pnlEtablissementConsult = new jpEtablissementConsult();
   protected jpTypeChambreAjout pnlTypeChambreAjout = new jpTypeChambreAjout();
   protected jpTypeChambreConsult pnlTypeChambreConsult = new jpTypeChambreConsult();
   protected jpAccueil pnlAccueil  = new jpAccueil();
   private Container pnlPrinc = null;
    /**
     * Creates new form jfPrincipal
     */
    public jfPrincipal() {
        initComponents();
        this.setContentPane(pnlAccueil);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jmbTop = new javax.swing.JMenuBar();
        jmAccueil = new javax.swing.JMenu();
        jmniPropos = new javax.swing.JMenuItem();
        jmniQuitter = new javax.swing.JMenuItem();
        jmEtablissement = new javax.swing.JMenu();
        jmniEtablissementConsulter = new javax.swing.JMenuItem();
        jmniEtablissementAjout = new javax.swing.JMenuItem();
        jmChambres = new javax.swing.JMenu();
        jmniChambresConsulter = new javax.swing.JMenuItem();
        jmniChambresAjout = new javax.swing.JMenuItem();
        jmHebergement = new javax.swing.JMenu();
        jmniHebergementConsulter = new javax.swing.JMenuItem();
        jmAttribution = new javax.swing.JMenu();
        jmniAttributionConsulter = new javax.swing.JMenuItem();
        jmniAttributionAjout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmAccueil.setText("Accueil");

        jmniPropos.setText("A propos");
        jmniPropos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniProposActionPerformed(evt);
            }
        });
        jmAccueil.add(jmniPropos);

        jmniQuitter.setText("Quitter");
        jmniQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniQuitterActionPerformed(evt);
            }
        });
        jmAccueil.add(jmniQuitter);

        jmbTop.add(jmAccueil);

        jmEtablissement.setText("Etablissements");
        jmEtablissement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEtablissementActionPerformed(evt);
            }
        });

        jmniEtablissementConsulter.setText("Consulter");
        jmniEtablissementConsulter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniEtablissementConsulterActionPerformed(evt);
            }
        });
        jmEtablissement.add(jmniEtablissementConsulter);

        jmniEtablissementAjout.setText("Ajouter");
        jmniEtablissementAjout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmniEtablissementAjoutMouseClicked(evt);
            }
        });
        jmniEtablissementAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniEtablissementAjoutActionPerformed(evt);
            }
        });
        jmEtablissement.add(jmniEtablissementAjout);

        jmbTop.add(jmEtablissement);

        jmChambres.setText("Chambres");

        jmniChambresConsulter.setText("Consulter");
        jmniChambresConsulter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniChambresConsulterActionPerformed(evt);
            }
        });
        jmChambres.add(jmniChambresConsulter);

        jmniChambresAjout.setText("Ajouter");
        jmniChambresAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniChambresAjoutActionPerformed(evt);
            }
        });
        jmChambres.add(jmniChambresAjout);

        jmbTop.add(jmChambres);

        jmHebergement.setText("Hebergement");

        jmniHebergementConsulter.setText("Consulter");
        jmniHebergementConsulter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniHebergementConsulterActionPerformed(evt);
            }
        });
        jmHebergement.add(jmniHebergementConsulter);

        jmbTop.add(jmHebergement);

        jmAttribution.setText("Attribution");

        jmniAttributionConsulter.setText("Consulter");
        jmniAttributionConsulter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAttributionConsulterActionPerformed(evt);
            }
        });
        jmAttribution.add(jmniAttributionConsulter);

        jmniAttributionAjout.setText("Ajouter");
        jmniAttributionAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAttributionAjoutActionPerformed(evt);
            }
        });
        jmAttribution.add(jmniAttributionAjout);

        jmbTop.add(jmAttribution);

        setJMenuBar(jmbTop);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static Session getSession(){
        return session;
    }
    
    public static void setSession(Session psession){
        jfPrincipal.session=psession;
    }
    private void jmniQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniQuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmniQuitterActionPerformed

    private void jmniEtablissementConsulterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniEtablissementConsulterActionPerformed
        this.setContentPane(pnlEtablissementConsult);
        pnlEtablissementConsult.chargerTable();
        pack();
    }//GEN-LAST:event_jmniEtablissementConsulterActionPerformed

    private void jmniEtablissementAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniEtablissementAjoutActionPerformed
        this.setContentPane(pnlEtablissementAjout);
        pack();
    }//GEN-LAST:event_jmniEtablissementAjoutActionPerformed

    private void jmniChambresConsulterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniChambresConsulterActionPerformed
        // TODO add your handling code here:
        this.setContentPane(pnlTypeChambreConsult);
        pnlTypeChambreConsult.chargerTable();
        pack();
    }//GEN-LAST:event_jmniChambresConsulterActionPerformed

    private void jmniChambresAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniChambresAjoutActionPerformed
        // TODO add your handling code here:
        this.setContentPane(pnlTypeChambreAjout);
        pack();
    }//GEN-LAST:event_jmniChambresAjoutActionPerformed

    private void jmniHebergementConsulterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniHebergementConsulterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmniHebergementConsulterActionPerformed

    private void jmniAttributionConsulterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAttributionConsulterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmniAttributionConsulterActionPerformed

    private void jmniAttributionAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAttributionAjoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmniAttributionAjoutActionPerformed

    private void jmniEtablissementAjoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmniEtablissementAjoutMouseClicked
 /*if( pnlPrinc == null){
     pnlPrinc = this.getContentPane();
 }
 else {
     this.setContentPane(pnlPrinc);
 }*/
 // TODO add your handling code here:
    }//GEN-LAST:event_jmniEtablissementAjoutMouseClicked

    private void jmEtablissementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEtablissementActionPerformed
  
    }//GEN-LAST:event_jmEtablissementActionPerformed

    private void jmniProposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniProposActionPerformed
         JOptionPane.showMessageDialog(null, "Boisgontier Chloé \nBures Maxence");   // TODO add your handling code here:
    }//GEN-LAST:event_jmniProposActionPerformed

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
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jmAccueil;
    private javax.swing.JMenu jmAttribution;
    private javax.swing.JMenu jmChambres;
    private javax.swing.JMenu jmEtablissement;
    private javax.swing.JMenu jmHebergement;
    private javax.swing.JMenuBar jmbTop;
    private javax.swing.JMenuItem jmniAttributionAjout;
    private javax.swing.JMenuItem jmniAttributionConsulter;
    private javax.swing.JMenuItem jmniChambresAjout;
    private javax.swing.JMenuItem jmniChambresConsulter;
    private javax.swing.JMenuItem jmniEtablissementAjout;
    private javax.swing.JMenuItem jmniEtablissementConsulter;
    private javax.swing.JMenuItem jmniHebergementConsulter;
    private javax.swing.JMenuItem jmniPropos;
    private javax.swing.JMenuItem jmniQuitter;
    // End of variables declaration//GEN-END:variables
}
