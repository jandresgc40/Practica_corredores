/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.Corredores;

import datos.Corredor;
import interfaz.PantallaPrincipal;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import logicaNegocio.LogicaNegocio;

/**
 *
 * @author JoseAndres
 */
public class Modificar_Corredor extends javax.swing.JDialog {

    private PantallaPrincipal pantallaPrincipal;
    /**
     * Creates new form Modificar_Corredor
     */
    public Modificar_Corredor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        pantallaPrincipal = (PantallaPrincipal)parent;
        initComponents();
        refrescarTabla();
        refrescarComboBox();
        
    }

     public void refrescarTabla() {
    
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre", "DNI", "Fecha de Nacimiento", "Dirección", "Teléfono"});
       
        List <Corredor> listaCorredores = LogicaNegocio.getListaCorredores();
        
        for (Corredor corredor : listaCorredores) {
        
            dtm.addRow(corredor.toArrayString());
        
        }
        
        
        jTableModificarJugadores.setModel(dtm);
            
    }
     
    public void refrescarComboBox() {
    
    List <Corredor> listaCorredores = LogicaNegocio.getListaCorredores();
        
        for (Corredor corredor : listaCorredores) {
        
             jComboBoxCorredores.addItem(corredor.getNombre());
        
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
        jTableModificarJugadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jTextFieldNuevoDni = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelfechaNacimiento = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldNuevoNombre = new javax.swing.JTextField();
        jTextFieldNuevaFecha = new javax.swing.JTextField();
        jTextFieldNuevaDireccion = new javax.swing.JTextField();
        jTextFieldNuevoTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCorredores = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButtonActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableModificarJugadores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableModificarJugadores);

        jLabel1.setText("Aquí puedes modificar los corredores");

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jTextFieldNuevoDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNuevoDniActionPerformed(evt);
            }
        });

        jLabelNombre.setText("Nombre");

        jLabelDni.setText("DNI");

        jLabelfechaNacimiento.setText("Fecha Nacimiento");

        jLabelDireccion.setText("Dirección");

        jLabelTelefono.setText("Teléfono");

        jTextFieldNuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNuevoNombreActionPerformed(evt);
            }
        });

        jTextFieldNuevaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNuevaFechaActionPerformed(evt);
            }
        });

        jTextFieldNuevaDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNuevaDireccionActionPerformed(evt);
            }
        });

        jTextFieldNuevoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNuevoTelefonoActionPerformed(evt);
            }
        });

        jLabel2.setText("Original:");

        jLabel3.setText("Nuevo dato:");

        jComboBoxCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCorredoresActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre del corredor a modificar: ");

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNuevoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelfechaNacimiento)
                                    .addComponent(jTextFieldNuevaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNuevaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jTextFieldNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCorredores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabel2))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDni)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelDireccion)
                                .addComponent(jLabelTelefono)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNuevoDni)
                            .addComponent(jTextFieldNuevaFecha)
                            .addComponent(jTextFieldNuevaDireccion)
                            .addComponent(jTextFieldNuevoTelefono))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonAceptar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
           
      List <Corredor> listaCorredores = LogicaNegocio.getListaCorredores();
        
      String seleccionado = (String) jComboBoxCorredores.getSelectedItem();
       
        
        for (int i = 0 ; i < listaCorredores.size() ; i++) {
        
            if (listaCorredores.get(i).getNombre().equals(seleccionado)) {
         
                if (!jTextFieldNuevoNombre.getText().equals("")) {listaCorredores.get(i).setNombre(jTextFieldNuevoNombre.getText());}
                if (!jTextFieldNuevoDni.getText().equals("")) {listaCorredores.get(i).setDni(jTextFieldNuevoDni.getText());}
                if (!jTextFieldNuevaFecha.getText().equals("")) {listaCorredores.get(i).setFechaNacimiento(jTextFieldNuevaFecha.getText());}
                if (!jTextFieldNuevaDireccion.getText().equals("")) {listaCorredores.get(i).setDireccion(jTextFieldNuevaDireccion.getText());}
                if (!jTextFieldNuevoTelefono.getText().equals("")) {listaCorredores.get(i).setTelefonoContacto(jTextFieldNuevoTelefono.getText());}
               
            }
        
        }
        
        refrescarTabla();
        
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jTextFieldNuevoDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNuevoDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNuevoDniActionPerformed

    private void jTextFieldNuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNuevoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNuevoNombreActionPerformed

    private void jTextFieldNuevaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNuevaFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNuevaFechaActionPerformed

    private void jTextFieldNuevaDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNuevaDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNuevaDireccionActionPerformed

    private void jComboBoxCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCorredoresActionPerformed
        
        
        
    }//GEN-LAST:event_jComboBoxCorredoresActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        
        String seleccionado = (String) jComboBoxCorredores.getSelectedItem();
        
        List <Corredor> listaCorredores = LogicaNegocio.getListaCorredores();
        
        for (int i = 0 ; i < listaCorredores.size() ; i++) {
        
            if (listaCorredores.get(i).getNombre().equals(seleccionado)) {
            
                jLabelNombre.setText(listaCorredores.get(i).getNombre());
                jLabelDni.setText(listaCorredores.get(i).getDni());
                jLabelfechaNacimiento.setText(listaCorredores.get(i).getFechaNacimiento());
                jLabelDireccion.setText(listaCorredores.get(i).getDireccion());
                jLabelTelefono.setText(listaCorredores.get(i).getTelefonoContacto());
            
            }
        
        }
        
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTextFieldNuevoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNuevoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNuevoTelefonoActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxCorredores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelfechaNacimiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableModificarJugadores;
    private javax.swing.JTextField jTextFieldNuevaDireccion;
    private javax.swing.JTextField jTextFieldNuevaFecha;
    private javax.swing.JTextField jTextFieldNuevoDni;
    private javax.swing.JTextField jTextFieldNuevoNombre;
    private javax.swing.JTextField jTextFieldNuevoTelefono;
    // End of variables declaration//GEN-END:variables
}
