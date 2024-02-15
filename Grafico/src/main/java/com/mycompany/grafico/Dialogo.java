
package com.mycompany.grafico;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Dialogo {
    
    public void metodo(){
        //showMessageDialog
        JFrame dialogo1 = new JFrame();
        JOptionPane.showMessageDialog(dialogo1, "Bienvenido a la parte gráfica.");
        
        //showInputDialog
        JFrame dialogo2 = new JFrame();
        String nombre=JOptionPane.showInputDialog(dialogo2, "Ingresa tu nombre");
        
        JOptionPane.showMessageDialog(dialogo2,"Bienvenido/a " + nombre);
        
        //showConfirmDialog
        JFrame dialogo3 = new JFrame();
        int resultado=JOptionPane.showConfirmDialog(dialogo3, "Presiona un botón.");
        if(resultado==0){
            JOptionPane.showMessageDialog(dialogo3, "Presionaste SI");
        }else{
            JOptionPane.showConfirmDialog(dialogo3,"Presionaste NO");
        }
    }
    
}
