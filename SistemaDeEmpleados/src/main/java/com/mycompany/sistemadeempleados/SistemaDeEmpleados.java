
package com.mycompany.sistemadeempleados;

import com.mycompany.sistemadeempleados.GUI.Principal;

public class SistemaDeEmpleados {

    public static void main(String[] args) {
        Principal ventana = new Principal();
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setTitle("Sistema de Registro");
        ventana.setLocationRelativeTo(null);
    }
}
