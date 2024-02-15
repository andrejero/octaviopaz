
package com.mycompany.sistemadeempleados.Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)        
    private int num_empleado;
    private String nombre_empleado,telefono,direccion,correo,genero,fecha_nacimiento;

    public Empleado() {
    }
    
    
    public Empleado(int num_empleado, String nombre_empleado, String telefono, String direccion, String correo, String genero, String fecha_nacimiento) {
        this.num_empleado = num_empleado;
        this.nombre_empleado = nombre_empleado;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    
}
