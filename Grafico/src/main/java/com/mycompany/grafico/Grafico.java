

package com.mycompany.grafico;


public class Grafico {

    public static void main(String[] args) {
        Dialogo dialogo1=new Dialogo();
        dialogo1.metodo();
        
        //Ventana ventana1=new Ventana();
        //ventana1.ventana();
        
        Componentes ventanaCom=new Componentes();
        ventanaCom.componentes();
        
        //Extendida ventana1= new Extendida();
        //ventana1.extendida();
        
        Ventana2 ventana= new Ventana2();
        ventana.setVisible(true);
        ventana.setTitle("Ventana1");
        ventana.setLocationRelativeTo(null);
        
        //Ejercicio ventana = new Ejercicio();
        //ventana.setVisible(true);
        //ventana.setTitle("Datos");
        //ventana.setLocationRelativeTo(null);
        
        Calculadora calc = new Calculadora();
        calc.setVisible(true);
        calc.setTitle("Calculadora");
        calc.setLocationRelativeTo(null);
        
    }
}
