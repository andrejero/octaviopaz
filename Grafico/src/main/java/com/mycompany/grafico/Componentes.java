
package com.mycompany.grafico;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Componentes {
    public void componentes(){
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Ventana con componentes");
        miVentana.setSize(500,400);
        miVentana.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("nombre");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Salida");
        miVentana.add(etiqueta);
        miVentana.add(texto);
        miVentana.add(boton);
        
        
        miVentana.setVisible(true);
        
    }
    
}
