
package colecciones;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ordenamiento {
    
    public void metodo(){
    //creamos el arreglo
    Scanner entrada= new Scanner (System.in);
    
    int [] arreglo;
    int n_elementos, posicion, auxiliar;
    
    n_elementos = Integer.parseInt(JOptionPane.showInputDialog("¿de cuantos numeros quieres el arreglo?"));
    arreglo=new int[n_elementos];
    
    //for para el arreglo
    for(int i=0; i<arreglo.length; i++){
        System.out.println("ingresa un número para la posicion" + (i+1) + "del arreglo");
        arreglo[i]=entrada.nextInt();
    }
    
    //metodo de burbuja
    for(int i=0; i<(n_elementos -1); i++){
        for(int j=0; j<(n_elementos -1); j++){
            if(arreglo[j]>arreglo[j+1]){
                auxiliar=arreglo[j];
                arreglo[j]=arreglo[j+1];
                arreglo[j+1]=auxiliar;
            }
        }
    }
    
    //visualizamos
        
    for(int i=0; i<arreglo.length; i++){
        System.out.println(arreglo[i]);
    }
    
    //arreglo visualizado pero en descendente
    
    //------------------------------------------------------------------------
    
    //metodo por inserción
    for(int i=0; i<n_elementos; i++){
        posicion=i;
        auxiliar=arreglo[i];
        while((posicion>0) && (arreglo[posicion -1]>auxiliar)){
            arreglo[posicion]=arreglo[posicion -1];
            posicion --;
            
        }
        arreglo[posicion]=auxiliar;
    }
    
        
    for(int i=0; i<arreglo.length; i++){
        System.out.println(arreglo[i]);
    }
    
    
}
    
}
