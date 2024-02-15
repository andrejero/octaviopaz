
package com.mycompany.sistemadeempleados.Persistencia;

import com.mycompany.sistemadeempleados.Logica.Empleado;

public class ControladoraPersistencia {
    EmpleadoJpaController empleadojpa= new EmpleadoJpaController();

    public void guardar(Empleado empleado) {
        empleadojpa.create(empleado);
    }
}
