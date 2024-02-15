
package vacaciones;

import java.util.Scanner;

public class Vacaciones {

    public static void main(String[] args) {
         String nombre,departamento;
         int antiguedad,contador,indice=0;
         
         //declaracion de arrays
        
         String[] nombres = new String[5];
         int[] vacaciones = new int[5];
         
    Scanner entrada=new Scanner(System.in);
    System.out.println("************\n Bienvenido al sistema \n************");
    while ( indice !=5 ){
            
        System.out.println("Ingresa el nombre del trsbajador:");
        nombre = entrada.nextLine();
        nombres[indice] = nombre;
        
        System.out.println("Ingresa el departamento al que pertenece " + nombre + "\n A \n B \n C");
        departamento = entrada.nextLine();
        
        System.out.println("Antiguedad del trabajador " + nombre);
        antiguedad = entrada.nextInt();
        entrada.nextLine();
        
        switch(departamento.toUpperCase()){
            case "A":
                switch(antiguedad){
                    case 1:
                    case 2:   
                        vacaciones[indice] = 5;
                                               
                    break;
                    
                    case 3:
                    case 4:  
                        vacaciones[indice] = 7;
                    break;
                    
                    case 5:
                    case 6:
                    case 7:    
                        vacaciones[indice] = 10;
                    break;
                    
                    case 0:
                        vacaciones[indice] = 0;
                    break;
                    
                    default:
                        vacaciones[indice] = 15;
                    break;    
                        
                }
                
                break;
            case "B":
                switch(antiguedad){
                    case 1:
                    case 2:    
                        vacaciones[indice] = 7;
                    break;
                    
                    case 3:
                    case 4:    
                        vacaciones[indice] = 10;
                    break;
                    
                    case 5:
                    case 6:
                    case 7:    
                        vacaciones[indice] = 13;
                    break;
                    
                    case 0:
                        vacaciones[indice] = 0;
                    break;
                    
                    default:
                        vacaciones[indice] = 17;
                    break;    
                }
                
                break;
            case "C":
                switch(antiguedad){
                    case 1:
                    case 2:    
                        vacaciones[indice] = 7;
                    break;
                    
                    case 3:
                    case 4:    
                        vacaciones[indice] = 10;
                    break;
                    
                    case 5:
                    case 6:
                    case 7:    
                        vacaciones[indice] = 15;
                    break;
                    
                    case 0:
                        vacaciones[indice] = 0;
                    break;    
                    
                    default:
                        vacaciones[indice] = 20;
                    break;    
                }
                break;
            default:
                System.out.println("Departamento no existente");
        }
        
             //System.out.println("a " + nombres[indice] + " le corresponden " + vacaciones[indice] + " dias de vacaciones");
             
        indice++;
        
        }
        
        for(int i=0; i<nombres.length; i++){
            System.out.println("Nombre         Dias de vacaciones");
            System.out.println(nombres[i] +  "        " + vacaciones[i]);
            
        }
        

     


       
    }
    
}
