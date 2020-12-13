/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.Carreras;

import datos.Carrera;
import datos.Corredor;
import interfaz.Corredores.*;
import interfaz.PantallaPrincipal;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import logicaNegocio.LogicaNegocio;

/**
 *
 * @author JoseAndres
 */
public class Modificar_Carrera extends javax.swing.JDialog {

    private PantallaPrincipal pantallaPrincipal;
    /**
     * Creates new form Modificar_Corredor
     */
    public Modificar_Carrera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        pantallaPrincipal = (PantallaPrincipal)parent;
        initComponents();
        refrescarTabla();
        refrescarComboBoxCarreras();
        refrescarComboBoxAniadirCorredor();
        refrescarComboBoxBorrarCorredores();
        
    }
    
    public void refrescarTabla() {
    
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre", "Fecha", "Lugar", "Número máximo participantes", "Participantes"});
       
        List <Carrera> listaCarreras = LogicaNegocio.getListaCarreras();
        
        for (Carrera carrera : listaCarreras) {
        
            dtm.addRow(carrera.toArrayString());
        
        }
        
        jTableModificarCarreras.setModel(dtm);
        
     } 
    
         
    public void aniadirCarrera(Carrera carrera) {
    
        DefaultTableModel dtm = (DefaultTableModel)jTableModificarCarreras.getModel();
        dtm.addRow(carrera.toArrayString());
        
    }
    
    public void refrescarComboBoxCarreras() {
    
    List <Carrera> listaCarreras = LogicaNegocio.getListaCarreras();
        
        for (Carrera carrera : listaCarreras) {
        
             jComboBoxCarreras.addItem(carrera.getNombreCarrera());
        
        }
    
    }
    
     public void refrescarComboBoxAniadirCorredor() {
    
        jComboBoxCorredoresSinAniadir.removeAllItems();
         
        String seleccionado = (String) jComboBoxCarreras.getSelectedItem();
         
        List <Corredor> listaCorredores = LogicaNegocio.getListaCorredores();
        List <Carrera> listaCarreras = LogicaNegocio.getListaCarreras();
              
         for (int i = 0 ; i < listaCarreras.size() ; i++) {
        
            if (listaCarreras.get(i).getNombreCarrera().equals(seleccionado)) {
                
                for (int x = 0 ; x < listaCorredores.size() ; x ++) {
                
                    boolean comprobar = false;
                    
                    for (int y = 0 ; y < listaCarreras.get(i).getListaCorredores().size() ; y++) {
                    
                        if (listaCorredores.get(x) == listaCarreras.get(i).getListaCorredores().get(y)) {
                        
                            comprobar = true;
                                    
                        }
                    
                    }
                    
                    if (comprobar == false) {
                        
                        jComboBoxCorredoresSinAniadir.addItem(listaCorredores.get(x).getNombre());  
                    
                    }
                
                }
         
            }
        
        }
         
    
    }
     
    public void refrescarComboBoxBorrarCorredores() {
    
       jComboBoxBorrarCorredores.removeAllItems();
        
       String seleccionado = (String) jComboBoxCarreras.getSelectedItem();
        
       List <Corredor> listaCorredores = LogicaNegocio.getListaCorredores();
       List <Carrera> listaCarreras = LogicaNegocio.getListaCarreras();
       
        
         for (int i = 0 ; i < listaCarreras.size() ; i++) {
        
            if (listaCarreras.get(i).getNombreCarrera().equals(seleccionado)) {
                
                for (int x = 0 ; x < listaCarreras.get(i).getListaCorredores().size() ; x ++) {
                
                    jComboBoxBorrarCorredores.addItem(listaCarreras.get(i).getListaCorredores().get(x).getNombre());
                
                }
         
            }
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModificarCarreras = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonGuardarModificados = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCarreras = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelNombreCarrera = new javax.swing.JLabel();
        jLabelFechaCarrera = new javax.swing.JLabel();
        jLabelLugarCarrera = new javax.swing.JLabel();
        jLabelMaximosParticipantes = new javax.swing.JLabel();
        jTextFieldNuevoNombreCarrera = new javax.swing.JTextField();
        jTextFieldNuevaFechaCarrera = new javax.swing.JTextField();
        jTextFieldNuevoLugarCarrera = new javax.swing.JTextField();
        jTextFieldNuevoMaximoParticipantes = new javax.swing.JTextField();
        jComboBoxCorredoresSinAniadir = new javax.swing.JComboBox<>();
        jComboBoxBorrarCorredores = new javax.swing.JComboBox<>();
        jButtonAniadirCorredor = new javax.swing.JButton();
        jButtonBorrarCorredor = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableModificarCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableModificarCarreras);

        jLabel1.setText("Aquí puedes modificar las carreras");

        jButtonGuardarModificados.setText("Modificar");
        jButtonGuardarModificados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarModificadosActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Aceptar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre de la carrera a modificar:");

        jComboBoxCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCarrerasActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Original:");

        jLabelNombreCarrera.setText("Nombre de la carrera");

        jLabelFechaCarrera.setText("Fecha");

        jLabelLugarCarrera.setText("Lugar");

        jLabelMaximosParticipantes.setText("Máximos participantes");

        jTextFieldNuevoNombreCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNuevoNombreCarreraActionPerformed(evt);
            }
        });

        jTextFieldNuevoMaximoParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNuevoMaximoParticipantesActionPerformed(evt);
            }
        });

        jButtonAniadirCorredor.setText("Añadir Corredor");
        jButtonAniadirCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAniadirCorredorActionPerformed(evt);
            }
        });

        jButtonBorrarCorredor.setText("Borrar corredor");
        jButtonBorrarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarCorredorActionPerformed(evt);
            }
        });

        jLabel8.setText("Nuevos datos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNuevoNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNombreCarrera))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFechaCarrera)
                                    .addComponent(jTextFieldNuevaFechaCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNuevoLugarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelLugarCarrera))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNuevoMaximoParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMaximosParticipantes)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonGuardarModificados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jButtonAniadirCorredor)
                                .addGap(112, 112, 112)
                                .addComponent(jButtonBorrarCorredor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxCorredoresSinAniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxBorrarCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelNombreCarrera)
                    .addComponent(jLabelFechaCarrera)
                    .addComponent(jLabelLugarCarrera)
                    .addComponent(jLabelMaximosParticipantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNuevoNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNuevoMaximoParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldNuevoLugarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldNuevaFechaCarrera))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCorredoresSinAniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBorrarCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAniadirCorredor)
                    .addComponent(jButtonBorrarCorredor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarModificados)
                    .addComponent(jButtonCancelar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarModificadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarModificadosActionPerformed
       
      List <Carrera> listaCarreras = LogicaNegocio.getListaCarreras();
        
      String seleccionado = (String) jComboBoxCarreras.getSelectedItem();
       
        
        for (int i = 0 ; i < listaCarreras.size() ; i++) {
        
            if (listaCarreras.get(i).getNombreCarrera().equals(seleccionado)) {
         
                if (!jTextFieldNuevoNombreCarrera.getText().equals("")) {listaCarreras.get(i).setNombreCarrera(jTextFieldNuevoNombreCarrera.getText());}
                if (!jTextFieldNuevaFechaCarrera.getText().equals("")) {listaCarreras.get(i).setFechaCarrera(jTextFieldNuevaFechaCarrera.getText());}
                if (!jTextFieldNuevoLugarCarrera.getText().equals("")) {listaCarreras.get(i).setLugarCarrera(jTextFieldNuevoLugarCarrera.getText());}
                if (!jTextFieldNuevoMaximoParticipantes.getText().equals("")) {listaCarreras.get(i).setNumMaxParticipantes(jTextFieldNuevoMaximoParticipantes.getText());}
            }
        
        }
        
    }//GEN-LAST:event_jButtonGuardarModificadosActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldNuevoNombreCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNuevoNombreCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNuevoNombreCarreraActionPerformed

    private void jTextFieldNuevoMaximoParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNuevoMaximoParticipantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNuevoMaximoParticipantesActionPerformed

    private void jButtonAniadirCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAniadirCorredorActionPerformed

      String seleccionado = (String) jComboBoxCarreras.getSelectedItem();
      String corredorseleccionado = (String) jComboBoxCorredoresSinAniadir.getSelectedItem();
        
        List <Corredor> listaCorredores = LogicaNegocio.getListaCorredores();
        List <Carrera> listaCarreras = LogicaNegocio.getListaCarreras();
        
         for (int i = 0 ; i < listaCarreras.size() ; i++) {
        
            if (listaCarreras.get(i).getNombreCarrera().equals(seleccionado)) {
                
                for (int x = 0; x < listaCorredores.size() ; x++) {
                
                    if (listaCorredores.get(x).getNombre().equals(corredorseleccionado)) {
                    
                        listaCarreras.get(i).getListaCorredores().add(listaCorredores.get(x));
                    
                    }
                
                }
         
            }
        
        }
         
         refrescarComboBoxAniadirCorredor();
         refrescarComboBoxBorrarCorredores();
               
        
        
    }//GEN-LAST:event_jButtonAniadirCorredorActionPerformed

    private void jButtonBorrarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarCorredorActionPerformed
        
        String seleccionado = (String) jComboBoxCarreras.getSelectedItem();
        
        List <Corredor> listaCorredores = LogicaNegocio.getListaCorredores();
        List <Carrera> listaCarreras = LogicaNegocio.getListaCarreras();
        
         for (int i = 0 ; i < listaCarreras.size() ; i++) {
        
            if (listaCarreras.get(i).getNombreCarrera().equals(seleccionado)) {
                
                for (int x = 0 ; x < listaCarreras.get(i).getListaCorredores().size() ; x ++) {
                
                    if (listaCarreras.get(i).getListaCorredores().get(x).getNombre().equals(jComboBoxBorrarCorredores.getSelectedItem())) {
                    
                        listaCarreras.get(i).getListaCorredores().remove(x);
                    
                    }
                
                }
         
            }
        
        }
         
         refrescarComboBoxAniadirCorredor();
         refrescarComboBoxBorrarCorredores();
       
        
    //    refrescarComboBox();
 
        
    }//GEN-LAST:event_jButtonBorrarCorredorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String seleccionado = (String) jComboBoxCarreras.getSelectedItem();
        
        List <Carrera> listaCarreras = LogicaNegocio.getListaCarreras();
        
        for (int i = 0 ; i < listaCarreras.size() ; i++) {
        
            if (listaCarreras.get(i).getNombreCarrera().equals(seleccionado)) {
            
                jLabelNombreCarrera.setText(listaCarreras.get(i).getNombreCarrera());
                jLabelFechaCarrera.setText(listaCarreras.get(i).getFechaCarrera());
                jLabelLugarCarrera.setText(listaCarreras.get(i).getLugarCarrera());
                jLabelMaximosParticipantes.setText(listaCarreras.get(i).getNumMaxParticipantes());
            
            }
        
        }
        
        refrescarComboBoxAniadirCorredor();
        refrescarComboBoxBorrarCorredores();
        refrescarTabla();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCarrerasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCarrerasActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAniadirCorredor;
    private javax.swing.JButton jButtonBorrarCorredor;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardarModificados;
    private javax.swing.JComboBox<String> jComboBoxBorrarCorredores;
    private javax.swing.JComboBox<String> jComboBoxCarreras;
    private javax.swing.JComboBox<String> jComboBoxCorredoresSinAniadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFechaCarrera;
    private javax.swing.JLabel jLabelLugarCarrera;
    private javax.swing.JLabel jLabelMaximosParticipantes;
    private javax.swing.JLabel jLabelNombreCarrera;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableModificarCarreras;
    private javax.swing.JTextField jTextFieldNuevaFechaCarrera;
    private javax.swing.JTextField jTextFieldNuevoLugarCarrera;
    private javax.swing.JTextField jTextFieldNuevoMaximoParticipantes;
    private javax.swing.JTextField jTextFieldNuevoNombreCarrera;
    // End of variables declaration//GEN-END:variables
}
