/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgVues;

import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Transaction;
import pkgEntites.Etablissement;
import pkgEntites.Offre;

/**
 *
 * @author Maxence
 */
public class jpHebergementConsult extends javax.swing.JPanel {
        
    private boolean bCharge = false;
    private String sEtablissementId = "";
    private String sChambresId = "";
    
    /**
     * Creates new form jpTest
     */
    public jpHebergementConsult() {
        initComponents();
       
    }

    public void chargeListe(){
        String sReq = "From Etablissement";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        jCbListeEtablissement.removeAllItems();
        Iterator eta = q.iterate();
        while(eta.hasNext())
           {
           Etablissement unEtablissement = (Etablissement) eta.next();
           jCbListeEtablissement.addItem(unEtablissement.getEtaNom());
           }
        bCharge = true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCbListeEtablissement = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblHebergement = new javax.swing.JTable();
        jtxtModif = new javax.swing.JTextField();
        jlblQuantite = new javax.swing.JLabel();
        jbtnModif = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 600));

        jCbListeEtablissement.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbListeEtablissement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCbListeEtablissementMouseClicked(evt);
            }
        });
        jCbListeEtablissement.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbListeEtablissementItemStateChanged(evt);
            }
        });
        jCbListeEtablissement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbListeEtablissementActionPerformed(evt);
            }
        });

        jTblHebergement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Etablissement", "TypeChambre", "Quantité"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblHebergement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblHebergementMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblHebergement);
        if (jTblHebergement.getColumnModel().getColumnCount() > 0) {
            jTblHebergement.getColumnModel().getColumn(0).setResizable(false);
            jTblHebergement.getColumnModel().getColumn(1).setResizable(false);
            jTblHebergement.getColumnModel().getColumn(2).setResizable(false);
        }

        jtxtModif.setText("jTextField1");

        jlblQuantite.setText("Nombre Chambres");

        jbtnModif.setText("Modification");
        jbtnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCbListeEtablissement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jlblQuantite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jbtnModif)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jCbListeEtablissement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblQuantite)
                    .addComponent(jbtnModif))
                .addContainerGap(336, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCbListeEtablissementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbListeEtablissementActionPerformed
        if(bCharge)
            {
            String sReq = "from Etablissement Where Eta_Nom = ?";
            Query q = jfPrincipal.getSession().createQuery(sReq);
            q.setParameter(0, jCbListeEtablissement.getSelectedItem().toString());
            Etablissement unEtablissement = (Etablissement) q.uniqueResult();
            sEtablissementId = unEtablissement.getEtaId();
            chargeTable(sEtablissementId);
            }
    }//GEN-LAST:event_jCbListeEtablissementActionPerformed

    private void jCbListeEtablissementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCbListeEtablissementMouseClicked
            // TODO add your handling code here:
    }//GEN-LAST:event_jCbListeEtablissementMouseClicked

    private void jCbListeEtablissementItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbListeEtablissementItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbListeEtablissementItemStateChanged

    private void jTblHebergementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblHebergementMouseClicked
        int ligne = jTblHebergement.getSelectedRow();
        Object celluleQuantite = jTblHebergement.getValueAt(ligne,2);
        Object celluleChambre = jTblHebergement.getValueAt(ligne,1);
        sChambresId = celluleChambre.toString();
        jtxtModif.setText(celluleQuantite.toString()); // TODO add your handling code here:
    }//GEN-LAST:event_jTblHebergementMouseClicked

    private void jbtnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModifActionPerformed
        String sReq = "from Offre Where Off_Etablissement = '"+sEtablissementId+"' And Off_TypeChambre = '"+sChambresId+"'";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        Offre unOffre = (Offre) q.uniqueResult();
        unOffre.setOffNbChambres(Integer.parseInt(jtxtModif.getText()));
        Transaction tx = jfPrincipal.getSession().beginTransaction();
        tx.commit();
        jfPrincipal.getSession().update (unOffre);
        chargeTable(sEtablissementId);
    }//GEN-LAST:event_jbtnModifActionPerformed

    private void chargeTable(String sEtablissementId){
        int nbligne;
        int i;
        nbligne = jTblHebergement.getRowCount();
        if(nbligne > 0)
            {
            for(i=0;i <nbligne; i++){
                ((DefaultTableModel)jTblHebergement.getModel()).removeRow(0);
            }
        String sReq = "From Offre Where off_etablissement = ? Order by off_etablissement, off_typechambre Asc";//,Etablissement Where eta_id = off_etablissement and eta_nom = ?
        Query q = jfPrincipal.getSession().createQuery(sReq);
        q.setParameter(0, sEtablissementId);
        Iterator eta = q.iterate();
        while(eta.hasNext())
            {
            Offre unoffre = (Offre) eta.next();
            ((DefaultTableModel) jTblHebergement.getModel()).addRow(new Object[] {unoffre.getId().getOffEtablissement(),unoffre.getId().getOffTypeChambre(), unoffre.getOffNbChambres()});
            }   
        }   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jCbListeEtablissement;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblHebergement;
    private javax.swing.JButton jbtnModif;
    private javax.swing.JLabel jlblQuantite;
    private javax.swing.JTextField jtxtModif;
    // End of variables declaration//GEN-END:variables
}
