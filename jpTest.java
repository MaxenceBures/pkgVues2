/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgVues;

import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import pkgEntites.Etablissement;
import pkgEntites.Offre;

/**
 *
 * @author Maxence
 */
public class jpTest extends javax.swing.JPanel {

    /**
     * Creates new form jpTest
     */
    public jpTest() {
        initComponents();
       // chargeTable();
    }

    public void chargeListe(){
        String sReq = "From Etablissement";
         Query q = jfPrincipal.getSession().createQuery(sReq);
         jCbListeEtablissement.removeAllItems();
         Iterator eta = q.iterate();
         while(eta.hasNext()){
            Etablissement unEtablissement = (Etablissement) eta.next();
            jCbListeEtablissement.addItem(unEtablissement.getEtaNom());
            
        }
        
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
        jTable1 = new javax.swing.JTable();
        jtxtModif = new javax.swing.JTextField();

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jtxtModif.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jCbListeEtablissement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jCbListeEtablissement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jtxtModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCbListeEtablissementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbListeEtablissementActionPerformed
      
        chargeTable();
       
    }//GEN-LAST:event_jCbListeEtablissementActionPerformed

    private void jCbListeEtablissementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCbListeEtablissementMouseClicked
            // TODO add your handling code here:
    }//GEN-LAST:event_jCbListeEtablissementMouseClicked

    private void jCbListeEtablissementItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbListeEtablissementItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbListeEtablissementItemStateChanged

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int ligne = jTable1.getSelectedRow();//Si tu veut la ligne selectionnée
        Object cellule = jTable1.getValueAt(ligne,2);
       String result = cellule.toString();
      // result = 
       // System.out.println(result);
                
        jtxtModif.setText(result); // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void chargeTable(){
    
       int nbligne;
       int i;
        nbligne = jTable1.getRowCount();
        if(nbligne > 0){
            for(i=0;i <nbligne; i++){
                ((DefaultTableModel)jTable1.getModel()).removeRow(0);
            }
        String sReq = "From Offre Order by off_etablissement, off_typechambre Asc";//,Etablissement Where eta_id = off_etablissement and eta_nom = ?
        Query q = jfPrincipal.getSession().createQuery(sReq);
        //q.setParameter(0, jCbListeEtablissement.getSelectedItem());
        Iterator eta = q.iterate();
        while(eta.hasNext()){
            Offre unoffre = (Offre) eta.next();
            ((DefaultTableModel) jTable1.getModel()).addRow(new Object[] {unoffre.getId().getOffEtablissement(),unoffre.getId().getOffTypeChambre(), unoffre.getOffNbChambres()});

        }   
        }
          
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jCbListeEtablissement;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxtModif;
    // End of variables declaration//GEN-END:variables
}
