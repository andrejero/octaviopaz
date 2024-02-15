
package com.mycompany.sistemadeempleados.Logica;

import com.mycompany.sistemadeempleados.Persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    ControladoraPersistencia controlpersi = new ControladoraPersistencia();

    public void guardar(String text, String text0, String text1, String text2, String text3, String genero) {
        Empleado empleado = new Empleado ();
        empleado.setNombre_empleado(text);
        empleado.setTelefono(text0);
        empleado.setDireccion(text1);
        empleado.setCorreo(text2);
        empleado.setFecha_nacimiento(text3);
        empleado.setGenero(genero);
        
        controlpersi.guardar(empleado);
    }

    
    
}
