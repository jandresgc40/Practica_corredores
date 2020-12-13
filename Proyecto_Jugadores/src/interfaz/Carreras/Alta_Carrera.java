/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.Carreras;

import datos.Carrera;
import datos.Corredor;
import datos.InformeCarrera;
import interfaz.Corredores.*;
import interfaz.PantallaPrincipal;
import java.util.ArrayList;
import java.util.List;
import logicaNegocio.LogicaNegocio;

/**
 *
 * @author JoseAndres
 */
public class Alta_Carrera extends javax.swing.JDialog {

    private PantallaPrincipal pantallaPrincipal;
    
    List <Corredor> listaCorredoresSeleccionados = new ArrayList<>();
    
    
    /**
     * Creates new form Alta_Corredor
     */
    public Alta_Carrera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        pantallaPrincipal = (PantallaPrincipal)parent;
        initComponents();
        refrescarComboBox();
        
    }
    
    public void refrescarComboBox() {
    
    List <Corredor> listaCorredores = LogicaNegocio.getListaCorredores();
        
        for (Corredor corredor : listaCorredores) {
        
             jComboBoxCorredores.addItem(corredor.getNombre());
        
        }
    
    }
    
    public void aniadirCorredorACarrera() {
    
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNombreCarrera = new javax.swing.JTextField();
        jTextFieldFechaCarrera = new javax.swing.JTextField();
        jTextFieldLugarCarrera = new javax.swing.JTextField();
        jTextFieldMaximoParticipantes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonAltaCorredor = new javax.swing.JButton();
        jButtonCancelarAltaCorredor = new javax.swing.JButton();
        jComboBoxCorredores = new javax.swing.JComboBox<>();
        jButtonAnadirCorredorCarrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldNombreCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreCarreraActionPerformed(evt);
            }
        });

        jTextFieldFechaCarrera.setText("dd-MM-aaaa");

        jTextFieldLugarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLugarCarreraActionPerformed(evt);
            }
        });

        jTextFieldMaximoParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaximoParticipantesActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre carrera:");

        jLabel2.setText("Fecha carrera");

        jLabel3.setText("Lugar carrera:");

        jLabel4.setText("Máximo de participantes:");

        jLabel5.setText("Lista de corredores: ");

        jButtonAltaCorredor.setText("Alta");
        jButtonAltaCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaCorredorActionPerformed(evt);
            }
        });

        jButtonCancelarAltaCorredor.setText("Cancelar");
        jButtonCancelarAltaCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAltaCorredorActionPerformed(evt);
            }
        });

        jComboBoxCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCorredoresActionPerformed(evt);
            }
        });

        jButtonAnadirCorredorCarrera.setText("Añadir");
        jButtonAnadirCorredorCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirCorredorCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombreCarrera)
                            .addComponent(jTextFieldFechaCarrera)
                            .addComponent(jTextFieldLugarCarrera)
                            .addComponent(jTextFieldMaximoParticipantes)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAnadirCorredorCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButtonAltaCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelarAltaCorredor)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFechaCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLugarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMaximoParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnadirCorredorCarrera))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarAltaCorredor)
                    .addComponent(jButtonAltaCorredor))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreCarreraActionPerformed

    private void jTextFieldLugarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLugarCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLugarCarreraActionPerformed

    private void jButtonAnadirCorredorCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirCorredorCarreraActionPerformed
    
        String seleccionado = (String) jComboBoxCorredores.getSelectedItem();
        
        List <Corredor> listaCorredores = LogicaNegocio.getListaCorredores();
        
         for (int i = 0 ; i < listaCorredores.size() ; i++) {
        
            if (listaCorredores.get(i).getNombre().equals(seleccionado)) {
            
                listaCorredoresSeleccionados.add(listaCorredores.get(i));
            
            }
        
        
        }
       
    }//GEN-LAST:event_jButtonAnadirCorredorCarreraActionPerformed

    private void jButtonCancelarAltaCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAltaCorredorActionPerformed
        
        setVisible(false);
        
    }//GEN-LAST:event_jButtonCancelarAltaCorredorActionPerformed

    private void jTextFieldMaximoParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaximoParticipantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaximoParticipantesActionPerformed

    private void jButtonAltaCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaCorredorActionPerformed
     
        String nombre = jTextFieldNombreCarrera.getText();
        String fecha = jTextFieldFechaCarrera.getText();
        String lugar = jTextFieldLugarCarrera.getText(); 
        String participantes = jTextFieldMaximoParticipantes.getText();
        List <InformeCarrera> informeCarrera = new ArrayList <InformeCarrera>();
      //  List<Corredor> listaCorredores = jTextFieldTelefonoCorredor.getText();
        
        Carrera carrera = new Carrera(nombre,fecha,lugar,participantes, listaCorredoresSeleccionados, informeCarrera);
    
        LogicaNegocio.aniadirCarrera(carrera);
        
        listaCorredoresSeleccionados = new ArrayList<>();
        
        dispose();
        
    }//GEN-LAST:event_jButtonAltaCorredorActionPerformed

    private void jComboBoxCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCorredoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCorredoresActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAltaCorredor;
    private javax.swing.JButton jButtonAnadirCorredorCarrera;
    private javax.swing.JButton jButtonCancelarAltaCorredor;
    private javax.swing.JComboBox<String> jComboBoxCorredores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldFechaCarrera;
    private javax.swing.JTextField jTextFieldLugarCarrera;
    private javax.swing.JTextField jTextFieldMaximoParticipantes;
    private javax.swing.JTextField jTextFieldNombreCarrera;
    // End of variables declaration//GEN-END:variables
}
