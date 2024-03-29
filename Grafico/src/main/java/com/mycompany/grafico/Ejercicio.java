/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.grafico;

/**
 *
 * @author PILARES
 */
public class Ejercicio extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio
     */
    public Ejercicio() {
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

        textonombre = new javax.swing.JLabel();
        cajatextonombre = new javax.swing.JTextField();
        textoapellido = new javax.swing.JLabel();
        cajatextoapellido = new javax.swing.JTextField();
        textofechanac = new javax.swing.JLabel();
        cajatextoanio = new javax.swing.JTextField();
        botonenviar = new javax.swing.JButton();
        botonborrar = new javax.swing.JButton();
        textodatos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textonombre.setText("Nombre:");

        textoapellido.setText("Apellido:");

        textofechanac.setText("Fecha de nacimiento:");

        botonenviar.setText("enviar");
        botonenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonenviarActionPerformed(evt);
            }
        });

        botonborrar.setText("borrar");
        botonborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonborrarActionPerformed(evt);
            }
        });

        textodatos.setText("Datos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textofechanac)
                            .addComponent(textoapellido)
                            .addComponent(textonombre)
                            .addComponent(cajatextonombre)
                            .addComponent(cajatextoapellido)
                            .addComponent(cajatextoanio, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textodatos)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(botonenviar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(botonborrar)))))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(textonombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajatextonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(textoapellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajatextoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(textofechanac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajatextoanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonenviar)
                    .addComponent(botonborrar))
                .addGap(40, 40, 40)
                .addComponent(textodatos)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonborrarActionPerformed
        cajatextonombre.setText("");
        cajatextoapellido.setText("");
        cajatextoanio.setText("");
        textodatos.setText("");
    }//GEN-LAST:event_botonborrarActionPerformed

    private void botonenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonenviarActionPerformed
        String nombre=cajatextonombre.getText();
        String apellido=cajatextoapellido.getText();
        int anio=Integer.parseInt(cajatextoanio.getText());
        
       textodatos.setText(textodatos.getText() + nombre + " " + apellido + " edad:" + (2023 - anio));
    }//GEN-LAST:event_botonenviarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonborrar;
    private javax.swing.JButton botonenviar;
    private javax.swing.JTextField cajatextoanio;
    private javax.swing.JTextField cajatextoapellido;
    private javax.swing.JTextField cajatextonombre;
    private javax.swing.JLabel textoapellido;
    private javax.swing.JLabel textodatos;
    private javax.swing.JLabel textofechanac;
    private javax.swing.JLabel textonombre;
    // End of variables declaration//GEN-END:variables
}
