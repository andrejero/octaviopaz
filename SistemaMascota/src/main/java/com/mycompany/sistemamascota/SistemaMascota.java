package com.mycompany.sistemamascota;

import com.mycompany.sistemamascota.logica.RecibeMascota;
import java.util.ArrayList;


public class SistemaMascota {

    public static void main(String[] args) {
        
        //creamos objeto del constructor vacio
        RecibeMascota mascota1=new RecibeMascota();
        mascota1.setNombre_mascota("Boby");
        mascota1.setEdad_mascota(4);
        mascota1.setRaza("Chihuahua");
        mascota1.setTamaño(17.3);
        mascota1.setNombre_dueño("Juan Perez");
        
        //metodo que muestra todos los datos
        mascota1.mostrarDato();
        
        RecibeMascota mascota2=new RecibeMascota("Toby", 6, "pug", 10.5, "Lupita");
        
        mascota2.mostrarDato();
        
        //declaramos el arraylist
        ArrayList<RecibeMascota> mascotas =new ArrayList<>();
        
        mascotas.add(0,mascota1);
        mascotas.add(1, mascota2);
        
        System.out.println("mascotas registradas:" + mascotas.size());
        
        
        
    }
}
