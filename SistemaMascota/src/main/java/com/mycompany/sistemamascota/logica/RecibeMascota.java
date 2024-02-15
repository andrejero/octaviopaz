
package com.mycompany.sistemamascota.logica;


public class RecibeMascota {
    //atributos
    private String nombre_mascota;
    private int edad_mascota;
    private String raza;
    private double tamaño;
    private String nombre_dueño;
    
    
    //metodos
    //metodo constructor
    
    //constructor vacio
    public RecibeMascota() {
    }
    
    //constructor con datos

    public RecibeMascota(String nombre_mascota, int edad_mascota, String raza, double tamaño, String nombre_dueño) {
        this.nombre_mascota = nombre_mascota;
        this.edad_mascota = edad_mascota;
        this.raza = raza;
        this.tamaño = tamaño;
        this.nombre_dueño = nombre_dueño;
    }
    
    
    //getters and setters, forma en la que se buscan y consultan datos

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public int getEdad_mascota() {
        return edad_mascota;
    }

    public void setEdad_mascota(int edad_mascota) {
        this.edad_mascota = edad_mascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre_dueño() {
        return nombre_dueño;
    }

    public void setNombre_dueño(String nombre_dueño) {
        this.nombre_dueño = nombre_dueño;
    }
    
    
   //crear metodo que nos permita visualizar todos los datos
    
   public void mostrarDato(){
        System.out.println("nombre mascota:" + this.nombre_mascota + "\nedad:" + this.edad_mascota + "\nraza:" + this.raza + "\ntamaño:" + this.tamaño + "\nnombre dueño:" + this.nombre_dueño);
   }
    
    
    
    
}
