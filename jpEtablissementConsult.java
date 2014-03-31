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



/**
 *
 * @author Maxence
 */
public class jpEtablissementConsult extends javax.swing.JPanel {
   
//Session session = HibernateUtil.getSessionFactory().openSession();
    /**
     * Creates new form jpEtablissementConsult
     */
    public jpEtablissementConsult() {
        initComponents();
        jcbccivil.removeAllItems();
        jcbctype.removeAllItems();
        jcbccivil.addItem("Monsieur");
        jcbccivil.addItem("Madame");
        jcbctype.addItem("Ecole Publique");
        jcbctype.addItem("Ecole Privée");
        jcbctype.addItem("Autres");
        jtxtid.disable();
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblconsult = new javax.swing.JLabel();
        jbtnModif = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblconsult = new javax.swing.JTable();
        lblnom = new javax.swing.JLabel();
        jtxtnom = new javax.swing.JTextField();
        jtxtville = new javax.swing.JTextField();
        jtxtcp = new javax.swing.JTextField();
        jcbctype = new javax.swing.JComboBox();
        lbletablissement = new javax.swing.JLabel();
        lblville = new javax.swing.JLabel();
        jtxtadresse = new javax.swing.JTextField();
        jcbccivil = new javax.swing.JComboBox();
        lblcp = new javax.swing.JLabel();
        lblrespnom1 = new javax.swing.JLabel();
        jtxtid = new javax.swing.JTextField();
        lbladresse = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        jtxttelephone = new javax.swing.JTextField();
        lbltelephone = new javax.swing.JLabel();
        lblmail = new javax.swing.JLabel();
        jtxtmail = new javax.swing.JTextField();
        lbltype = new javax.swing.JLabel();
        lblresponsable = new javax.swing.JLabel();
        lblrespnom = new javax.swing.JLabel();
        jtxtrespnom = new javax.swing.JTextField();
        lblrespprenom = new javax.swing.JLabel();
        jtxtrespprenom = new javax.swing.JTextField();

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        lblconsult.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblconsult.setText("Consultation/Modification");

        jbtnModif.setText("Modification");
        jbtnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModifActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 200));
        jScrollPane1.setSize(new java.awt.Dimension(200, 200));

        tblconsult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nom", "Ville", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblconsult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblconsultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblconsult);
        if (tblconsult.getColumnModel().getColumnCount() > 0) {
            tblconsult.getColumnModel().getColumn(0).setResizable(false);
            tblconsult.getColumnModel().getColumn(1).setResizable(false);
            tblconsult.getColumnModel().getColumn(1).setPreferredWidth(250);
            tblconsult.getColumnModel().getColumn(2).setResizable(false);
            tblconsult.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblconsult.getColumnModel().getColumn(3).setResizable(false);
            tblconsult.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        lblnom.setText("Nom");

        jcbctype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbctype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbctypeActionPerformed(evt);
            }
        });

        lbletablissement.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbletablissement.setText("Etablissement");

        lblville.setText("Ville");

        jcbccivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbccivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbccivilActionPerformed(evt);
            }
        });

        lblcp.setText("Code Postal");

        lblrespnom1.setText("Civilité");

        lbladresse.setText("Adresse");

        lblid.setText("Id");

        lbltelephone.setText("Telephone");

        lblmail.setText("Mail");

        lbltype.setText("Type");

        lblresponsable.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblresponsable.setText("Responsable");

        lblrespnom.setText("Nom");

        lblrespprenom.setText("Prenom");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnModif)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblconsult)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblid)
                                .addComponent(lbladresse))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblnom)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtxtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtxtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbltelephone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblcp)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtxtcp, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(37, 37, 37)
                            .addComponent(lblville)
                            .addGap(18, 18, 18)
                            .addComponent(jtxtville, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbletablissement, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lbltype)
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblmail)
                                .addComponent(jcbctype, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jtxtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblresponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblrespnom1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblrespnom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtrespnom, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblrespprenom)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtrespprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcbccivil, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblconsult, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(lbletablissement, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblnom)
                        .addComponent(jtxtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblid)
                        .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladresse)
                    .addComponent(jtxtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcp)
                    .addComponent(jtxtcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblville)
                    .addComponent(jtxtville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelephone)
                    .addComponent(jtxttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmail)
                    .addComponent(jtxtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltype))
                .addGap(18, 18, 18)
                .addComponent(lblresponsable, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbccivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrespnom1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrespnom)
                    .addComponent(jtxtrespnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrespprenom)
                    .addComponent(jtxtrespprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jbtnModif)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModifActionPerformed
        Byte type = 3;
        String sReq = "from Etablissement Where Eta_Id = ?";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        q.setParameter(0, jtxtid.getText());
            Etablissement unEtablissement = (Etablissement) q.uniqueResult();
            unEtablissement.setEtaNom(jtxtnom.getText());
            unEtablissement.setEtaRue(jtxtadresse.getText());
            unEtablissement.setEtaCp(jtxtcp.getText());
            unEtablissement.setEtaVille(jtxtville.getText());
            unEtablissement.setEtaTel(jtxttelephone.getText());
            unEtablissement.setEtaMail(jtxtmail.getText());

           if(jcbctype.getSelectedItem().toString() == "Ecole Publique")
            {
                type = 0;
            }
           else if(jcbctype.getSelectedItem().toString() == "Ecole Privée")
            {
                type = 1;
            }
           else if(jcbctype.getSelectedItem().toString() == "Autres")
            {
                type = 2;
            }
           unEtablissement.setEtaType(type.byteValue());
           unEtablissement.setEtaNomResp(jtxtrespnom.getText());
           unEtablissement.setEtaPrenomResp(jtxtrespprenom.getText());
           unEtablissement.setEtaCivilResp(jcbccivil.getSelectedItem().toString());
           Transaction tx = jfPrincipal.getSession().beginTransaction();
           tx.commit();
           jfPrincipal.getSession().update (unEtablissement);
           chargerTable();
        // txatest.setText(sResultat);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnModifActionPerformed

    private void tblconsultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblconsultMouseClicked
        int ligne = tblconsult.getSelectedRow();//Si tu veut la ligne selectionnée
        Object cellule = tblconsult.getValueAt(ligne,0);
       String result = cellule.toString();
      // result = 
       // System.out.println(result);
                
        chargerChamps(cellule);
       // chargerTable();
        
                // TODO add your handling code here:
    }//GEN-LAST:event_tblconsultMouseClicked

    private void jcbctypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbctypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbctypeActionPerformed

    private void jcbccivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbccivilActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jcbccivilActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
          // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
  
                // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved
    private void chargerChamps(Object cellule){
        String sReq = "From Etablissement Where Eta_Id = ?";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        q.setParameter(0, cellule);
        Etablissement unEtablissement = (Etablissement) q.uniqueResult();
        jtxtid.setText(unEtablissement.getEtaId());
        jtxtnom.setText(unEtablissement.getEtaNom());
        jtxtadresse.setText(unEtablissement.getEtaRue());
        jtxtcp.setText(unEtablissement.getEtaCp());
        jtxtville.setText(unEtablissement.getEtaVille());
        jtxttelephone.setText(unEtablissement.getEtaTel());
        jtxtmail.setText(unEtablissement.getEtaMail());
        jtxtrespnom.setText(unEtablissement.getEtaNomResp());
        jtxtrespprenom.setText(unEtablissement.getEtaPrenomResp());

    }
    
    public void chargerTable(){
        
       Etablissement unEtablissementTransfert = new Etablissement();
       int nbligne;
       int i;
        nbligne = tblconsult.getRowCount();
        if(nbligne > 0){
            for(i=0;i <nbligne; i++){
                ((DefaultTableModel)tblconsult.getModel()).removeRow(0);
            }
        String sReq = "From Etablissement";
        
        Query q = jfPrincipal.getSession().createQuery(sReq);
        Iterator eta = q.iterate();
        while(eta.hasNext()){
            Etablissement unEtablissement = (Etablissement) eta.next();
            ((DefaultTableModel) tblconsult.getModel()).addRow(new Object[] {unEtablissement.getEtaId(), unEtablissement.getEtaNom(), unEtablissement.getEtaVille(), unEtablissement.getEtaType()});

        }   
        }
        
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnModif;
    private javax.swing.JComboBox jcbccivil;
    private javax.swing.JComboBox jcbctype;
    private javax.swing.JTextField jtxtadresse;
    private javax.swing.JTextField jtxtcp;
    private javax.swing.JTextField jtxtid;
    private javax.swing.JTextField jtxtmail;
    private javax.swing.JTextField jtxtnom;
    private javax.swing.JTextField jtxtrespnom;
    private javax.swing.JTextField jtxtrespprenom;
    private javax.swing.JTextField jtxttelephone;
    private javax.swing.JTextField jtxtville;
    private javax.swing.JLabel lbladresse;
    private javax.swing.JLabel lblconsult;
    private javax.swing.JLabel lblcp;
    private javax.swing.JLabel lbletablissement;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblmail;
    private javax.swing.JLabel lblnom;
    private javax.swing.JLabel lblrespnom;
    private javax.swing.JLabel lblrespnom1;
    private javax.swing.JLabel lblresponsable;
    private javax.swing.JLabel lblrespprenom;
    private javax.swing.JLabel lbltelephone;
    private javax.swing.JLabel lbltype;
    private javax.swing.JLabel lblville;
    private javax.swing.JTable tblconsult;
    // End of variables declaration//GEN-END:variables
}
