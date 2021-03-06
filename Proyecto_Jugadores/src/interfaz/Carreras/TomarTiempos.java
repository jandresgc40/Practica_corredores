/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.Carreras;

import datos.Carrera;
import datos.Corredor;
import datos.InformeCarrera;
import interfaz.PantallaPrincipal;
import java.util.List;
import logicaNegocio.LogicaNegocio;

/**
 *
 * @author JoseAndres
 */
public class TomarTiempos extends javax.swing.JDialog {

    private PantallaPrincipal pantallaPrincipal;
    /**
     * Creates new form TomarTiempos
     */
    
    public String tiempo;
    
    public TomarTiempos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        pantallaPrincipal = (PantallaPrincipal)parent;
        initComponents();
        refrescarComboBox1();
        refrescarComboBox2();
        
    }
    
    public void refrescarComboBox1() {
    
    List <Carrera> listaCarreras = LogicaNegocio.getListaCarreras();
        
        for (Carrera carrera : listaCarreras) {
        
             jComboBoxListaCarreras.addItem(carrera.getNombreCarrera());
        
        }
    
    }
    
     public void refrescarComboBox2() {
    
        String seleccionado = (String) jComboBoxListaCarreras.getSelectedItem();
        
        String dorsal = "";
        int numeroDorsal = 0;
        
        List <Corredor> listaCorredores;
        List <Carrera> listaCarreras = LogicaNegocio.getListaCarreras();
              
         for (int i = 0 ; i < listaCarreras.size() ; i++) {
        
            if (listaCarreras.get(i).getNombreCarrera().equals(seleccionado)) {
                
                listaCorredores = listaCarreras.get(i).getListaCorredores();
                
                for (int x = 0 ; x < listaCorredores.size() ; x ++) {
                
                    numeroDorsal = x + 1;
                    
                    dorsal = String.valueOf(numeroDorsal);
                    
                    jComboBoxDorsal.addItem(dorsal);
                
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

        jLabel1 = new javax.swing.JLabel();
        jButtonTiempoCorredor = new javax.swing.JButton();
        jComboBoxDorsal = new javax.swing.JComboBox<>();
        jButtonSalir = new javax.swing.JButton();
        jComboBoxListaCarreras = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButtonIniciarTemporizador = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        relojDigital1 = new relojdigital.RelojDigital();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Carrera:");

        jButtonTiempoCorredor.setText("Tiempo");
        jButtonTiempoCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTiempoCorredorActionPerformed(evt);
            }
        });

        jComboBoxDorsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDorsalActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Dorsal:");

        jButtonIniciarTemporizador.setText("Iniciar");
        jButtonIniciarTemporizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarTemporizadorActionPerformed(evt);
            }
        });

        jButton1.setText("Fin de la carrera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        relojDigital1.setFormato24(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxListaCarreras, 0, 167, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonTiempoCorredor))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(48, 48, 48))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(relojDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButtonIniciarTemporizador, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 332, Short.MAX_VALUE)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxListaCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIniciarTemporizador)
                    .addComponent(relojDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTiempoCorredor)
                    .addComponent(jComboBoxDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalir)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDorsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDorsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDorsalActionPerformed

    private void jButtonTiempoCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTiempoCorredorActionPerformed

        String dorsal = (String) jComboBoxDorsal.getSelectedItem();
             
        String tiempoCorredor = relojDigital1.getText();
     
        String minutosCorredor = tiempoCorredor.substring(3,5);
        String segundosCorredor = tiempoCorredor.substring(6,8);
        
   
        String minutosInicio = tiempo.substring(3,5);
        String segundosInicio = tiempo.substring(6,8);

        int minutoFinal = 0;
        int segundoFinal = 0;
        
        Integer.parseInt(minutosCorredor);
        Integer.parseInt(minutosInicio);
        
        if (Integer.parseInt(minutosCorredor) >= Integer.parseInt(minutosInicio)) {
            
            minutoFinal = Integer.parseInt(minutosCorredor) - Integer.parseInt(minutosInicio);
        
        } else if (Integer.parseInt(minutosCorredor) < Integer.parseInt(minutosInicio)) {
        
            minutoFinal = Integer.parseInt(minutosCorredor) + (60 - Integer.parseInt(minutosInicio));
        
        }
         if (Integer.parseInt(segundosCorredor) >= Integer.parseInt(segundosInicio)) {
            
            segundoFinal = Integer.parseInt(segundosCorredor) - Integer.parseInt(segundosInicio);
        
        } else if (Integer.parseInt(segundosCorredor) < Integer.parseInt(segundosInicio)) {
        
            segundoFinal = Integer.parseInt(segundosCorredor) + (60 - Integer.parseInt(segundosInicio));
        
        }
    
        String tiempoFinal = String.valueOf(minutoFinal) + ":" + String.valueOf(segundoFinal);;
               
        String seleccionado = (String) jComboBoxListaCarreras.getSelectedItem();
       
        List <Corredor> listaCorredores;
        List <Carrera> listaCarreras = LogicaNegocio.getListaCarreras();
              
         for (int i = 0 ; i < listaCarreras.size() ; i++) {
        
            if (listaCarreras.get(i).getNombreCarrera().equals(seleccionado)) {
                          
                InformeCarrera informeCarrera = new InformeCarrera(tiempoFinal, dorsal);   
                listaCarreras.get(i).getInformeCarrera().add(informeCarrera);
                
            }
        
        }
        
        
    }//GEN-LAST:event_jButtonTiempoCorredorActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
       
        setVisible(false);
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonIniciarTemporizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarTemporizadorActionPerformed
        
           tiempo = relojDigital1.getText();
        
    }//GEN-LAST:event_jButtonIniciarTemporizadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         List <Carrera> listaCarreras = LogicaNegocio.getListaCarreras();
         List <Carrera> listaCarrerasTerminadas = LogicaNegocio.getListaCarrerasTerminadas();

         String seleccionado = (String) jComboBoxListaCarreras.getSelectedItem();
              
         for (int i = 0 ; i < listaCarreras.size() ; i++) {
        
            if (listaCarreras.get(i).getNombreCarrera().equals(seleccionado)) {
                
                listaCarrerasTerminadas.add(listaCarreras.get(i));
                listaCarreras.remove(i);
                
            }
        
        }
        
        dispose();
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonIniciarTemporizador;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonTiempoCorredor;
    private javax.swing.JComboBox<String> jComboBoxDorsal;
    private javax.swing.JComboBox<String> jComboBoxListaCarreras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private relojdigital.RelojDigital relojDigital1;
    // End of variables declaration//GEN-END:variables
}
