/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.Corredores;

import datos.Corredor;
import logicaNegocio.LogicaNegocio;

/**
 *
 * @author Ovejo
 */
public class Alta_Corredor extends javax.swing.JDialog {

   
    public Alta_Corredor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNombreCorredor = new javax.swing.JTextField();
        jTextFieldDniCorredor = new javax.swing.JTextField();
        jTextFieldFechaNacimientoCorredor = new javax.swing.JTextField();
        jTextFieldDireccionCorredor = new javax.swing.JTextField();
        jTextFieldTelefonoCorredor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonAltaCorredor = new javax.swing.JButton();
        jButtonCancelarAltaCorredor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldNombreCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreCorredorActionPerformed(evt);
            }
        });

        jTextFieldFechaNacimientoCorredor.setText("dd-MM-aaaa");
        jTextFieldFechaNacimientoCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaNacimientoCorredorActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("DNI:");

        jLabel3.setText("Fecha de nacimiento:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Teléfono de contacto:");

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
                            .addComponent(jTextFieldNombreCorredor)
                            .addComponent(jTextFieldDniCorredor)
                            .addComponent(jTextFieldFechaNacimientoCorredor)
                            .addComponent(jTextFieldDireccionCorredor)
                            .addComponent(jTextFieldTelefonoCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButtonAltaCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelarAltaCorredor)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDniCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFechaNacimientoCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDireccionCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefonoCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarAltaCorredor)
                    .addComponent(jButtonAltaCorredor))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarAltaCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAltaCorredorActionPerformed

        setVisible(false);

    }//GEN-LAST:event_jButtonCancelarAltaCorredorActionPerformed

    private void jTextFieldNombreCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreCorredorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreCorredorActionPerformed

    private void jTextFieldFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaNacimientoActionPerformed

    private void jTextFieldDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDniActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jButtonAltaCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaCorredorActionPerformed
       
        String nombre = jTextFieldNombreCorredor.getText();
        String dni = jTextFieldDniCorredor.getText();
        String fechaNacimiento = jTextFieldFechaNacimientoCorredor.getText(); 
        String direccion = jTextFieldDireccionCorredor.getText();
        String telefonoContacto = jTextFieldTelefonoCorredor.getText();
        
        Corredor corredor = new Corredor(nombre, dni, fechaNacimiento, direccion, telefonoContacto);
    
        LogicaNegocio.aniadirCorredor(corredor);
        dispose();
        
    }//GEN-LAST:event_jButtonAltaCorredorActionPerformed

    private void jTextFieldFechaNacimientoCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaNacimientoCorredorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaNacimientoCorredorActionPerformed

   
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAltaCorredor;
    private javax.swing.JButton jButtonCancelarAltaCorredor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldDireccionCorredor;
    private javax.swing.JTextField jTextFieldDniCorredor;
    private javax.swing.JTextField jTextFieldFechaNacimientoCorredor;
    private javax.swing.JTextField jTextFieldNombreCorredor;
    private javax.swing.JTextField jTextFieldTelefonoCorredor;
    // End of variables declaration//GEN-END:variables
}
